package pwr.newEducation.domain.fieldOfStudy;

import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class FieldOfStudyJPA {
    @Id
    @GeneratedValue
    private long idFieldOFStudy;

    private String name;

    @ManyToOne
    private FacultyJPA facultyJPA;

    @ManyToOne
    private LanguageJPA languageJPA;

    @ManyToOne
    private DisciplineJPA disciplineJPA;

    @ManyToOne
    private LearningCycleJPA learningCycleJPA;

    @ManyToOne
    private LevelJPA levelJPA;

    @ManyToOne
    private ModeJPA modeJPA;

    @ManyToOne
    private ProfileJPA profileJPA;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "fields_of_studies_to_specialization",
            joinColumns = @JoinColumn(name = "id_field_of_study"),
            inverseJoinColumns = @JoinColumn(name = "id_specialization")
    )
    private Set<SpecializationJPA> specializationJPAS = new HashSet<>();

    @OneToMany
    public Set<StudyProgramJPA> studyProgramJPA;

    public String getName() {
        return name;
    }

    public DisciplineJPA getDisciplineJPA() {
        return disciplineJPA;
    }

    public FacultyJPA getFacultyJPA() {
        return facultyJPA;
    }

    public LanguageJPA getLanguageJPA() {
        return languageJPA;
    }

    public LearningCycleJPA getLearningCycleJPA() {
        return learningCycleJPA;
    }

    public LevelJPA getLevelJPA() {
        return levelJPA;
    }

    public long getIdFieldOFStudy() {
        return idFieldOFStudy;
    }

    public ModeJPA getModeJPA() {
        return modeJPA;
    }

    public ProfileJPA getProfileJPA() {
        return profileJPA;
    }

    public StudyProgramJPA getStudyProgramJPA() {
        return studyProgramJPA;
    }

    public void addSpecialization(SpecializationJPA specializationJPA) {
        specializationJPAS.add(specializationJPA);
        specializationJPA.getFieldOfStudyJPAS().add(this);
    }

    public void removeSpecialization(SpecializationJPA specializationJPA) {
        specializationJPAS.remove(specializationJPA);
        specializationJPA.getFieldOfStudyJPAS().remove(this);
    }

    public Set<SpecializationJPA> getSpecializationJPAS() {
        return specializationJPAS;
    }

    public FieldOfStudyJPA() {}

    private FieldOfStudyJPA(Builder builder) {
        idFieldOFStudy = builder.idFieldOFStudy;
        name = builder.name;
        facultyJPA = builder.facultyJPA;
        languageJPA = builder.languageJPA;
        disciplineJPA = builder.disciplineJPA;
        learningCycleJPA = builder.learningCycleJPA;
        levelJPA = builder.levelJPA;
        modeJPA = builder.modeJPA;
        profileJPA = builder.profileJPA;
        specializationJPAS = builder.specializationJPAS;

    }

    public static Builder builder(long idFieldOFStudy, String name, FacultyJPA facultyJPA, LanguageJPA languageJPA,
                                  DisciplineJPA disciplineJPA, LearningCycleJPA learningCycleJPA, LevelJPA levelJPA,
                                  ModeJPA modeJPA, ProfileJPA profileJPA, Set<SpecializationJPA> specializationJPAS) {
        return new Builder(idFieldOFStudy, name, facultyJPA, languageJPA, disciplineJPA, learningCycleJPA, levelJPA,
                modeJPA, profileJPA, specializationJPAS);
    }

    public static class Builder {
        private long idFieldOFStudy;
        private String name;
        private FacultyJPA facultyJPA;
        private LanguageJPA languageJPA;
        private DisciplineJPA disciplineJPA;
        private LearningCycleJPA learningCycleJPA;
        private LevelJPA levelJPA;
        private ModeJPA modeJPA;
        private ProfileJPA profileJPA;
        private Set<SpecializationJPA> specializationJPAS;
        private

        Builder() {}

        Builder(long idFieldOFStudy, String name, FacultyJPA facultyJPA, LanguageJPA languageJPA,
                DisciplineJPA disciplineJPA, LearningCycleJPA learningCycleJPA, LevelJPA levelJPA, ModeJPA modeJPA,
                ProfileJPA profileJPA, Set<SpecializationJPA> specializationJPAS) {
            this.disciplineJPA = disciplineJPA;
            this.facultyJPA = facultyJPA;
            this.idFieldOFStudy = idFieldOFStudy;
            this.name = name;
            this.languageJPA = languageJPA;
            this.learningCycleJPA = learningCycleJPA;
            this.levelJPA = levelJPA;
            this.modeJPA = modeJPA;
            this.profileJPA = profileJPA;
            this.specializationJPAS = specializationJPAS;
        }

        public FieldOfStudyJPA build() {
            return new FieldOfStudyJPA(this);
        }
    }
}
