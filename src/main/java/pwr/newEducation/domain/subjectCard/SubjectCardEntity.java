package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.learningEffect.SubjectLearningEffectEntity;
import pwr.newEducation.domain.studyProgram.ModuleEntity;
import pwr.newEducation.domain.studyProgram.StudyProgramEntity;

import java.time.LocalDateTime;
import java.util.Set;

public class SubjectCardEntity {
    private long id;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime valid;
    private boolean isCurrent;
    private String subjectCode;
    private String name;
    private boolean isGroup;
    private int zzuHours;
    private int cnpsHours;
    private int subjectECTS;
    private int semester;
    private int lastSemester;
    private Set<ModuleEntity> module;
    private String idSupervisor;
    private Set<SubjectKindEntity> subjectKind;
    private Set<CreditingFormEntity> creditingForm;
    private Set<StudyProgramEntity> studyProgram;
    private Set<SubjectObjectiveEntity> subjectObjective;
    private Set<SubjectPrerequisiteEntity> subjectPrerequisites;
    private Set<LiteratureEntity> literature;
    private Set<TeachingToolEntity> teachingTools;
    private Set<SubjectLearningEffectEntity> subjectLearningEffects;

    public Set<ModuleEntity> getModule() {
        return module;
    }

    public void setModule(Set<ModuleEntity> module) {
        this.module = module;
    }

    public Set<CreditingFormEntity> getCreditingForm() {
        return creditingForm;
    }

    public void setCreditingForm(Set<CreditingFormEntity> creditingForm) {
        this.creditingForm = creditingForm;
    }

    public Set<StudyProgramEntity> getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(Set<StudyProgramEntity> studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Set<SubjectObjectiveEntity> getSubjectObjective() {
        return subjectObjective;
    }

    public void setSubjectObjective(Set<SubjectObjectiveEntity> subjectObjective) {
        this.subjectObjective = subjectObjective;
    }

    public Set<SubjectPrerequisiteEntity> getSubjectPrerequisites() {
        return subjectPrerequisites;
    }

    public void setSubjectPrerequisites(Set<SubjectPrerequisiteEntity> subjectPrerequisites) {
        this.subjectPrerequisites = subjectPrerequisites;
    }

    public Set<LiteratureEntity> getLiterature() {
        return literature;
    }

    public void setLiterature(Set<LiteratureEntity> literature) {
        this.literature = literature;
    }

    public Set<TeachingToolEntity> getTeachingTools() {
        return teachingTools;
    }

    public void setTeachingTools(Set<TeachingToolEntity> teachingTools) {
        this.teachingTools = teachingTools;
    }

    public Set<SubjectLearningEffectEntity> getSubjectLearningEffects() {
        return subjectLearningEffects;
    }

    public void setSubjectLearningEffects(Set<SubjectLearningEffectEntity> subjectLearningEffects) {
        this.subjectLearningEffects = subjectLearningEffects;
    }

    public long getIdSubjectCards() {
        return id;
    }

    public void setIdSubjectCards(long id) {
        this.id = id;
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

    public LocalDateTime getValid() {
        return valid;
    }

    public void setValid(LocalDateTime valid) {
        this.valid = valid;
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

    public String getIdSupervisor() {
        return idSupervisor;
    }

    public Set<SubjectKindEntity> getSubjectKind() {
        return subjectKind;
    }

    public void setSubjectKind(Set<SubjectKindEntity> subjectKind) {
        this.subjectKind = subjectKind;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    private SubjectCardEntity() {}

    private SubjectCardEntity(Builder builder) {
        this.id = builder.id;
        this.version = builder.version;
        this.createdDate = builder.createdDate;
        this.updatedDate = builder.updatedDate;
        this.valid = builder.valid;
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
        this.id = builder.id;
        this.subjectKind = builder.subjectKind;
        this.creditingForm = builder.creditingForm;
        this.studyProgram = builder.studyProgram;
        this.subjectObjective = builder.subjectObjective;
        this.subjectPrerequisites = builder.subjectPrerequisites;
        this.literature = builder.literature;
        this.teachingTools = builder.teachingTools;
        this.subjectLearningEffects = builder.subjectLearningEffects;
    }

    public static Builder builder(SubjectCardEntity subjectCardEntity) {
        return new Builder(subjectCardEntity);
    }

    public static Builder builder(long id,
                                  int version,
                                  LocalDateTime createdDate,
                                  LocalDateTime updatedDate,
                                  LocalDateTime valid,
                                  boolean isCurrent,
                                  String subjectCode,
                                  String name,
                                  boolean isGroup,
                                  int zzuHours,
                                  int cnpsHours,
                                  int subjectECTS,
                                  int semester,
                                  int lastSemester,
                                  Set<ModuleEntity> module,
                                  String idSupervisor,
                                  Set<SubjectKindEntity> subjectKind,
                                  Set<CreditingFormEntity> creditingForm,
                                  Set<StudyProgramEntity> studyProgram,
                                  Set<SubjectObjectiveEntity> subjectObjective,
                                  Set<SubjectPrerequisiteEntity> subjectPrerequisites,
                                  Set<LiteratureEntity> literature,
                                  Set<TeachingToolEntity> teachingTools,
                                  Set<SubjectLearningEffectEntity> subjectLearningEffects)
    {
        return new Builder(id, version, createdDate, updatedDate, valid,
                isCurrent, subjectCode, name, isGroup, zzuHours, cnpsHours, subjectECTS,
                semester, lastSemester, module, idSupervisor, subjectKind, creditingForm,
                studyProgram, subjectObjective, subjectPrerequisites, literature,
                teachingTools, subjectLearningEffects);
    }

    public static class Builder {
        private long id;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime valid;
        private boolean isCurrent;
        private String subjectCode;
        private String name;
        private boolean isGroup;
        private int zzuHours;
        private int cnpsHours;
        private int subjectECTS;
        private int semester;
        private int lastSemester;
        private Set<ModuleEntity> module;
        private String idSupervisor;
        private Set<SubjectKindEntity> subjectKind;
        private Set<CreditingFormEntity> creditingForm;
        private Set<StudyProgramEntity> studyProgram;
        private Set<SubjectObjectiveEntity> subjectObjective;
        private Set<SubjectPrerequisiteEntity> subjectPrerequisites;
        private Set<LiteratureEntity> literature;
        private Set<TeachingToolEntity> teachingTools;
        private Set<SubjectLearningEffectEntity> subjectLearningEffects;

        Builder() {}

        Builder(SubjectCardEntity subjectCardEntity) {
            id = subjectCardEntity.id;
            version = subjectCardEntity.version;
            createdDate = subjectCardEntity.createdDate;
            updatedDate = subjectCardEntity.updatedDate;
            valid = subjectCardEntity.valid;
            isCurrent = subjectCardEntity.isCurrent;
            subjectCode = subjectCardEntity.subjectCode;
            name = subjectCardEntity.name;
            isGroup = subjectCardEntity.isGroup;
            zzuHours = subjectCardEntity.zzuHours;
            cnpsHours = subjectCardEntity.cnpsHours;
            subjectECTS = subjectCardEntity.subjectECTS;
            semester = subjectCardEntity.semester;
            lastSemester = subjectCardEntity.lastSemester;
            module = subjectCardEntity.module;
            idSupervisor = subjectCardEntity.idSupervisor;
            subjectKind = subjectCardEntity.subjectKind;
            creditingForm = subjectCardEntity.creditingForm;
            studyProgram = subjectCardEntity.studyProgram;
            subjectObjective = subjectCardEntity.subjectObjective;
            subjectPrerequisites = subjectCardEntity.subjectPrerequisites;
            literature = subjectCardEntity.literature;
            teachingTools = subjectCardEntity.teachingTools;
            subjectLearningEffects = subjectCardEntity.subjectLearningEffects;
        }

        private Builder( long id,
                         int version,
                         LocalDateTime createdDate,
                         LocalDateTime updatedDate,
                         LocalDateTime valid,
                         boolean isCurrent,
                         String subjectCode,
                         String name,
                         boolean isGroup,
                         int zzuHours,
                         int cnpsHours,
                         int subjectECTS,
                         int semester,
                         int lastSemester,
                         Set<ModuleEntity> module,
                         String idSupervisor,
                         Set<SubjectKindEntity> subjectKind,
                         Set<CreditingFormEntity> creditingForm,
                         Set<StudyProgramEntity> studyProgram,
                         Set<SubjectObjectiveEntity> subjectObjective,
                         Set<SubjectPrerequisiteEntity> subjectPrerequisites,
                         Set<LiteratureEntity> literature,
                         Set<TeachingToolEntity> teachingTools,
                         Set<SubjectLearningEffectEntity> subjectLearningEffects)
        {
            this.id = id;
            this.version = version;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
            this.valid = valid;
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

        public SubjectCardEntity build() {
            return new SubjectCardEntity(this);
        }
    }
}
