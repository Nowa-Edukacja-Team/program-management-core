package pwr.newEducation.domain.studyPlan;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeficitDTO {
    @JsonProperty("semester")
    private int semester;

    @JsonProperty("limit")
    private int limitECTS;

    public int getSemester() {
        return semester;
    }

    public int getLimitECTS() {
        return limitECTS;
    }

    DeficitDTO(Builder builder) {
        semester = builder.semester;
        limitECTS = builder.limitECTS;
    }

    public static Builder builder(int semester, int limitECTS) {
        return new Builder(semester, limitECTS);
    }

    public static class Builder {
        private int semester;
        private int limitECTS;

        Builder(int semester, int limitECTS) {
            this.semester = semester;
            this.limitECTS = limitECTS;
        }

        Builder() {}

        public DeficitDTO build() {
            return new DeficitDTO(this);
        }
    }
}
