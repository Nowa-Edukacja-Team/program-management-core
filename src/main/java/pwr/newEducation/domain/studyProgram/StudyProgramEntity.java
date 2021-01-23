package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.learningEffect.LearningEffectEntity;
import pwr.newEducation.domain.studyPlan.StudyPlanEntity;
import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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

    public static Builder builder(long idStudyProgram, int version, LocalDateTime createdDate, LocalDateTime validFormDate,
                                  boolean isCurrent) {
        return new Builder(idStudyProgram, version, createdDate, validFormDate, isCurrent);
    }

    public static class Builder {
        private long idStudyProgram;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFormDate;
        private boolean isCurrent;
        private List<String> examRanges;
        private StudyPlanEntity studyPlanEntity;
        private List<LearningEffectEntity> learningEffectEntities;

        Builder(long idStudyProgram, int version, LocalDateTime createdDate, LocalDateTime validFormDate,
                boolean isCurrent) {
            this.idStudyProgram = idStudyProgram;
            this.version = version;
            this.createdDate = createdDate;
            this.validFormDate = validFormDate;
            this.isCurrent = isCurrent;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyPlanEntity(StudyPlanEntity studyPlanEntity) {
            this.studyPlanEntity= studyPlanEntity;
            return this;
        }

        public Builder withExamRangeEntities(List<String> examRangeEntities) {
            this.examRanges = examRangeEntities;
            return this;
        }

        public StudyProgramEntity build() {
            return new StudyProgramEntity(this);
        }
    }
}
