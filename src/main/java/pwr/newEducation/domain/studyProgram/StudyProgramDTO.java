package pwr.newEducation.domain.studyProgram;

import com.fasterxml.jackson.annotation.JsonProperty;
import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyDTO;
import pwr.newEducation.domain.learningEffect.LearningEffectDTO;
import pwr.newEducation.domain.studyPlan.StudyPlanDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class StudyProgramDTO {
    @JsonProperty("idStudyProgram")
    private long idStudyProgram;

    @JsonProperty("version")
    private int version;

    @JsonProperty("createdDate")
    private LocalDateTime createdDate;

    @JsonProperty("updatedDate")
    private LocalDateTime updatedDate;

    @JsonProperty("validFromDate")
    private LocalDateTime validFromDate;

    @JsonProperty("examRanges")
    private List<ExamRangeDTO> examRanges;

    @JsonProperty("studyPlan")
    private StudyPlanDTO studyPlan;

    @JsonProperty("learningEffects")
    private List<LearningEffectDTO> learningEffect;

    @JsonProperty("fieldOfStudy")
    private FieldOfStudyDTO fieldOfStudy;

    @JsonProperty("modules")
    private Set<ModuleDTO> modules;

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

    public LocalDateTime getValidFromDate() {
        return validFromDate;
    }

    public long getIdStudyProgram() {
        return idStudyProgram;
    }

    public Optional<StudyPlanDTO> getStudyPlan() {
        return Optional.ofNullable(studyPlan);
    }

    public List<ExamRangeDTO> getExamRange() {
        return examRanges;
    }

    public FieldOfStudyDTO getFieldOfStudy() {
        return fieldOfStudy;
    }

    public Set<ModuleDTO> getModules() {
        return modules;
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime validFromDate, boolean isCurrent) {
        return new Builder(createdDate, validFromDate, isCurrent);
    }

    public StudyProgramDTO(){ }

    StudyProgramDTO(StudyProgramDTO.Builder builder) {
        idStudyProgram = builder.idStudyProgram;;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        validFromDate = builder.validFromDate;
        isCurrent = builder.isCurrent;
        studyPlan = builder.studyPlan;
        examRanges = builder.examRange;
        fieldOfStudy = builder.fieldOfStudy;
        modules = builder.modules;
        learningEffect = builder.learningEffect;
    }

    public static class Builder {
        private long idStudyProgram;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFromDate;
        private boolean isCurrent;
        private StudyPlanDTO studyPlan;
        private List<ExamRangeDTO> examRange;
        private FieldOfStudyDTO fieldOfStudy;
        private Set<ModuleDTO> modules;
        private List<LearningEffectDTO> learningEffect;

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

        public Builder withFieldOfStudy(FieldOfStudyDTO fieldOfStudy) {
            this.fieldOfStudy = fieldOfStudy;
            return this;
        }

        public Builder withModules(Set<ModuleDTO> modules) {
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

        public StudyProgramDTO build() {
            return new StudyProgramDTO(this);
        }
    }
}
