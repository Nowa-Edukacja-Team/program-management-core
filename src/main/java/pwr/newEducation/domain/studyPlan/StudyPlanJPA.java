package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table()
public class StudyPlanJPA implements Serializable {
    @Id
    @GeneratedValue
    public String idStudyPlan;
    @Id
    public int version;
    public LocalDateTime createdDate;
    public LocalDateTime modifiedDate;
    public LocalDateTime validFromDate;
    public boolean isCurrent;

    @Transient
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_study_plan", referencedColumnName = "id_study_plan"),
            @JoinColumn(name = "version", referencedColumnName = "version")
    })
    public DeficitJPA deficitJPA;

    @Transient
    @OneToMany(mappedBy = "id_study_plan")
    public StudyProgramJPA studyProgramJPA;

    public String getIdStudyPlan() {
        return idStudyPlan;
    }

    public int getVersion() {
        return version;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public LocalDateTime getValidFromDate() {
        return validFromDate;
    }

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public DeficitJPA getDeficitJPA() {
        return deficitJPA;
    }

    public StudyProgramJPA getStudyProgramJPA() {
        return studyProgramJPA;
    }

    public void setIdStudyPlan(String idStudyPlan) {
        this.idStudyPlan = idStudyPlan;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setValidFromDate(LocalDateTime validFromDate) {
        this.validFromDate = validFromDate;
    }

    public void setIsCurrent(boolean current) {
        isCurrent = current;
    }

    public void setDeficitJPA(DeficitJPA deficitJPA) {
        this.deficitJPA = deficitJPA;
    }

    public void setStudyProgramJPA(StudyProgramJPA studyProgramJPA) {
        this.studyProgramJPA = studyProgramJPA;
    }
}
