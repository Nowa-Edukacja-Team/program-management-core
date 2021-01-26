package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyDTOMapper;
import pwr.newEducation.domain.studyPlan.StudyPlanDTOMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class StudyProgramDTOMapper {
    @Inject
    ExamRangeDTOMapper examRangeDTOMapper;

    @Inject
    ModuleDTOMapper moduleDTOMapper;

    @Inject
    FieldOfStudyDTOMapper fieldOfStudyDTOMapper;

    @Inject
    StudyPlanDTOMapper studyPlanDTOMapper;

    public StudyProgramDTO toDTO(StudyProgramEntity studyProgramEntity) {
        return StudyProgramDTO.builder(studyProgramEntity.getCreatedDate(), studyProgramEntity.getValid(),
                studyProgramEntity.getIsCurrent())
                .withExamRange(studyProgramEntity.getExamRange().stream().map(examRangeDTOMapper::toDTO).collect(Collectors.toList()))
                .withFieldOfStudy(fieldOfStudyDTOMapper.toDTO(studyProgramEntity.getFieldOfStudy()))
                .withIdStudyProgram(studyProgramEntity.getIdStudyProgram())
                .withModules(studyProgramEntity.getModules().stream().map(moduleDTOMapper::toDTO).collect(Collectors.toSet()))
                .withStudyPlan(studyPlanDTOMapper.toDTO(studyProgramEntity.getStudyPlan()))
                .withUpdatedDate(studyProgramEntity.getUpdatedDate())
                .withVersion(studyProgramEntity.getVersion())
                .build();
    }

    public StudyProgramEntity toEntity(StudyProgramDTO studyProgramDTO) {
        return StudyProgramEntity.builder(studyProgramDTO.getCreatedDate(), studyProgramDTO.getValid(),
                studyProgramDTO.getIsCurrent())
                .withExamRange(studyProgramDTO.getExamRange().stream().map(examRangeDTOMapper::toEntity).collect(Collectors.toSet()))
                .withFieldOfStudy(fieldOfStudyDTOMapper.toEntity(studyProgramDTO.getFieldOfStudy()))
                .withIdStudyProgram(studyProgramDTO.getIdStudyProgram())
                .withVersion(studyProgramDTO.getVersion())
                .withModules(studyProgramDTO.getModules().stream().map(moduleDTOMapper::toEntity).collect(Collectors.toSet()))
                .withUpdatedDate(studyProgramDTO.getUpdatedDate())
                .withStudyPlan(studyPlanDTOMapper.toEntity(studyProgramDTO.getStudyPlan().orElse(null)))
                .build();
    }
}