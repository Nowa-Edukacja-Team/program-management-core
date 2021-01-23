package pwr.newEducation.domain.studyPlan;

import javax.persistence.*;

@Entity
@Table
public class DeficitJPA {
    @Id
    public int semester;
    public int limit;

    @Transient
    @ManyToOne
    public StudyPlanJPA studyPlanJPA;

    public int getSemester() {
        return semester;
    }

    public int getLimit() {
        return limit;
    }

    public StudyPlanJPA getStudyPlanJPA() {
        return studyPlanJPA;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setStudyPlanJPA(StudyPlanJPA studyPlanJPA) {
        this.studyPlanJPA = studyPlanJPA;
    }
}
