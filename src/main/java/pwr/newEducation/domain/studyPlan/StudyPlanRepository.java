package pwr.newEducation.domain.studyPlan;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class StudyPlanRepository implements PanacheRepository<StudyPlanJPA> {
    private StudyPlanJPAMapper studyPlanJPAMapper;

    @Inject
    public StudyPlanRepository(StudyPlanJPAMapper studyPlanJPAMapper) {
        this.studyPlanJPAMapper = studyPlanJPAMapper;
    }

    public List<StudyPlanEntity> getAllStudyPlans() {
        return streamAll().map(studyPlanJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}
