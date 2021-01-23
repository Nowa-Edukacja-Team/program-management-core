package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "StudyProgramJPA")
public class StudyProgramJPA implements Serializable {
    @Id
    @GeneratedValue
    public long idStudyProgram;
    @Id
    public int version;
    public LocalDateTime createdDate;
    public LocalDateTime updatedDate;
    public LocalDateTime validFormDate;
    public boolean isCurrent;

    @Transient
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_study_plan", referencedColumnName = "id_study_plan"),
            @JoinColumn(name = "version", referencedColumnName = "version")
    })
    public StudyPlanJPA studyPlanJPA;

    public int getVersion() {
        return version;
    }

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public LocalDateTime getValidFormDate() {
        return validFormDate;
    }

    public long getIdStudyProgram() {
        return idStudyProgram;
    }

}
