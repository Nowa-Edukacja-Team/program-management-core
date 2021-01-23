package pwr.newEducation.domain.studyPlan;

import javax.persistence.*;

@Entity
public class DeficitJPA {
    @Id
    @GeneratedValue
    private long idDeficit;
    public int semester;
    public int limitS;

    @ManyToOne
    public StudyPlanJPA studyPlan;

    public long getIdDeficit() {
        return idDeficit;
    }

    public int getSemester() {
        return semester;
    }

    public int getLimit() {
        return limitS;
    }

    public StudyPlanJPA getStudyPlanJPA() {
        return studyPlan;
    }

    public DeficitJPA() {}
}
