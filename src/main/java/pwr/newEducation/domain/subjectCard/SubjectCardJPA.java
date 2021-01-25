package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.learningEffect.SubjectLearningEffectJPA;
import pwr.newEducation.domain.studyProgram.ModuleJPA;
import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class SubjectCardJPA implements Serializable {
    @Id
    @GeneratedValue
    private long idSubjectCards;
    @Id
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime validFromDate;
    private boolean isCurrent;
    private String subjectCode;
    private String name;
    private boolean isGroup;
    private int zzuHours;
    private int cnpsHours;
    private int subjectECTS;
    private int semester;
    private int lastSemester;
    @OneToMany
    private Set<ModuleJPA> module;
    private int idSupervisor;
    @OneToMany
    private Set<SubjectKindJPA> subjectKind;
    @OneToMany
    private Set<CreditingFormJPA> creditingForm;
    @OneToMany
    private Set<StudyProgramJPA> studyProgram;
    @OneToMany
    private Set<SubjectObjectiveJPA> subjectObjective;
    @OneToMany
    private Set<SubjectPrerequisiteJPA> subjectPrerequisites;
    @OneToMany
    private Set<LiteratureJPA> literature;
    @OneToMany
    private Set<TeachingToolJPA> teachingTools;
    @OneToMany
    private Set<SubjectLearningEffectJPA> subjectLearningEffects;

    public Set<ModuleJPA> getModule() {
        return module;
    }

    public void setModule(Set<ModuleJPA> module) {
        this.module = module;
    }

    public Set<CreditingFormJPA> getCreditingForm() {
        return creditingForm;
    }

    public void setCreditingForm(Set<CreditingFormJPA> creditingForm) {
        this.creditingForm = creditingForm;
    }

    public Set<StudyProgramJPA> getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(Set<StudyProgramJPA> studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Set<SubjectObjectiveJPA> getSubjectObjective() {
        return subjectObjective;
    }

    public void setSubjectObjective(Set<SubjectObjectiveJPA> subjectObjective) {
        this.subjectObjective = subjectObjective;
    }

    public Set<SubjectPrerequisiteJPA> getSubjectPrerequisites() {
        return subjectPrerequisites;
    }

    public void setSubjectPrerequisites(Set<SubjectPrerequisiteJPA> subjectPrerequisites) {
        this.subjectPrerequisites = subjectPrerequisites;
    }

    public Set<LiteratureJPA> getLiterature() {
        return literature;
    }

    public void setLiterature(Set<LiteratureJPA> literature) {
        this.literature = literature;
    }

    public Set<TeachingToolJPA> getTeachingTools() {
        return teachingTools;
    }

    public void setTeachingTools(Set<TeachingToolJPA> teachingTools) {
        this.teachingTools = teachingTools;
    }

    public Set<SubjectLearningEffectJPA> getSubjectLearningEffects() {
        return subjectLearningEffects;
    }

    public void setSubjectLearningEffects(Set<SubjectLearningEffectJPA> subjectLearningEffects) {
        this.subjectLearningEffects = subjectLearningEffects;
    }

    public long getIdSubjectCards() {
        return idSubjectCards;
    }

    public void setIdSubjectCards(long idSubjectCards) {
        this.idSubjectCards = idSubjectCards;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDateTime getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(LocalDateTime validFromDate) {
        this.validFromDate = validFromDate;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGroup() {
        return isGroup;
    }

    public void setGroup(boolean group) {
        isGroup = group;
    }

    public int getZzuHours() {
        return zzuHours;
    }

    public void setZzuHours(int zzuHours) {
        this.zzuHours = zzuHours;
    }

    public int getCnpsHours() {
        return cnpsHours;
    }

    public void setCnpsHours(int cnpsHours) {
        this.cnpsHours = cnpsHours;
    }

    public int getSubjectECTS() {
        return subjectECTS;
    }

    public void setSubjectECTS(int subjectECTS) {
        this.subjectECTS = subjectECTS;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getLastSemester() {
        return lastSemester;
    }

    public void setLastSemester(int lastSemester) {
        this.lastSemester = lastSemester;
    }

    public int getIdSupervisor() {
        return idSupervisor;
    }

    public Set<SubjectKindJPA> getSubjectKind() {
        return subjectKind;
    }

    public void setSubjectKind(Set<SubjectKindJPA> subjectKind) {
        this.subjectKind = subjectKind;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public SubjectCardJPA() {}

    private SubjectCardJPA(Builder builder) {
        this.idSubjectCards = builder.idSubjectCards;
        this.version = builder.version;
        this.createdDate = builder.createdDate;
        this.updatedDate = builder.updatedDate;
        this.validFromDate = builder.validFromDate;
        this.isCurrent = builder.isCurrent;
        this.subjectCode = builder.subjectCode;
        this.name = builder.name;
        this.isGroup = builder.isGroup;
        this.zzuHours = builder.zzuHours;
        this.cnpsHours = builder.cnpsHours;
        this.subjectECTS = builder.subjectECTS;
        this.semester = builder.semester;
        this.lastSemester = builder.lastSemester;
        this.module = builder.module;
        this.idSupervisor = builder.idSupervisor;
        this.subjectKind = builder.subjectKind;
        this.creditingForm = builder.creditingForm;
        this.studyProgram = builder.studyProgram;
        this.subjectObjective = builder.subjectObjective;
        this.subjectPrerequisites = builder.subjectPrerequisites;
        this.literature = builder.literature;
        this.teachingTools = builder.teachingTools;
        this.subjectLearningEffects = builder.subjectLearningEffects;
    }

    public static Builder builder(SubjectCardJPA subjectCardJPA) {
        return new Builder(subjectCardJPA);
    }

    public static Builder builder(long idSubjectCards,
                                  int version,
                                  LocalDateTime createdDate,
                                  LocalDateTime updatedDate,
                                  LocalDateTime validFromDate,
                                  boolean isCurrent,
                                  String subjectCode,
                                  String name,
                                  boolean isGroup,
                                  int zzuHours,
                                  int cnpsHours,
                                  int subjectECTS,
                                  int semester,
                                  int lastSemester,
                                  Set<ModuleJPA> module,
                                  int idSupervisor,
                                  Set<SubjectKindJPA> subjectKind,
                                  Set<CreditingFormJPA> creditingForm,
                                  Set<StudyProgramJPA> studyProgram,
                                  Set<SubjectObjectiveJPA> subjectObjective,
                                  Set<SubjectPrerequisiteJPA> subjectPrerequisites,
                                  Set<LiteratureJPA> literature,
                                  Set<TeachingToolJPA> teachingTools,
                                  Set<SubjectLearningEffectJPA> subjectLearningEffects)
    {
        return new Builder(idSubjectCards, version, createdDate, updatedDate, validFromDate,
                isCurrent, subjectCode, name, isGroup, zzuHours, cnpsHours, subjectECTS,
                semester, lastSemester, module, idSupervisor, subjectKind, creditingForm,
                studyProgram, subjectObjective, subjectPrerequisites, literature,
                teachingTools, subjectLearningEffects);
    }

    public static class Builder {
        private long idSubjectCards;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFromDate;
        private boolean isCurrent;
        private String subjectCode;
        private String name;
        private boolean isGroup;
        private int zzuHours;
        private int cnpsHours;
        private int subjectECTS;
        private int semester;
        private int lastSemester;
        private Set<ModuleJPA> module;
        private int idSupervisor;
        private Set<SubjectKindJPA> subjectKind;
        private Set<CreditingFormJPA> creditingForm;
        private Set<StudyProgramJPA> studyProgram;
        private Set<SubjectObjectiveJPA> subjectObjective;
        private Set<SubjectPrerequisiteJPA> subjectPrerequisites;
        private Set<LiteratureJPA> literature;
        private Set<TeachingToolJPA> teachingTools;
        private Set<SubjectLearningEffectJPA> subjectLearningEffects;

        Builder() {}

        Builder(SubjectCardJPA subjectCardJPA) {
            idSubjectCards = subjectCardJPA.idSubjectCards;
            version = subjectCardJPA.version;
            createdDate = subjectCardJPA.createdDate;
            updatedDate = subjectCardJPA.updatedDate;
            validFromDate = subjectCardJPA.validFromDate;
            isCurrent = subjectCardJPA.isCurrent;
            subjectCode = subjectCardJPA.subjectCode;
            name = subjectCardJPA.name;
            isGroup = subjectCardJPA.isGroup;
            zzuHours = subjectCardJPA.zzuHours;
            cnpsHours = subjectCardJPA.cnpsHours;
            subjectECTS = subjectCardJPA.subjectECTS;
            semester = subjectCardJPA.semester;
            lastSemester = subjectCardJPA.lastSemester;
            module = subjectCardJPA.module;
            idSupervisor = subjectCardJPA.idSupervisor;
            subjectKind = subjectCardJPA.subjectKind;
            creditingForm = subjectCardJPA.creditingForm;
            studyProgram = subjectCardJPA.studyProgram;
            subjectObjective = subjectCardJPA.subjectObjective;
            subjectPrerequisites = subjectCardJPA.subjectPrerequisites;
            literature = subjectCardJPA.literature;
            teachingTools = subjectCardJPA.teachingTools;
            subjectLearningEffects = subjectCardJPA.subjectLearningEffects;
        }

        private Builder( long idSubjectCards,
                         int version,
                         LocalDateTime createdDate,
                         LocalDateTime updatedDate,
                         LocalDateTime validFromDate,
                         boolean isCurrent,
                         String subjectCode,
                         String name,
                         boolean isGroup,
                         int zzuHours,
                         int cnpsHours,
                         int subjectECTS,
                         int semester,
                         int lastSemester,
                         Set<ModuleJPA> module,
                         int idSupervisor,
                         Set<SubjectKindJPA> subjectKind,
                         Set<CreditingFormJPA> creditingForm,
                         Set<StudyProgramJPA> studyProgram,
                         Set<SubjectObjectiveJPA> subjectObjective,
                         Set<SubjectPrerequisiteJPA> subjectPrerequisites,
                         Set<LiteratureJPA> literature,
                         Set<TeachingToolJPA> teachingTools,
                         Set<SubjectLearningEffectJPA> subjectLearningEffects)
        {
            this.idSubjectCards = idSubjectCards;
            this.version = version;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
            this.validFromDate = validFromDate;
            this.isCurrent = isCurrent;
            this.subjectCode = subjectCode;
            this.name = name;
            this.isGroup = isGroup;
            this.zzuHours = zzuHours;
            this.cnpsHours = cnpsHours;
            this.subjectECTS = subjectECTS;
            this.semester = semester;
            this.lastSemester = lastSemester;
            this.module = module;
            this.idSupervisor = idSupervisor;
            this.subjectKind = subjectKind;
            this.creditingForm = creditingForm;
            this.studyProgram = studyProgram;
            this.subjectObjective = subjectObjective;
            this.subjectPrerequisites = subjectPrerequisites;
            this.literature = literature;
            this.teachingTools = teachingTools;
            this.subjectLearningEffects = subjectLearningEffects;
        }

        public SubjectCardJPA build() {
            return new SubjectCardJPA(this);
        }
    }
}
