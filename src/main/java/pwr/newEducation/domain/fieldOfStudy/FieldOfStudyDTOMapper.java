package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class FieldOfStudyDTOMapper {
    @Inject
    private FacultyDTOMapper facultyDTOMapper;
    @Inject
    private LanguageDTOMapper languageDTOMapper;
    @Inject
    private DisciplineDTOMapper disciplineDTOMapper;
    @Inject
    private LearningCycleDTOMapper learningCycleDTOMapper;
    @Inject
    private LevelDTOMapper levelDTOMapper;
    @Inject
    private ModeDTOMapper modeDTOMapper;
    @Inject
    private ProfileDTOMapper profileDTOMapper;
    @Inject
    private SpecializationDTOMapper specializationDTOMapper;

    public FieldOfStudyEntity toEntity(FieldOfStudyDTO fieldOfStudyDTO) {
        return FieldOfStudyEntity.builder(fieldOfStudyDTO.getIdFieldOFStudy(), fieldOfStudyDTO.getName(),
                facultyDTOMapper.toEntity(fieldOfStudyDTO.getFacultyDTO()),
                languageDTOMapper.toEntity(fieldOfStudyDTO.getLanguageDTO()),
                disciplineDTOMapper.toEntity(fieldOfStudyDTO.getDisciplineDTO()),
                learningCycleDTOMapper.toEntity(fieldOfStudyDTO.getLearningCycleDTO()),
                levelDTOMapper.toEntity(fieldOfStudyDTO.getLevelDTO()),
                modeDTOMapper.toEntity(fieldOfStudyDTO.getModeDTO()),
                profileDTOMapper.toEntity(fieldOfStudyDTO.getProfileDTO()),
                fieldOfStudyDTO.getSpecializationDTOS().stream().map(specializationDTOMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }
    public FieldOfStudyDTO toDTO(FieldOfStudyEntity fieldOfStudyEntity) {
        return FieldOfStudyDTO.builder(fieldOfStudyEntity.getIdFieldOFStudy(), fieldOfStudyEntity.getName(),
                facultyDTOMapper.toDTO(fieldOfStudyEntity.getFacultyEntity()),
                languageDTOMapper.toDTO(fieldOfStudyEntity.getLanguageEntity()),
                disciplineDTOMapper.toDTO(fieldOfStudyEntity.getDisciplineEntity()),
                learningCycleDTOMapper.toDTO(fieldOfStudyEntity.getLearningCycleEntity()),
                levelDTOMapper.toDTO(fieldOfStudyEntity.getLevelEntity()),
                modeDTOMapper.toDTO(fieldOfStudyEntity.getModeEntity()),
                profileDTOMapper.toDTO(fieldOfStudyEntity .getProfileEntity()),
                fieldOfStudyEntity.getSpecializationEntities().stream().map(specializationDTOMapper::toDTO).collect(Collectors.toSet()))
                .build();
    }
}
