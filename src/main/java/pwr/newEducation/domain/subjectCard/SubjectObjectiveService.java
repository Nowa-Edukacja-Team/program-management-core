package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SubjectObjectiveService {
    private SubjectObjectiveRepository subjectObjectiveRepository;

    @Inject
    SubjectObjectiveService(SubjectObjectiveRepository subjectObjectiveRepository) {
        this.subjectObjectiveRepository = subjectObjectiveRepository;
    }

    List<SubjectObjectiveEntity> getAllSubjectObjectives() {
        return subjectObjectiveRepository.getAllDisciplines();
    }
}
