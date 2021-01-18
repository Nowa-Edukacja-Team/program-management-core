package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.StudyProgramEntity;

import java.time.LocalDateTime;
import java.util.List;

public class StudyPlanEntity {
    private long idStudyPlan;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private LocalDateTime validFromDate;
    private List<DeficitEntity> deficitEntities;

    StudyPlanEntity(Builder builder) {
        idStudyPlan = builder.idStudyPlan;
        version = builder.version;
        createdDate = builder.createdDate;
        modifiedDate = builder.modifiedDate;
        validFromDate = builder.validFromDate;
        deficitEntities = builder.deficitEntities;
    }

    public long getIdStudyPlan() {
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

    public List<DeficitEntity> getDeficitEntities() {
        return deficitEntities;
    }

    public void setIdStudyPlan(long idStudyPlan) {
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

    public void setDeficitEntities(List<DeficitEntity> deficitEntities) {
        this.deficitEntities = deficitEntities;
    }

    public static class Builder {
        private long idStudyPlan;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime modifiedDate;
        private LocalDateTime validFromDate;
        private List<DeficitEntity> deficitEntities;

        Builder(StudyPlanEntity studyPlanEntity) {
            idStudyPlan = studyPlanEntity.idStudyPlan;
            version = studyPlanEntity.version;
            createdDate = studyPlanEntity.createdDate;
            modifiedDate = studyPlanEntity.modifiedDate;
            validFromDate = studyPlanEntity.validFromDate;
            deficitEntities = studyPlanEntity.deficitEntities;
        }

        public Builder withIdStudyPlan(long idStudyPlan) {
            this.idStudyPlan = idStudyPlan;
            return this;
        }

        public Builder withVersion(int version) {
            this.version = version;
            return this;
        }

        public Builder withCreatedDate(LocalDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder withModfiedDate(LocalDateTime modfiedDate) {
            this.modifiedDate = modfiedDate;
            return this;
        }

        public Builder withValidFromDate(LocalDateTime validFromDate) {
            this.validFromDate = validFromDate;
            return this;
        }

        public Builder withDeficitEntities(List<DeficitEntity> deficitEntities) {
            this.deficitEntities = deficitEntities;
            return this;
        }
    }
}
