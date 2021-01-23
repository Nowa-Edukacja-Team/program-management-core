package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.StudyProgramEntity;

import java.time.LocalDateTime;;
import java.util.Set;

public class StudyPlanEntity {
    private long idStudyPlan;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime validFromDate;
    private boolean isCurrent;
    private Set<DeficitEntity> deficits;
    private StudyProgramEntity studyProgram;

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

    public Set<DeficitEntity> getDeficits() {
        return deficits;
    }

    public StudyProgramEntity getStudyProgram() {
        return studyProgram;
    }

    public StudyPlanEntity() {}

    StudyPlanEntity(Builder builder) {
        idStudyPlan = builder.idStudyPlan;;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        validFromDate = builder.validFormDate;
        isCurrent = builder.isCurrent;
        studyProgram = builder.studyProgram;
        deficits = builder.deficits;
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime validFormDate, boolean isCurrent) {
        return new Builder(createdDate, validFormDate, isCurrent);
    }

    public static class Builder {
        private long idStudyPlan;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFormDate;
        private boolean isCurrent;
        private StudyProgramEntity studyProgram;
        private Set<DeficitEntity> deficits;

        Builder() {}

        Builder(LocalDateTime createdDate, LocalDateTime validFormDate, boolean isCurrent) {
            this.createdDate = createdDate;
            this.validFormDate = validFormDate;
            this.isCurrent = isCurrent;
        }

        public Builder withIdStudyPlan(long idStudyPlan) {
            this.idStudyPlan = idStudyPlan;
            return this;
        }

        public Builder withVersion(int version) {
            this.version = version;
            return this;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyProgram(StudyProgramEntity studyProgram) {
            this.studyProgram = studyProgram;
            return this;
        }

        public Builder withDeficits(Set<DeficitEntity> deficits) {
            this.deficits = deficits;
            return this;
        }

        public StudyPlanEntity build() {
            return new StudyPlanEntity(this);
        }
    }
}
