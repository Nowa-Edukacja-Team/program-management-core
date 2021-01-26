package pwr.newEducation.domain.studyPlan;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeficitDTO {
    @JsonProperty("id")
    private long id;
    
    @JsonProperty("semester")
    private int semester;

    @JsonProperty("limit")
    private int limitECTS;

    public long getIdDeficit() {
        return id;
    }

    public int getSemester() {
        return semester;
    }

    public int getLimitECTS() {
        return limitECTS;
    }

    DeficitDTO(Builder builder) {
        id = builder.id;
        semester = builder.semester;
        limitECTS = builder.limitECTS;
    }

    public static Builder builder(int semester, int limitECTS) {
        return new Builder(semester, limitECTS);
    }

    public static class Builder {
        private long id;
        private int semester;
        private int limitECTS;

        Builder(int semester, int limitECTS) {
            this.semester = semester;
            this.limitECTS = limitECTS;
        }

        Builder() {}

        public DeficitDTO.Builder withIdDeficit(long id) {
            this.id = id;
            return this;
        }

        public DeficitDTO build() {
            return new DeficitDTO(this);
        }
    }
}
