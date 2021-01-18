package pwr.newEducation.domain.studyPlan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudyPlanJPA {
    @Id
    private String idStudyPlan;
    @Id
    private int version;

    public void setId(String id) {
        this.idStudyPlan = id;
    }

    public String getId() {
        return idStudyPlan;
    }
}
