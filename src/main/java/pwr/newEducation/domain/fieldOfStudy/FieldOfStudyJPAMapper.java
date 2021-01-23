package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class FieldOfStudyJPAMapper {
    @Inject
    FacultyJPAMapper facultyJPAMapper;
    @Inject
    LanguageJPAMapper languageJPAMapper;
    @Inject
    DisciplineJPAMapper disciplineJPAMapper;
    @Inject
    LearningCycleJPAMapper learningCycleJPAMapper;
    @Inject
    LevelJPAMapper levelJPAMapper;
    @Inject
    ModeJPAMapper modeJPAMapper;
    @Inject
    ProfileJPAMapper profileJPAMapper;
    @Inject
    SpecializationJPAMapper specializationJPAMapper;

    public FieldOfStudyEntity toEntity(FieldOfStudyJPA fieldOfStudyJPA) {
        return FieldOfStudyEntity.builder(fieldOfStudyJPA.getIdFieldOFStudy(), fieldOfStudyJPA.getName(),
                facultyJPAMapper.toEntity(fieldOfStudyJPA.getFacultyJPA()),
                languageJPAMapper.toEntity(fieldOfStudyJPA.getLanguageJPA()),
                disciplineJPAMapper.toEntity(fieldOfStudyJPA.getDisciplineJPA()),
                learningCycleJPAMapper.toEntity(fieldOfStudyJPA.getLearningCycleJPA()),
                levelJPAMapper.toEntity(fieldOfStudyJPA.getLevelJPA()),
                modeJPAMapper.toEntity(fieldOfStudyJPA.getModeJPA()),
                profileJPAMapper.toEntity(fieldOfStudyJPA.getProfileJPA()),
                fieldOfStudyJPA.getSpecializationJPAS().stream().map(specializationJPAMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }
    public FieldOfStudyJPA toJPA(FieldOfStudyEntity fieldOfStudyEntity) {
        return FieldOfStudyJPA.builder(fieldOfStudyEntity.getIdFieldOFStudy(), fieldOfStudyEntity.getName(),
                facultyJPAMapper.toJPA(fieldOfStudyEntity.getFacultyEntity()),
                languageJPAMapper.toJPA(fieldOfStudyEntity.getLanguageEntity()),
                disciplineJPAMapper.toJPA(fieldOfStudyEntity.getDisciplineEntity()),
                learningCycleJPAMapper.toJPA(fieldOfStudyEntity.getLearningCycleEntity()),
                levelJPAMapper.toJPA(fieldOfStudyEntity.getLevelEntity()),
                modeJPAMapper.toJPA(fieldOfStudyEntity.getModeEntity()),
                profileJPAMapper.toJPA(fieldOfStudyEntity .getProfileEntity()),
                fieldOfStudyEntity.getSpecializationEntities().stream().map(specializationJPAMapper::toJPA).collect(Collectors.toSet()))
                .build();
    }
}

