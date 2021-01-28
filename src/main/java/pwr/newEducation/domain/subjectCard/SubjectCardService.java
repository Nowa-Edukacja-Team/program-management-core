package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.pagination.PaginationEntity;

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

    PaginationEntity<SubjectCardEntity> getAllSubjectCards(int pageIndex, int pageSize) {
        return subjectCardRepository.getAllSubjectCards(pageIndex, pageSize);
    }

    List<SubjectCardEntity> getSubjectCardsForStudyPrograms(int pageIndex, int pageSize, long studyProgramId){
        return subjectCardRepository.getSubjectCardsForStudyPrograms(pageIndex, pageSize, studyProgramId);
    }
}
