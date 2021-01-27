package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class ExamRangeService {
    private ExamRangeRepository examRangeRepository;

    @Inject
    public ExamRangeService(ExamRangeRepository examRangeRepository) {
        this.examRangeRepository = examRangeRepository;
    }

    List<String> getAllExamRanges(){
        return examRangeRepository.getAllExamRanges();
    }
}
