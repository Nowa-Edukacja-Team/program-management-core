package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.pagination.PaginationEntity;

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

    PaginationEntity<StudyPlanEntity> getAllStudyPlans(int pageIndex, int pageSize){
        return studyPlanRepository.getAllStudyPlans(pageIndex, pageSize);
    }

    void insertStudyPlan(StudyPlanEntity studyPlan) {
        studyPlanRepository.persist(studyPlanJPAMapper.toJPA(studyPlan));
    }
}
