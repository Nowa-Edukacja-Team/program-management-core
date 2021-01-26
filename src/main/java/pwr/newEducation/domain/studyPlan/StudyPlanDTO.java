package pwr.newEducation.domain.studyPlan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class StudyPlanDTO {
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

    @JsonProperty("deficitEntities")
    private List<DeficitDTO> deficits;

    @JsonProperty("studyProgram")
    private long idStudyProgram;
    
    @JsonProperty("isCurrent")
    private boolean isCurrent;
    
    public long getIdStudyPlan() {
        return id;
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

    public LocalDateTime getValid() {
        return valid;
    }

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public List<DeficitDTO> getDeficits() {
        return deficits;
    }

    public long getIdStudyProgram() {
        return idStudyProgram;
    }

    public StudyPlanDTO() {}

    StudyPlanDTO(Builder builder) {
        id = builder.id;
        version = builder.version;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        valid = builder.valid;
        isCurrent = builder.isCurrent;
        idStudyProgram = builder.idStudyProgram;
        deficits = builder.deficits;
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime valid, boolean isCurrent) {
        return new Builder(createdDate, valid, isCurrent);
    }

    public static class Builder {
        private long id;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime valid;
        private boolean isCurrent;
        private long idStudyProgram;
        private List<DeficitDTO> deficits;

        Builder() {}

        Builder(LocalDateTime createdDate, LocalDateTime valid, boolean isCurrent) {
            this.createdDate = createdDate;
            this.valid = valid;
            this.isCurrent = isCurrent;
        }

        public Builder withIdStudyPlan(long id) {
            this.id = id;
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

        public Builder withIdStudyProgram(long idStudyProgram) {
            this.idStudyProgram = idStudyProgram;
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
