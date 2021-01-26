package pwr.newEducation.domain.studyPlan;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class StudyPlanDTOMapper {
    @Inject
    DeficitDTOMapper deficitDTOMapper;

    public StudyPlanDTO toDTO(StudyPlanEntity studyPlanEntity) {
        return StudyPlanDTO.builder(studyPlanEntity.getCreatedDate(), studyPlanEntity.getValid(),
                studyPlanEntity.getIsCurrent())
                .withDeficits(studyPlanEntity.getDeficits().stream().map(deficitDTOMapper::toDTO).collect(Collectors.toList()))
                .withIdStudyPlan(studyPlanEntity.getIdStudyPlan())
                .withIdStudyProgram(studyPlanEntity.getIdStudyProgram())
                .withUpdatedDate(studyPlanEntity.getUpdatedDate())
                .withVersion(studyPlanEntity.getVersion())
                .build();
    }

    public StudyPlanEntity toEntity(StudyPlanDTO studyPlanDTO) {
        return StudyPlanEntity.builder(studyPlanDTO.getCreatedDate(), studyPlanDTO.getValid(),
                studyPlanDTO.getIsCurrent())
                .withDeficits(studyPlanDTO.getDeficits().stream().map(deficitDTOMapper::toEntity).collect(Collectors.toSet()))
                .withIdStudyPlan(studyPlanDTO.getIdStudyPlan())
                .withIdStudyProgram(studyPlanDTO.getIdStudyProgram())
                .withUpdatedDate(studyPlanDTO.getUpdatedDate())
                .withVersion(studyPlanDTO.getVersion())
                .build();
    }
}
