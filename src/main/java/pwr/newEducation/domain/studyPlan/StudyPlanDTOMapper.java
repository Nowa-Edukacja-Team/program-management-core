package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.StudyProgramDTOMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class StudyPlanDTOMapper {
    @Inject
    DeficitDTOMapper deficitDTOMapper;

    @Inject
    StudyProgramDTOMapper studyProgramDTOMapper;

    public StudyPlanDTO toDTO(StudyPlanEntity studyPlanEntity) {
        return StudyPlanDTO.builder(studyPlanEntity.getCreatedDate(), studyPlanEntity.getValid(),
                studyPlanEntity.getIsCurrent())
                .withDeficits(studyPlanEntity.getDeficits().stream().map(deficitDTOMapper::toDTO).collect(Collectors.toList()))
                .withIdStudyPlan(studyPlanEntity.getIdStudyPlan())
                .withStudyProgram(studyProgramDTOMapper.toDTO(studyPlanEntity.getStudyProgram()))
                .withUpdatedDate(studyPlanEntity.getUpdatedDate())
                .withVersion(studyPlanEntity.getVersion())
                .build();
    }

    public StudyPlanEntity toEntity(StudyPlanDTO studyPlanDTO) {
        return StudyPlanEntity.builder(studyPlanDTO.getCreatedDate(), studyPlanDTO.getValid(),
                studyPlanDTO.getIsCurrent())
                .withDeficits(studyPlanDTO.getDeficits().stream().map(deficitDTOMapper::toEntity).collect(Collectors.toSet()))
                .withIdStudyPlan(studyPlanDTO.getIdStudyPlan())
                .withStudyProgram(studyProgramDTOMapper.toEntity(studyPlanDTO.getStudyProgram()))
                .withUpdatedDate(studyPlanDTO.getUpdatedDate())
                .withVersion(studyPlanDTO.getVersion())
                .build();
    }
}
