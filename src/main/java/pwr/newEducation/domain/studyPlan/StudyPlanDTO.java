package pwr.newEducation.domain.studyPlan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class StudyPlanDTO {
    @JsonProperty("idStudyPlan")
    private long idStudyPlan;

    @JsonProperty("version")
    private int version;

    @JsonProperty("createdDate")
    private LocalDateTime createdDate;

    @JsonProperty("modifiedDate")
    private LocalDateTime modifiedDate;

    @JsonProperty("validFromDate")
    private LocalDateTime validFromDate;

    @JsonProperty("deficitEntities")
    private List<DeficitDTO> deficits;

    private StudyPlanDTO() {}
}
