package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.learningEffect.SubjectLearningEffectDTO;
import pwr.newEducation.domain.studyProgram.ModuleDTO;
import pwr.newEducation.domain.studyProgram.StudyProgramDTO;

import java.time.LocalDateTime;
import java.util.Set;

public class SubjectCardDTO {
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
    private Set<ModuleDTO> module;
    private int idSupervisor;
    private Set<SubjectKindDTO> subjectKind;
    private Set<CreditingFormDTO> creditingForm;
    private Set<StudyProgramDTO> studyProgram;
    private Set<SubjectObjectiveDTO> subjectObjective;
    private Set<SubjectPrerequisiteDTO> subjectPrerequisites;
    private Set<LiteratureDTO> literature;
    private Set<TeachingToolDTO> teachingTools;
    private Set<SubjectLearningEffectDTO> subjectLearningEffects;

    public Set<ModuleDTO> getModule() {
        return module;
    }

    public void setModule(Set<ModuleDTO> module) {
        this.module = module;
    }

    public Set<CreditingFormDTO> getCreditingForm() {
        return creditingForm;
    }

    public void setCreditingForm(Set<CreditingFormDTO> creditingForm) {
        this.creditingForm = creditingForm;
    }

    public Set<StudyProgramDTO> getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(Set<StudyProgramDTO> studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Set<SubjectObjectiveDTO> getSubjectObjective() {
        return subjectObjective;
    }

    public void setSubjectObjective(Set<SubjectObjectiveDTO> subjectObjective) {
        this.subjectObjective = subjectObjective;
    }

    public Set<SubjectPrerequisiteDTO> getSubjectPrerequisites() {
        return subjectPrerequisites;
    }

    public void setSubjectPrerequisites(Set<SubjectPrerequisiteDTO> subjectPrerequisites) {
        this.subjectPrerequisites = subjectPrerequisites;
    }

    public Set<LiteratureDTO> getLiterature() {
        return literature;
    }

    public void setLiterature(Set<LiteratureDTO> literature) {
        this.literature = literature;
    }

    public Set<TeachingToolDTO> getTeachingTools() {
        return teachingTools;
    }

    public void setTeachingTools(Set<TeachingToolDTO> teachingTools) {
        this.teachingTools = teachingTools;
    }

    public Set<SubjectLearningEffectDTO> getSubjectLearningEffects() {
        return subjectLearningEffects;
    }

    public void setSubjectLearningEffects(Set<SubjectLearningEffectDTO> subjectLearningEffects) {
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

    public Set<SubjectKindDTO> getSubjectKind() {
        return subjectKind;
    }

    public void setSubjectKind(Set<SubjectKindDTO> subjectKind) {
        this.subjectKind = subjectKind;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    private SubjectCardDTO() {}

    private SubjectCardDTO(Builder builder) {
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

    public static Builder builder(SubjectCardDTO subjectCardDTO) {
        return new Builder(subjectCardDTO);
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
                                  Set<ModuleDTO> module,
                                  int idSupervisor,
                                  Set<SubjectKindDTO> subjectKind,
                                  Set<CreditingFormDTO> creditingForm,
                                  Set<StudyProgramDTO> studyProgram,
                                  Set<SubjectObjectiveDTO> subjectObjective,
                                  Set<SubjectPrerequisiteDTO> subjectPrerequisites,
                                  Set<LiteratureDTO> literature,
                                  Set<TeachingToolDTO> teachingTools,
                                  Set<SubjectLearningEffectDTO> subjectLearningEffects)
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
        private Set<ModuleDTO> module;
        private int idSupervisor;
        private Set<SubjectKindDTO> subjectKind;
        private Set<CreditingFormDTO> creditingForm;
        private Set<StudyProgramDTO> studyProgram;
        private Set<SubjectObjectiveDTO> subjectObjective;
        private Set<SubjectPrerequisiteDTO> subjectPrerequisites;
        private Set<LiteratureDTO> literature;
        private Set<TeachingToolDTO> teachingTools;
        private Set<SubjectLearningEffectDTO> subjectLearningEffects;

        Builder() {}

        Builder(SubjectCardDTO subjectCardDTO) {
            idSubjectCards = subjectCardDTO.idSubjectCards;
            version = subjectCardDTO.version;
            createdDate = subjectCardDTO.createdDate;
            updatedDate = subjectCardDTO.updatedDate;
            validFromDate = subjectCardDTO.validFromDate;
            isCurrent = subjectCardDTO.isCurrent;
            subjectCode = subjectCardDTO.subjectCode;
            name = subjectCardDTO.name;
            isGroup = subjectCardDTO.isGroup;
            zzuHours = subjectCardDTO.zzuHours;
            cnpsHours = subjectCardDTO.cnpsHours;
            subjectECTS = subjectCardDTO.subjectECTS;
            semester = subjectCardDTO.semester;
            lastSemester = subjectCardDTO.lastSemester;
            module = subjectCardDTO.module;
            idSupervisor = subjectCardDTO.idSupervisor;
            subjectKind = subjectCardDTO.subjectKind;
            creditingForm = subjectCardDTO.creditingForm;
            studyProgram = subjectCardDTO.studyProgram;
            subjectObjective = subjectCardDTO.subjectObjective;
            subjectPrerequisites = subjectCardDTO.subjectPrerequisites;
            literature = subjectCardDTO.literature;
            teachingTools = subjectCardDTO.teachingTools;
            subjectLearningEffects = subjectCardDTO.subjectLearningEffects;
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
                         Set<ModuleDTO> module,
                         int idSupervisor,
                         Set<SubjectKindDTO> subjectKind,
                         Set<CreditingFormDTO> creditingForm,
                         Set<StudyProgramDTO> studyProgram,
                         Set<SubjectObjectiveDTO> subjectObjective,
                         Set<SubjectPrerequisiteDTO> subjectPrerequisites,
                         Set<LiteratureDTO> literature,
                         Set<TeachingToolDTO> teachingTools,
                         Set<SubjectLearningEffectDTO> subjectLearningEffects)
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

        public SubjectCardDTO build() {
            return new SubjectCardDTO(this);
        }
    }
}
