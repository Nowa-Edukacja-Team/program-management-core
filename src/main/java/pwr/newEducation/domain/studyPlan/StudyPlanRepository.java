package pwr.newEducation.domain.studyPlan;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.pagination.PaginationEntity;
import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.stream.Collectors;

@Dependent
public class StudyPlanRepository implements PanacheRepository<StudyPlanJPA> {
    private StudyPlanJPAMapper studyPlanJPAMapper;

    @Inject
    public StudyPlanRepository(StudyPlanJPAMapper studyPlanJPAMapper) {
        this.studyPlanJPAMapper = studyPlanJPAMapper;
    }

    public PaginationEntity<StudyPlanEntity> getAllStudyPlans(int pageIndex, int pageSize) {
        PanacheQuery<StudyPlanJPA> query = findAll().page(pageIndex, pageSize);
        int querySize = (int) streamAll().count();
        return new PaginationEntity<>(pageIndex,
                query.pageCount(),
                querySize,
                query.stream().map(studyPlanJPAMapper::toEntity).collect(Collectors.toList()));
    }

    public StudyPlanJPA getById(long id) {
        return find("id", id).firstResult();
    }
}
