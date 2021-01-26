package pwr.newEducation.domain.tableRepresentation;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SubjectCardTableService {
    SubjectCardTableRepository subjectCardTableRepository;

    @Inject
    public SubjectCardTableService(SubjectCardTableRepository subjectCardTableRepository) {
        this.subjectCardTableRepository = subjectCardTableRepository;
    }

    List<SubjectCardTableEntity> getAllSubjectCardTables() {
        return subjectCardTableRepository.getAllSubjectCardTables();
    }
}
