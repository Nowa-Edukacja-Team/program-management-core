package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.learningEffect.LearningEffectEntity;
import pwr.newEducation.domain.studyPlan.StudyPlanEntity;

import java.time.LocalDateTime;
import java.util.List;

public class StudyProgramEntity {
    private final long idStudyProgram;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime validFormDate;
    private StudyPlanEntity studyPlanEntity;
    private List<LearningEffectEntity> learningEffectEntities;
    private List<String> examRanges;

    StudyProgramEntity(Builder builder) {
        idStudyProgram = builder.idStudyProgram;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        validFormDate = builder.validFormDate;
        examRanges = builder.examRanges;
        studyPlanEntity= builder.studyPlanEntity;
        learningEffectEntities = builder.learningEffectEntities;
    }

    public long getIdStudyProgram() {
        return idStudyProgram;
    }

    public LocalDateTime getValidFormDate() {
        return validFormDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public int getVersion() {
        return version;
    }

    public List<LearningEffectEntity> getLearningEffectEntities() {
        return learningEffectEntities;
    }

    public List<String> getExamRanges() {
        return examRanges;
    }

    public StudyPlanEntity getStudyPlanEntity() {
        return studyPlanEntity;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setValidFormDate(LocalDateTime validFormDate) {
        this.validFormDate = validFormDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setExamRanges(List<String> examRanges) {
        this.examRanges = examRanges;
    }

    public void setLearningEffectEntities(List<LearningEffectEntity> learningEffectEntities) {
        this.learningEffectEntities = learningEffectEntities;
    }

    public void setStudyPlanEntity(StudyPlanEntity studyPlanEntity) {
        this.studyPlanEntity = studyPlanEntity;
    }

    public static Builder builder(StudyProgramEntity studyProgramEntity) {
        return new Builder(studyProgramEntity);
    }

    public static class Builder {
        private long idStudyProgram;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFormDate;
        private List<String> examRanges;
        private StudyPlanEntity studyPlanEntity;
        private List<LearningEffectEntity> learningEffectEntities;

        Builder(StudyProgramEntity studyProgramEntity) {
            idStudyProgram = studyProgramEntity.idStudyProgram;
            version = studyProgramEntity.version;
            createdDate = studyProgramEntity.createdDate;
            updatedDate = studyProgramEntity.updatedDate;
            validFormDate = studyProgramEntity.validFormDate;
            examRanges = studyProgramEntity.examRanges;
            studyPlanEntity = studyProgramEntity.studyPlanEntity;
            learningEffectEntities = studyProgramEntity.learningEffectEntities;
        }

        public Builder withIdStudyProgram(long idStudyProgram) {
            this.idStudyProgram = idStudyProgram;
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

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withValidFormDate(LocalDateTime validFormDate) {
            this.validFormDate = validFormDate;
            return this;
        }

        public Builder withStudyPlanEntity(StudyPlanEntity studyPlanEntity) {
            this.studyPlanEntity = studyPlanEntity;
            return this;
        }

        public Builder withExamRanges(List<String> examRanges) {
            this.examRanges = examRanges;
            return this;
        }

        public Builder withLearningEffectEntities(List<LearningEffectEntity> learningEffectEntities) {
            this.learningEffectEntities = learningEffectEntities;
            return this;
        }

        public StudyProgramEntity build() {
            return new StudyProgramEntity(this);
        }
    }
}
