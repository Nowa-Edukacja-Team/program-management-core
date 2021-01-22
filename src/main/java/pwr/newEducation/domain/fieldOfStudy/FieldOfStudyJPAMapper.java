package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class FieldOfStudyJPAMapper {
    @Inject
    private FacultyJPAMapper facultyJPAMapper;
    @Inject
    private LanguageJPAMapper languageJPAMapper;
    @Inject
    private DisciplineJPAMapper disciplineJPAMapper;
    @Inject
    private LearningCycleJPAMapper learningCycleJPAMapper;
    @Inject
    private LevelJPAMapper levelJPAMapper;
    @Inject
    private ModeJPAMapper modeJPAMapper;
    @Inject
    private ProfileJPAMapper profileJPAMapper;
    @Inject
    private SpecializationJPAMapper specializationJPAMapper;

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

