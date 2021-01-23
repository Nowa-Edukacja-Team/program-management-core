package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.ExamRangeJPA;
import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class StudyPlanJPA implements Serializable {
    @Id
    @GeneratedValue
    private long idStudyPlan;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime validFromDate;
    private boolean isCurrent;

    @OneToMany
    private Set<DeficitJPA> deficits;

    @OneToOne
    private StudyProgramJPA studyProgram;

    public long getIdStudyPlan() {
        return idStudyPlan;
    }

    public int getVersion() {
        return version;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public LocalDateTime getValidFromDate() {
        return validFromDate;
    }

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public Set<DeficitJPA> getDeficits() {
        return deficits;
    }

    public StudyProgramJPA getStudyProgram() {
        return studyProgram;
    }

    public StudyPlanJPA() {}

    StudyPlanJPA(Builder builder) {
        idStudyPlan = builder.idStudyPlan;;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        validFromDate = builder.validFormDate;
        isCurrent = builder.isCurrent;
        studyProgram = builder.studyProgram;
        deficits = builder.deficits;
    }

    public static class Builder {
        private long idStudyPlan;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFormDate;
        private boolean isCurrent;
        private StudyProgramJPA studyProgram;
        private Set<DeficitJPA> deficits;

        Builder() {}

        Builder(long idStudyPlan, int version, LocalDateTime createdDate, LocalDateTime validFormDate,
                boolean isCurrent) {
            this.idStudyPlan = idStudyPlan;
            this.version = version;
            this.createdDate = createdDate;
            this.validFormDate = validFormDate;
            this.isCurrent = isCurrent;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyProgram(StudyProgramJPA studyProgram) {
            this.studyProgram = studyProgram;
            return this;
        }

        public Builder withDeficits(Set<DeficitJPA> deficits) {
            this.deficits = deficits;
            return this;
        }

        public StudyPlanJPA build() {
            return new StudyPlanJPA(this);
        }
    }
}
