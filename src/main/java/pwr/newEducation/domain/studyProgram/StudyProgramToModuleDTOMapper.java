package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class StudyProgramToModuleDTOMapper {
    @Inject
    ModuleDTOMapper moduleDTOMapper;

    StudyProgramToModuleDTO toDTO(StudyProgramToModuleEntity studyProgramToModuleEntity) {
        return StudyProgramToModuleDTO.builder(moduleDTOMapper.toDTO(studyProgramToModuleEntity.getModule()),
                studyProgramToModuleEntity.getLimitECTS()).build();
    }

    StudyProgramToModuleEntity toEntity(StudyProgramToModuleDTO studyProgramToModule) {
        return StudyProgramToModuleEntity.builder(moduleDTOMapper.toEntity(studyProgramToModule.getModule()),
                studyProgramToModule.getLimitECTS())
                .build();
    }
}
