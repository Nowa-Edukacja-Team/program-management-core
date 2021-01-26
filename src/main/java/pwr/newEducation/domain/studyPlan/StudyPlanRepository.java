package pwr.newEducation.domain.studyPlan;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;

@Dependent
public class StudyPlanRepository implements PanacheRepository<StudyPlanJPA> {
    public StudyPlanJPA getById(long id) {
        return findById(id);
    }
}
