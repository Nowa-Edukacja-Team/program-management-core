package pwr.newEducation.domain.studyProgram;

import com.fasterxml.jackson.annotation.JsonProperty;
import pwr.newEducation.domain.learningEffect.LearningEffectDTO;
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
    private List<String> examRanges;

    @JsonProperty("studyPlan")
    private StudyPlanDTO studyPlan;

    @JsonProperty("learningEffects")
    private List<LearningEffectDTO> learningEffect;

    private StudyProgramDTO() {
    }
}
