package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyJPA;
import pwr.newEducation.domain.learningEffect.LearningEffectJPA;
import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class StudyProgramJPA implements Serializable {
    @Id
    @GeneratedValue
    private long idStudyProgram;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime validFromDate;
    private boolean isCurrent;

    @OneToOne
    private StudyPlanJPA studyPlan;

    @OneToMany
    private Set<ExamRangeJPA> examRange;

    @ManyToOne
    private FieldOfStudyJPA fieldOfStudy;

    @ManyToMany
    private Set<ModuleJPA> modules;

    @ManyToMany
    private Set<LearningEffectJPA> learningEffects;

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

    public StudyPlanJPA getStudyPlan() {
        return studyPlan;
    }

    public Set<ExamRangeJPA> getExamRange() {
        return examRange;
    }

    public FieldOfStudyJPA getFieldOfStudy() {
        return fieldOfStudy;
    }

    public Set<ModuleJPA> getModules() {
        return modules;
    }

    public Set<LearningEffectJPA> getLearningEffects() {
        return learningEffects;
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime validFromDate, boolean isCurrent) {
        return new Builder(createdDate, validFromDate, isCurrent);
    }

    public StudyProgramJPA(){ }

    StudyProgramJPA(Builder builder) {
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
        learningEffects = builder.learningEffects;
    }

    public static class Builder {
        private long idStudyProgram;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFromDate;
        private boolean isCurrent;
        private StudyPlanJPA studyPlan;
        private Set<ExamRangeJPA> examRange;
        private FieldOfStudyJPA fieldOfStudy;
        private Set<ModuleJPA> modules;
        private Set<LearningEffectJPA> learningEffects;

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

        public Builder withFieldOfStudy(FieldOfStudyJPA fieldOfStudy) {
            this.fieldOfStudy = fieldOfStudy;
            return this;
        }

        public Builder withModules(Set<ModuleJPA> modules) {
            this.modules = modules;
            return this;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyPlan(StudyPlanJPA studyPlan) {
            this.studyPlan = studyPlan;
            return this;
        }

        public Builder withExamRange(Set<ExamRangeJPA> examRange) {
            this.examRange = examRange;
            return this;
        }

        public StudyProgramJPA build() {
            return new StudyProgramJPA(this);
        }
    }
}
