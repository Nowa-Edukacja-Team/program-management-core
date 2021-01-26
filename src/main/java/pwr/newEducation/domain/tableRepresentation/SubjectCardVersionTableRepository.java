package pwr.newEducation.domain.tableRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectCardVersionTableRepository implements PanacheRepository<SubjectCardJPA> {
    SubjectCardVersionTableJPAMapper subjectCardVersionTableJPAMapper;

    @Inject
    public SubjectCardVersionTableRepository(SubjectCardVersionTableJPAMapper subjectCardVersionTableJPAMapper) {
        this.subjectCardVersionTableJPAMapper = subjectCardVersionTableJPAMapper;
    }

    public List<SubjectCardVersionTableEntity> getAllSubjectCardVersionTables(){
        return streamAll().map(subjectCardVersionTableJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}
