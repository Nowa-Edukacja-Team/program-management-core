package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class StudyProgramToModuleJPAMapper {
    @Inject
    ModuleJPAMapper moduleJPAMapper;

    StudyProgramToModuleEntity toEntity(StudyProgramToModuleJPA studyProgramToModule) {
        return StudyProgramToModuleEntity.builder(moduleJPAMapper.toEntity(studyProgramToModule.getModule()),
                studyProgramToModule.getLimitECTS()).build();
    }

    StudyProgramToModuleJPA toJPA(StudyProgramToModuleEntity studyProgramToModuleEntity, StudyProgramJPA studyProgramJPA) {
        return StudyProgramToModuleJPA.builder(moduleJPAMapper.toJPA(studyProgramToModuleEntity.getModule()),
                studyProgramJPA, studyProgramToModuleEntity.getLimitECTS()).build();
    }
}
