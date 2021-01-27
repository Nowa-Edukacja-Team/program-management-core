package pwr.newEducation.domain.studyPlan;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class StudyPlanService {
    @Inject
    StudyPlanRepository studyPlanRepository;

    @Inject
    StudyPlanJPAMapper studyPlanJPAMapper;

    public StudyPlanService(StudyPlanRepository studyPlanRepository) {
        this.studyPlanRepository = studyPlanRepository;
    }

    List<StudyPlanEntity> getAllStudyPlans(){
        return studyPlanRepository.getAllStudyPlans();
    }

    void insertStudyPlan(StudyPlanEntity studyPlan) {
        studyPlanRepository.persist(studyPlanJPAMapper.toJPA(studyPlan));
    }
}
