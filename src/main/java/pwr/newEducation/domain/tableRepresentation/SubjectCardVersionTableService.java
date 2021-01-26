package pwr.newEducation.domain.tableRepresentation;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SubjectCardVersionTableService {
    SubjectCardVersionTableRepository subjectCardVersionTableRepository;

    @Inject
    public SubjectCardVersionTableService(SubjectCardVersionTableRepository subjectCardVersionTableRepository) {
        this.subjectCardVersionTableRepository = subjectCardVersionTableRepository;
    }

    List<SubjectCardVersionTableEntity> getAllSubjectCardVersionTables(){
        return subjectCardVersionTableRepository.getAllSubjectCardVersionTables();
    }
}
