package pwr.newEducation.domain.searchRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Page;
import pwr.newEducation.domain.studyPlan.StudyPlanJPA;
import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class StudyPlanItemDataRepository implements PanacheRepository<StudyPlanJPA> {
    StudyPlanToItemDataMapper studyPlanToItemDataMapper;

    @Inject
    public StudyPlanItemDataRepository(StudyPlanToItemDataMapper studyPlanToItemDataMapper) {
        this.studyPlanToItemDataMapper = studyPlanToItemDataMapper;
    }

    public List<ItemDataEntity> getListOfIds(int pageIndex, int pageSize) {
        PanacheQuery<StudyPlanJPA> query = findAll();
        query.page(Page.ofSize(pageSize));
        return query.page(pageIndex, pageSize).stream()
                .map(studyPlanToItemDataMapper::toEntity).collect(Collectors.toList());
    }
}
