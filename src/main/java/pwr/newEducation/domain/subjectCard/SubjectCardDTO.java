package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.learningEffect.SubjectLearningEffectDTO;
import pwr.newEducation.domain.studyProgram.ModuleDTO;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;


public class SubjectCardDTO implements Serializable {
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
    private ModuleDTO module;
    private String idSupervisor;
    private SubjectKindDTO subjectKind;
    private CreditingFormDTO creditingForm;
    private long idStudyProgram;
    private Set<String> subjectObjective;
    private Set<String> subjectPrerequisites;
    private Set<LiteratureDTO> literature;
    private Set<String> teachingTools;
    private Set<SubjectLearningEffectDTO> subjectLearningEffects;

    public ModuleDTO getModule() {
        return module;
    }

    public void setModule(ModuleDTO module) {
        this.module = module;
    }

    public CreditingFormDTO getCreditingForm() {
        return creditingForm;
    }

    public void setCreditingForm(CreditingFormDTO creditingForm) {
        this.creditingForm = creditingForm;
    }

    public long getIdStudyProgram() {
        return idStudyProgram;
    }

    public void setIdStudyProgram(long idStudyProgram) {
        this.idStudyProgram = idStudyProgram;
    }

    public Set<String> getSubjectObjective() {
        return subjectObjective;
    }

    public void setSubjectObjective(Set<String> subjectObjective) {
        this.subjectObjective = subjectObjective;
    }

    public Set<String> getSubjectPrerequisites() {
        return subjectPrerequisites;
    }

    public void setSubjectPrerequisites(Set<String> subjectPrerequisites) {
        this.subjectPrerequisites = subjectPrerequisites;
    }

    public Set<LiteratureDTO> getLiterature() {
        return literature;
    }

    public void setLiterature(Set<LiteratureDTO> literature) {
        this.literature = literature;
    }

    public Set<String> getTeachingTools() {
        return teachingTools;
    }

    public void setTeachingTools(Set<String> teachingTools) {
        this.teachingTools = teachingTools;
    }

    public Set<SubjectLearningEffectDTO> getSubjectLearningEffects() {
        return subjectLearningEffects;
    }

    public void setSubjectLearningEffects(Set<SubjectLearningEffectDTO> subjectLearningEffects) {
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

    public SubjectKindDTO getSubjectKind() {
        return subjectKind;
    }

    public void setSubjectKind(SubjectKindDTO subjectKind) {
        this.subjectKind = subjectKind;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public SubjectCardDTO() {}

    private SubjectCardDTO(Builder builder) {
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
        this.subjectKind = builder.subjectKind;
        this.creditingForm = builder.creditingForm;
        this.idStudyProgram = builder.idStudyProgram;
        this.subjectObjective = builder.subjectObjective;
        this.subjectPrerequisites = builder.subjectPrerequisites;
        this.literature = builder.literature;
        this.teachingTools = builder.teachingTools;
        this.subjectLearningEffects = builder.subjectLearningEffects;
    }

    public static Builder builder(SubjectCardDTO subjectCardDTO) {
        return new Builder(subjectCardDTO);
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
                                  ModuleDTO  module,
                                  String idSupervisor,
                                  SubjectKindDTO subjectKind,
                                  CreditingFormDTO creditingForm,
                                  long idStudyProgram,
                                  Set<String> subjectObjective,
                                  Set<String> subjectPrerequisites,
                                  Set<LiteratureDTO> literature,
                                  Set<String> teachingTools,
                                  Set<SubjectLearningEffectDTO> subjectLearningEffects)
    {
        return new Builder(id, version, createdDate, updatedDate, valid,
                isCurrent, subjectCode, name, isGroup, zzuHours, cnpsHours, subjectECTS,
                semester, lastSemester, module, idSupervisor, subjectKind, creditingForm,
                idStudyProgram, subjectObjective, subjectPrerequisites, literature,
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
        private ModuleDTO module;
        private String idSupervisor;
        private SubjectKindDTO subjectKind;
        private CreditingFormDTO creditingForm;
        private long idStudyProgram;
        private Set<String> subjectObjective;
        private Set<String> subjectPrerequisites;
        private Set<LiteratureDTO> literature;
        private Set<String> teachingTools;
        private Set<SubjectLearningEffectDTO> subjectLearningEffects;

        Builder() {}

        Builder(SubjectCardDTO subjectCardDTO) {
            id = subjectCardDTO.id;
            version = subjectCardDTO.version;
            createdDate = subjectCardDTO.createdDate;
            updatedDate = subjectCardDTO.updatedDate;
            valid = subjectCardDTO.valid;
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
            idStudyProgram = subjectCardDTO.idStudyProgram;
            subjectObjective = subjectCardDTO.subjectObjective;
            subjectPrerequisites = subjectCardDTO.subjectPrerequisites;
            literature = subjectCardDTO.literature;
            teachingTools = subjectCardDTO.teachingTools;
            subjectLearningEffects = subjectCardDTO.subjectLearningEffects;
        }

        private Builder(long id,
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
                        ModuleDTO module,
                        String idSupervisor,
                        SubjectKindDTO subjectKind,
                        CreditingFormDTO creditingForm,
                        long idStudyProgram,
                        Set<String> subjectObjective,
                        Set<String> subjectPrerequisites,
                        Set<LiteratureDTO> literature,
                        Set<String> teachingTools,
                        Set<SubjectLearningEffectDTO> subjectLearningEffects)
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
            this.idStudyProgram = idStudyProgram;
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
