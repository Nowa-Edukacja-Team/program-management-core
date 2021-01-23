package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyEntity;
import pwr.newEducation.domain.studyPlan.StudyPlanEntity;

import java.time.LocalDateTime;
import java.util.Set;

public class StudyProgramEntity {
    private long idStudyProgram;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime validFromDate;
    private boolean isCurrent;
    private StudyPlanEntity studyPlan;
    private Set<ExamRangeEntity> examRange;
    private FieldOfStudyEntity fieldOfStudy;
    private Set<ModuleEntity> modules;

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

    public LocalDateTime getValidFromDate() {
        return validFromDate;
    }

    public long getIdStudyProgram() {
        return idStudyProgram;
    }

    public StudyPlanEntity getStudyPlan() {
        return studyPlan;
    }

    public Set<ExamRangeEntity> getExamRange() {
        return examRange;
    }

    public FieldOfStudyEntity getFieldOfStudy() {
        return fieldOfStudy;
    }

    public Set<ModuleEntity> getModules() {
        return modules;
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime validFromDate, boolean isCurrent) {
        return new Builder(createdDate, validFromDate, isCurrent);
    }

    public StudyProgramEntity(){ }

    StudyProgramEntity(Builder builder) {
        idStudyProgram = builder.idStudyProgram;;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        validFromDate = builder.validFromDate;
        isCurrent = builder.isCurrent;
        studyPlan = builder.studyPlan;
        examRange = builder.examRange;
        fieldOfStudy = builder.fieldOfStudy;
        modules = builder.modules;
    }

    public static class Builder {
        private long idStudyProgram;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFromDate;
        private boolean isCurrent;
        private StudyPlanEntity studyPlan;
        private Set<ExamRangeEntity> examRange;
        private FieldOfStudyEntity fieldOfStudy;
        private Set<ModuleEntity> modules;

        Builder() {}

        Builder(LocalDateTime createdDate, LocalDateTime validFromDate,
                boolean isCurrent) {
            this.createdDate = createdDate;
            this.validFromDate = validFromDate;
            this.isCurrent = isCurrent;
        }

        public Builder withIdStudyProgram(long idStudyProgram) {
            this.idStudyProgram = idStudyProgram;
            return this;
        }

        public Builder withVersion(int version) {
            this.version = version;
            return this;
        }

        public Builder withFieldOfStudy(FieldOfStudyEntity fieldOfStudy) {
            this.fieldOfStudy = fieldOfStudy;
            return this;
        }

        public Builder withModules(Set<ModuleEntity> modules) {
            this.modules = modules;
            return this;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyPlan(StudyPlanEntity studyPlan) {
            this.studyPlan = studyPlan;
            return this;
        }

        public Builder withExamRange(Set<ExamRangeEntity> examRange) {
            this.examRange = examRange;
            return this;
        }

        public StudyProgramEntity build() {
            return new StudyProgramEntity(this);
        }
    }
}
