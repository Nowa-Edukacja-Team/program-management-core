package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyDTOMapper;
import pwr.newEducation.domain.studyPlan.StudyPlanDTOMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

@ApplicationScoped
public class StudyProgramDTOMapper {
    @Inject
    StudyProgramToModuleDTOMapper studyProgramToModuleDTOMapper;

    @Inject
    FieldOfStudyDTOMapper fieldOfStudyDTOMapper;

    @Inject
    StudyPlanDTOMapper studyPlanDTOMapper;

    public StudyProgramDTO toDTO(StudyProgramEntity studyProgramEntity) {
        return StudyProgramDTO.builder(studyProgramEntity.getCreatedDate(), studyProgramEntity.getValid(),
                studyProgramEntity.getIsCurrent())
                .withExamRange(new ArrayList<>(studyProgramEntity.getExamRange()))
                .withFieldOfStudy(studyProgramEntity.getFieldOfStudy().map(fieldOfStudyDTOMapper::toDTO).orElse(null))
                .withIdStudyProgram(studyProgramEntity.getIdStudyProgram())
                .withModules(studyProgramEntity.getModules().stream().map(studyProgramToModuleDTOMapper::toDTO).collect(Collectors.toList()))
                .withStudyPlan(studyProgramEntity.getStudyPlan().map(studyPlanDTOMapper::toDTO).orElse(null))
                .withUpdatedDate(studyProgramEntity.getUpdatedDate())
                .withVersion(studyProgramEntity.getVersion())
                .build();
    }

    public StudyProgramEntity toEntity(StudyProgramDTO studyProgramDTO) {
        return StudyProgramEntity.builder(studyProgramDTO.getCreatedDate(), studyProgramDTO.getValid(),
                studyProgramDTO.getIsCurrent())
                .withIdStudyProgram(studyProgramDTO.getIdStudyProgram())
                .withVersion(studyProgramDTO.getVersion())
                .withUpdatedDate(studyProgramDTO.getUpdatedDate())
                .withStudyPlan(studyProgramDTO.getStudyPlan().map(studyPlanDTOMapper::toEntity).orElse(null))
                .withModules(studyProgramDTO.getModules().stream().map(studyProgramToModuleDTOMapper::toEntity).collect(Collectors.toSet()))
                .withFieldOfStudy(studyProgramDTO.getFieldOfStudy().map(fieldOfStudyDTOMapper::toEntity).orElse(null))
                .withExamRange(new HashSet<>(studyProgramDTO.getExamRange()))
                .build();
    }
}