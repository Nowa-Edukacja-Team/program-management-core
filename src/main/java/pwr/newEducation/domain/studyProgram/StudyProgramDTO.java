package pwr.newEducation.domain.studyProgram;

import com.fasterxml.jackson.annotation.JsonProperty;
import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyDTO;
import pwr.newEducation.domain.learningEffect.LearningEffectDTO;
import pwr.newEducation.domain.studyPlan.StudyPlanDTO;

import java.time.LocalDateTime;
import java.util.*;

public class StudyProgramDTO {
    @JsonProperty("id")
    private long id;

    @JsonProperty("version")
    private int version;

    @JsonProperty("createdDate")
    private LocalDateTime createdDate;

    @JsonProperty("updatedDate")
    private LocalDateTime updatedDate;

    @JsonProperty("valid")
    private LocalDateTime valid;

    @JsonProperty("examRanges")
    private List<ExamRangeDTO> examRanges;

    @JsonProperty("studyPlan")
    private StudyPlanDTO studyPlan;

    @JsonProperty("learningEffects")
    private List<LearningEffectDTO> learningEffect;

    @JsonProperty("fieldOfStudy")
    private FieldOfStudyDTO fieldOfStudy;

    @JsonProperty("modules")
    private List<ModuleDTO> modules;

    @JsonProperty("isCurrent")
    private boolean isCurrent;

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

    public Optional<StudyPlanDTO> getStudyPlan() {
        return Optional.ofNullable(studyPlan);
    }

    public List<ExamRangeDTO> getExamRange() {
        return Optional.of(examRanges).orElseGet(Collections::emptyList);
    }

    public Optional<FieldOfStudyDTO> getFieldOfStudy() {
        return Optional.of(fieldOfStudy);
    }

    public List<ModuleDTO> getModules() {
        return Optional.ofNullable(modules).orElseGet(Collections::emptyList);
    }

    public List<LearningEffectDTO> getLearningEffect() {
        return Optional.of(learningEffect).orElseGet(Collections::emptyList);
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime valid, boolean isCurrent) {
        return new Builder(createdDate, valid, isCurrent);
    }

    public StudyProgramDTO(){ }

    StudyProgramDTO(StudyProgramDTO.Builder builder) {
        id = builder.id;
        version = builder.version;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        valid = builder.valid;
        isCurrent = builder.isCurrent;
        studyPlan = builder.studyPlan;
        examRanges = builder.examRange;
        fieldOfStudy = builder.fieldOfStudy;
        modules = builder.modules;
        learningEffect = builder.learningEffect;
    }

    public static class Builder {
        private long id;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime valid;
        private boolean isCurrent;
        private StudyPlanDTO studyPlan;
        private List<ExamRangeDTO> examRange;
        private FieldOfStudyDTO fieldOfStudy;
        private List<ModuleDTO> modules;
        private List<LearningEffectDTO> learningEffect;

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

        public Builder withFieldOfStudy(FieldOfStudyDTO fieldOfStudy) {
            this.fieldOfStudy = fieldOfStudy;
            return this;
        }

        public Builder withModules(List<ModuleDTO> modules) {
            this.modules = modules;
            return this;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyPlan(StudyPlanDTO studyPlan) {
            this.studyPlan = studyPlan;
            return this;
        }

        public Builder withExamRange(List<ExamRangeDTO> examRange) {
            this.examRange = examRange;
            return this;
        }

        public Builder withLearningEffects(List<LearningEffectDTO> learningEffects) {
            this.learningEffect = learningEffects;
            return this;
        }

        public StudyProgramDTO build() {
            return new StudyProgramDTO(this);
        }
    }
}
