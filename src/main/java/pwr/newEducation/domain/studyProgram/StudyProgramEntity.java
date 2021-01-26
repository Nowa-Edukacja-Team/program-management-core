package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyEntity;
import pwr.newEducation.domain.studyPlan.StudyPlanEntity;

import java.time.LocalDateTime;
import java.util.Set;

public class StudyProgramEntity {
    private long id;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime valid;
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

    public LocalDateTime getValid() {
        return valid;
    }

    public long getIdStudyProgram() {
        return id;
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

    public static Builder builder(LocalDateTime createdDate, LocalDateTime valid, boolean isCurrent) {
        return new Builder(createdDate, valid, isCurrent);
    }

    public StudyProgramEntity(){ }

    StudyProgramEntity(Builder builder) {
        id = builder.id;;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        valid = builder.valid;
        isCurrent = builder.isCurrent;
        studyPlan = builder.studyPlan;
        examRange = builder.examRange;
        fieldOfStudy = builder.fieldOfStudy;
        modules = builder.modules;
    }

    public static class Builder {
        private long id;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime valid;
        private boolean isCurrent;
        private StudyPlanEntity studyPlan;
        private Set<ExamRangeEntity> examRange;
        private FieldOfStudyEntity fieldOfStudy;
        private Set<ModuleEntity> modules;

        Builder() {}

        Builder(LocalDateTime createdDate, LocalDateTime valid,
                boolean isCurrent) {
            this.createdDate = createdDate;
            this.valid = valid;
            this.isCurrent = isCurrent;
        }

        public Builder withIdStudyProgram(long id) {
            this.id = id;
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
