package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyJPA;
import pwr.newEducation.domain.learningEffect.LearningEffectJPA;
import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

@Entity
public class StudyProgramJPA implements Serializable {
    @Id
    @GeneratedValue
    private long idDocument;
    private long id;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime valid;
    private boolean isCurrent;

    @OneToOne
    private StudyPlanJPA studyPlan;

    @OneToMany
    private Set<ExamRangeJPA> examRange;

    @ManyToOne
    private FieldOfStudyJPA fieldOfStudy;

    @ManyToMany
    private Set<LearningEffectJPA> learningEffects;

    public Set<LearningEffectJPA> getLearningEffects() {
        return learningEffects;
    }

    public long getId() {
        return id;
    }

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

    public Optional<StudyPlanJPA> getStudyPlan() {
        return Optional.ofNullable(studyPlan);
    }

    public Set<ExamRangeJPA> getExamRange() {
        return Optional.of(examRange).orElseGet(Collections::emptySet);
    }

    public Optional<FieldOfStudyJPA> getFieldOfStudy() {
        return Optional.of(fieldOfStudy);
    }

    public Set<LearningEffectJPA> getLearningEffect() {
        return Optional.of(learningEffects).orElseGet(Collections::emptySet);
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime valid, boolean isCurrent) {
        return new Builder(createdDate, valid, isCurrent);
    }

    public StudyProgramJPA(){ }

    StudyProgramJPA(Builder builder) {
        id = builder.id;
        version = builder.version;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        valid = builder.valid;
        isCurrent = builder.isCurrent;
        studyPlan = builder.studyPlan;
        examRange = builder.examRange;
        fieldOfStudy = builder.fieldOfStudy;
        learningEffects = builder.learningEffects;
    }

    public static class Builder {
        private long id;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime valid;
        private boolean isCurrent;
        private StudyPlanJPA studyPlan;
        private Set<ExamRangeJPA> examRange;
        private FieldOfStudyJPA fieldOfStudy;
        private Set<LearningEffectJPA> learningEffects;

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

        public Builder withFieldOfStudy(FieldOfStudyJPA fieldOfStudy) {
            this.fieldOfStudy = fieldOfStudy;
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

        public Builder withLearningEffects(Set<LearningEffectJPA> learningEffects) {
            this.learningEffects = learningEffects;
            return this;
        }

        public StudyProgramJPA build() {
            return new StudyProgramJPA(this);
        }
    }
}
