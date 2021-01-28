package pwr.newEducation.domain.subjectCard;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.pagination.PaginationEntity;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectCardRepository implements PanacheRepository<SubjectCardJPA> {
    SubjectCardJPAMapper subjectCardJPAMapper;

    @Inject
    public SubjectCardRepository(SubjectCardJPAMapper subjectCardJPAMapper) {
        this.subjectCardJPAMapper = subjectCardJPAMapper;
    }

    public PaginationEntity<SubjectCardEntity> getAllSubjectCards(int pageIndex, int pageSize) {
        PanacheQuery<SubjectCardJPA> query = findAll().page(pageIndex, pageSize);
        int querySize = (int) streamAll().count();
        return new PaginationEntity<>(pageIndex,
                                    query.pageCount(),
                                    querySize,
                                    query.stream().map(subjectCardJPAMapper::toEntity).collect(Collectors.toList()));
    }

    public List<SubjectCardEntity> getSubjectCardsForStudyPrograms(int pageIndex, int pageSize, long studyProgramId) {
        return find("idStudyProgram", studyProgramId).page(pageIndex, pageSize).stream()
                .map(subjectCardJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}
