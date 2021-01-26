package pwr.newEducation.domain.tableRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.subjectCard.SubjectCardJPA;
import pwr.newEducation.domain.subjectCard.SubjectCardJPAMapper;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectCardTableRepository implements PanacheRepository<SubjectCardJPA> {
    SubjectCardTableJPAMapper subjectCardTableJPAMapper;

    @Inject
    public SubjectCardTableRepository(SubjectCardTableJPAMapper subjectCardTableJPAMapper) {
        this.subjectCardTableJPAMapper = subjectCardTableJPAMapper;
    }

    public List<SubjectCardTableEntity> getAllSubjectCardTables(){
        return streamAll().map(subjectCardTableJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}
