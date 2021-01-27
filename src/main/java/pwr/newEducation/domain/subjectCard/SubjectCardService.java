package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SubjectCardService {
    private SubjectCardRepository subjectCardRepository;

    @Inject
    SubjectCardService(SubjectCardRepository subjectCardRepository) {
        this.subjectCardRepository = subjectCardRepository;
    }

    List<SubjectCardEntity> getAllSubjectCards() {
        return subjectCardRepository.getAllSubjectCards();
    }

    List<SubjectCardEntity> getSubjectCardsForStudyPrograms(int pageIndex, int pageSize, long studyProgramId){
        return subjectCardRepository.getSubjectCardsForStudyPrograms(pageIndex, pageSize, studyProgramId);
    }
}
