package pwr.newEducation.domain.studyPlan;

import com.fasterxml.jackson.annotation.JsonProperty;
import pwr.newEducation.domain.studyProgram.StudyProgramDTO;

import java.time.LocalDateTime;
import java.util.List;

public class StudyPlanDTO {
    @JsonProperty("idStudyPlan")
    private long idStudyPlan;

    @JsonProperty("version")
    private int version;

    @JsonProperty("createdDate")
    private LocalDateTime createdDate;

    @JsonProperty("updatedDate")
    private LocalDateTime updatedDate;

    @JsonProperty("validFromDate")
    private LocalDateTime validFromDate;

    @JsonProperty("deficitEntities")
    private List<DeficitDTO> deficits;

    @JsonProperty("studyProgram")
    private StudyProgramDTO studyProgram;
    
    @JsonProperty("isCurrent")
    private boolean isCurrent;
    
    public long getIdStudyPlan() {
        return idStudyPlan;
    }

    public int getVersion() {
        return version;
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

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public List<DeficitDTO> getDeficits() {
        return deficits;
    }

    public StudyProgramDTO getStudyProgram() {
        return studyProgram;
    }

    public StudyPlanDTO() {}

    StudyPlanDTO(Builder builder) {
        idStudyPlan = builder.idStudyPlan;;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        validFromDate = builder.validFormDate;
        isCurrent = builder.isCurrent;
        studyProgram = builder.studyProgram;
        deficits = builder.deficits;
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime validFormDate, boolean isCurrent) {
        return new Builder(createdDate, validFormDate, isCurrent);
    }

    public static class Builder {
        private long idStudyPlan;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFormDate;
        private boolean isCurrent;
        private StudyProgramDTO studyProgram;
        private List<DeficitDTO> deficits;

        Builder() {}

        Builder(LocalDateTime createdDate, LocalDateTime validFormDate, boolean isCurrent) {
            this.createdDate = createdDate;
            this.validFormDate = validFormDate;
            this.isCurrent = isCurrent;
        }

        public Builder withIdStudyPlan(long idStudyPlan) {
            this.idStudyPlan = idStudyPlan;
            return this;
        }

        public Builder withVersion(int version) {
            this.version = version;
            return this;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyProgram(StudyProgramDTO studyProgram) {
            this.studyProgram = studyProgram;
            return this;
        }

        public Builder withDeficits(List<DeficitDTO> deficits) {
            this.deficits = deficits;
            return this;
        }

        public StudyPlanDTO build() {
            return new StudyPlanDTO(this);
        }
    }
}
