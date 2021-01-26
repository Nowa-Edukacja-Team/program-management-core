package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import java.util.HashSet;
import java.util.Set;

@Dependent
public class FieldOfStudyEntity {
    private long id;
    private String name;
    private FacultyEntity facultyEntity;
    private LanguageEntity languageEntity;
    private DisciplineEntity disciplineEntity;
    private LearningCycleEntity learningCycleEntity;
    private LevelEntity levelEntity;
    private ModeEntity modeEntity;
    private ProfileEntity profileEntity;
    private Set<SpecializationEntity> specializationEntities = new HashSet<>();

    public String getName() {
        return name;
    }

    public DisciplineEntity getDisciplineEntity() {
        return disciplineEntity;
    }

    public FacultyEntity getFacultyEntity() {
        return facultyEntity;
    }

    public LanguageEntity getLanguageEntity() {
        return languageEntity;
    }

    public LearningCycleEntity getLearningCycleEntity() {
        return learningCycleEntity;
    }

    public LevelEntity getLevelEntity() {
        return levelEntity;
    }

    public long getIdFieldOFStudy() {
        return id;
    }

    public ModeEntity getModeEntity() {
        return modeEntity;
    }

    public ProfileEntity getProfileEntity() {
        return profileEntity;
    }


    public void addSpecialization(SpecializationEntity specializationEntity) {
        specializationEntities.add(specializationEntity);
        specializationEntity.getFieldOfStudyEntities().add(this);
    }

    public void removeSpecialization(SpecializationEntity specializationEntity) {
        specializationEntities.remove(specializationEntity);
        specializationEntity.getFieldOfStudyEntities().remove(this);
    }

    public Set<SpecializationEntity> getSpecializationEntities() {
        return specializationEntities;
    }

    public FieldOfStudyEntity() {}

    private FieldOfStudyEntity(FieldOfStudyEntity.Builder builder) {
        id = builder.id;
        name = builder.name;
        facultyEntity = builder.facultyEntity;
        languageEntity = builder.languageEntity;
        disciplineEntity = builder.disciplineEntity;
        learningCycleEntity = builder.learningCycleEntity;
        levelEntity = builder.levelEntity;
        modeEntity = builder.modeEntity;
        profileEntity = builder.profileEntity;
        specializationEntities = builder.specializationEntities;

    }

    public static FieldOfStudyEntity.Builder builder(long id, String name, FacultyEntity facultyEntity, LanguageEntity languageEntity,
                                                  DisciplineEntity disciplineEntity, LearningCycleEntity learningCycleEntity, LevelEntity levelEntity,
                                                  ModeEntity modeEntity, ProfileEntity profileEntity, Set<SpecializationEntity> specializationEntityS) {
        return new FieldOfStudyEntity.Builder(id, name, facultyEntity, languageEntity, disciplineEntity, learningCycleEntity, levelEntity,
                modeEntity, profileEntity, specializationEntityS);
    }

    public static class Builder {
        private long id;
        private String name;
        private FacultyEntity facultyEntity;
        private LanguageEntity languageEntity;
        private DisciplineEntity disciplineEntity;
        private LearningCycleEntity learningCycleEntity;
        private LevelEntity levelEntity;
        private ModeEntity modeEntity;
        private ProfileEntity profileEntity;
        private Set<SpecializationEntity> specializationEntities;

        Builder() {}

        Builder(long id, String name, FacultyEntity facultyEntity, LanguageEntity languageEntity,
                DisciplineEntity disciplineEntity, LearningCycleEntity learningCycleEntity, LevelEntity levelEntity, ModeEntity modeEntity,
                ProfileEntity profileEntity, Set<SpecializationEntity> specializationEntities) {
            this.disciplineEntity = disciplineEntity;
            this.facultyEntity = facultyEntity;
            this.id = id;
            this.name = name;
            this.languageEntity = languageEntity;
            this.learningCycleEntity = learningCycleEntity;
            this.levelEntity = levelEntity;
            this.modeEntity = modeEntity;
            this.profileEntity = profileEntity;
            this.specializationEntities = specializationEntities;
        }

        public FieldOfStudyEntity build() {
            return new FieldOfStudyEntity(this);
        }
    }
}
