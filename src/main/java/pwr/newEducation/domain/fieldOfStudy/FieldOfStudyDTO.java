package pwr.newEducation.domain.fieldOfStudy;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FieldOfStudyDTO {
    private long idFieldOFStudy;
    private String name;
    private FacultyDTO facultyDTO;
    private LanguageDTO languageDTO;
    private DisciplineDTO disciplineDTO;
    private LearningCycleDTO learningCycleDTO;
    private LevelDTO levelDTO;
    private ModeDTO modeDTO;
    private ProfileDTO profileDTO;
    private Set<SpecializationDTO> specializationEntities = new HashSet<>();

    public String getName() {
        return name;
    }

    public Optional<DisciplineDTO> getDisciplineDTO() {
        return Optional.ofNullable(disciplineDTO);
    }

    public FacultyDTO getFacultyDTO() {
        return facultyDTO;
    }

    public LanguageDTO getLanguageDTO() {
        return languageDTO;
    }

    public LearningCycleDTO getLearningCycleDTO() {
        return learningCycleDTO;
    }

    public LevelDTO getLevelDTO() {
        return levelDTO;
    }

    public long getIdFieldOFStudy() {
        return idFieldOFStudy;
    }

    public ModeDTO getModeDTO() {
        return modeDTO;
    }

    public ProfileDTO getProfileDTO() {
        return profileDTO;
    }

    public Set<SpecializationDTO> getSpecializationDTOS() {
        return specializationEntities;
    }

    public FieldOfStudyDTO() {}

    private FieldOfStudyDTO(FieldOfStudyDTO.Builder builder) {
        idFieldOFStudy = builder.idFieldOFStudy;
        name = builder.name;
        facultyDTO = builder.facultyDTO;
        languageDTO = builder.languageDTO;
        disciplineDTO = builder.disciplineDTO;
        learningCycleDTO = builder.learningCycleDTO;
        levelDTO = builder.levelDTO;
        modeDTO = builder.modeDTO;
        profileDTO = builder.profileDTO;
        specializationEntities = builder.specializationEntities;

    }

    public static FieldOfStudyDTO.Builder builder(long idFieldOFStudy, String name, FacultyDTO facultyDTO, LanguageDTO languageDTO,
                                                     DisciplineDTO disciplineDTO, LearningCycleDTO learningCycleDTO, LevelDTO levelDTO,
                                                     ModeDTO modeDTO, ProfileDTO profileDTO, Set<SpecializationDTO> specializationDTOS) {
        return new FieldOfStudyDTO.Builder(idFieldOFStudy, name, facultyDTO, languageDTO, disciplineDTO, learningCycleDTO, levelDTO,
                modeDTO, profileDTO, specializationDTOS);
    }

    public static class Builder {
        private long idFieldOFStudy;
        private String name;
        private FacultyDTO facultyDTO;
        private LanguageDTO languageDTO;
        private DisciplineDTO disciplineDTO;
        private LearningCycleDTO learningCycleDTO;
        private LevelDTO levelDTO;
        private ModeDTO modeDTO;
        private ProfileDTO profileDTO;
        private Set<SpecializationDTO> specializationEntities;

        Builder() {}

        Builder(long idFieldOFStudy, String name, FacultyDTO facultyDTO, LanguageDTO languageDTO,
                DisciplineDTO disciplineDTO, LearningCycleDTO learningCycleDTO, LevelDTO levelDTO, ModeDTO modeDTO,
                ProfileDTO profileDTO, Set<SpecializationDTO> specializationEntities) {
            this.disciplineDTO = disciplineDTO;
            this.facultyDTO = facultyDTO;
            this.idFieldOFStudy = idFieldOFStudy;
            this.name = name;
            this.languageDTO = languageDTO;
            this.learningCycleDTO = learningCycleDTO;
            this.levelDTO = levelDTO;
            this.modeDTO = modeDTO;
            this.profileDTO = profileDTO;
            this.specializationEntities = specializationEntities;
        }

        public FieldOfStudyDTO build() {
            return new FieldOfStudyDTO(this);
        }
    }
}
