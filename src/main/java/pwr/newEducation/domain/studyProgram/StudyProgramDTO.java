package pwr.newEducation.domain.studyProgram;

import com.fasterxml.jackson.annotation.JsonProperty;
import pwr.newEducation.domain.learningEffect.LearningEffectDTO;
import pwr.newEducation.domain.learningEffect.LearningEffectDTO;
import pwr.newEducation.domain.studyPlan.StudyPlanDTO;
import pwr.newEducation.domain.studyPlan.StudyPlanDTO;

import java.time.LocalDateTime;
import java.util.List;

public class StudyProgramDTO {
    @JsonProperty("idStudyProgram")
    private long idStudyProgram;

    @JsonProperty("version")
    private int version;

    @JsonProperty("createdDate")
    private LocalDateTime createdDate;

    @JsonProperty("updatedDate")
    private LocalDateTime updatedDate;

    @JsonProperty("validFormDate")
    private LocalDateTime validFormDate;

    @JsonProperty("examRanges")
    private List<ExamRangeDTO> examRanges;

    @JsonProperty("studyPlan")
    private StudyPlanDTO studyPlan;

    @JsonProperty("learningEffects")
    private List<LearningEffectDTO> learningEffect;

    private StudyProgramDTO() {
    }

    StudyProgramDTO(Builder builder) {
        this.learningEffect = builder.learningEffectDTOS;
        this.examRanges = builder.examRanges;
        this.validFormDate = builder.validFormDate;
        this.version = builder.version;
        this.createdDate = builder.createdDate;
        this.studyPlan = builder.studyPlanDTO;;
        this.idStudyProgram = builder.idStudyProgram;;
        this.updatedDate = builder.updatedDate;
    }

    StudyProgramDTO (long idStudyProgram, int version, LocalDateTime createdDate, LocalDateTime validFormDate) {

    }

    public static class Builder {
        private long idStudyProgram;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFormDate;
        private List<ExamRangeDTO> examRanges;
        private StudyPlanDTO studyPlanDTO;
        private List<LearningEffectDTO> learningEffectDTOS;

        Builder(long idStudyProgram, int version, LocalDateTime createdDate, LocalDateTime validFormDate) {
            this.idStudyProgram = idStudyProgram;
            this.version = version;
            this.createdDate = createdDate;
            this.validFormDate = validFormDate;
        }

        public StudyProgramDTO.Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public StudyProgramDTO.Builder withValidFormDate(LocalDateTime validFormDate) {
            this.validFormDate = validFormDate;
            return this;
        }

        public StudyProgramDTO.Builder withStudyPlanDTO(StudyPlanDTO studyPlanDTO) {
            this.studyPlanDTO = studyPlanDTO;
            return this;
        }

        public StudyProgramDTO.Builder withExamRanges(List<ExamRangeDTO> examRanges) {
            this.examRanges = examRanges;
            return this;
        }

        public StudyProgramDTO.Builder withLearningEffectEntities(List<LearningEffectDTO> learningEffectEntities) {
            this.learningEffectDTOS = learningEffectEntities;
            return this;
        }

        public StudyProgramDTO build() {
            return new StudyProgramDTO(this);
        }
    }
}
