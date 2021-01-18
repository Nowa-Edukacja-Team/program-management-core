package pwr.newEducation.domain.studyPlan;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeficitDTO {

    @JsonProperty("semester")
    public int semester;

    @JsonProperty("limit")
    public int limit;
}
