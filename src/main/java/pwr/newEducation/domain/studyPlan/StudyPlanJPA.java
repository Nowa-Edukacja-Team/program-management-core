package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table()
public class StudyPlanJPA {
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
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "id_study_plan", referencedColumnName = "id_study_plan"),
            @JoinColumn(name = "version", referencedColumnName = "version")
    })
    public Set<DeficitJPA> deficitJPA;

    @Transient
    @OneToOne(mappedBy = "id_study_plan")
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

    public Set<DeficitJPA> getDeficitJPA() {
        return deficitJPA;
    }

    public StudyProgramJPA getStudyProgramJPA() {
        return studyProgramJPA;
    }
}
