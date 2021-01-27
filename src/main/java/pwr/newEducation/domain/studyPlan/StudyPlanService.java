package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.StudyProgramRepository;

import javax.enterprise.context.Dependent;
import java.util.List;

@Dependent
public class StudyPlanService {
    private StudyPlanRepository studyPlanRepository;

    private StudyProgramRepository studyProgramRepository;

    public StudyPlanService(StudyPlanRepository studyPlanRepository, StudyProgramRepository studyProgramRepository) {
        this.studyPlanRepository = studyPlanRepository;
        this.studyProgramRepository = studyProgramRepository;
    }

    List<StudyPlanEntity> getAllStudyPlans(){
        return studyPlanRepository.getAllStudyPlans();
    }

    List<StudyPlanEntity> getAllStudyPlansForStudyProgramId(long id, int pageIndex, int pageSize) {
        return studyProgramRepository.getAllStudyPlansForStudyProgramId(id, pageIndex, pageSize);
    }
}
