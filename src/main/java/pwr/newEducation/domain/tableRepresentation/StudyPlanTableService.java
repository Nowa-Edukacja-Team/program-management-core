package pwr.newEducation.domain.tableRepresentation;

import pwr.newEducation.domain.studyPlan.StudyPlanEntity;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class StudyPlanTableService {
    StudyPlanTableRepository studyPlanTableRepository;

    @Inject
    public StudyPlanTableService(StudyPlanTableRepository studyPlanTableRepository) {
        this.studyPlanTableRepository = studyPlanTableRepository;
    }

    List<StudyPlanTableEntity> getAllStudyPlanTables() {
        return studyPlanTableRepository.getAllStudyPlanTables();
    }
}
