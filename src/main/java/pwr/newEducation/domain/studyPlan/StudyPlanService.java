package pwr.newEducation.domain.studyPlan;

import javax.enterprise.context.Dependent;
import java.util.List;

@Dependent
public class StudyPlanService {
    private StudyPlanRepository studyPlanRepository;

    public StudyPlanService(StudyPlanRepository studyPlanRepository) {
        this.studyPlanRepository = studyPlanRepository;
    }

    List<StudyPlanEntity> getAllStudyPlans(){
        return studyPlanRepository.getAllStudyPlans();
    }
}
