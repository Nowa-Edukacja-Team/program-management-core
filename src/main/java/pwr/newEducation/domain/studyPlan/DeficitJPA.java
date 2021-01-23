package pwr.newEducation.domain.studyPlan;

import javax.persistence.*;

@Entity
@Table
public class DeficitJPA {
    @Id
    public int semester;
    public int limitValue;

    @Transient
    @OneToMany(mappedBy = "id_study_plan")
    public StudyPlanJPA studyPlanJPA;

    public int getSemester() {
        return semester;
    }

    public int getLimitValue() {
        return limitValue;
    }

    public StudyPlanJPA getStudyPlanJPA() {
        return studyPlanJPA;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setLimitValue(int limitValue) {
        this.limitValue = limitValue;
    }

    public void setStudyPlanJPA(StudyPlanJPA studyPlanJPA) {
        this.studyPlanJPA = studyPlanJPA;
    }
}
