package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.learningEffect.SubjectLearningEffectJPA;
import pwr.newEducation.domain.studyProgram.ModuleJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class SubjectCardJPA implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Id
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
    @ManyToOne
    private ModuleJPA module;
    private String idSupervisor;
    @ManyToOne
    private SubjectKindJPA subjectKind;
    @ManyToOne
    private CreditingFormJPA creditingForm;
    private long idStudyProgram;
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

    public ModuleJPA getModule() {
        return module;
    }

    public void setModule(ModuleJPA module) {
        this.module = module;
    }

    public CreditingFormJPA getCreditingForm() {
        return creditingForm;
    }

    public void setCreditingForm(CreditingFormJPA creditingForm) {
        this.creditingForm = creditingForm;
    }

    public long getIdStudyProgram() {
        return idStudyProgram;
    }

    public void setIdStudyProgram(long idStudyProgram) {
        this.idStudyProgram = idStudyProgram;
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

    public SubjectKindJPA getSubjectKind() {
        return subjectKind;
    }

    public void setSubjectKind(SubjectKindJPA subjectKind) {
        this.subjectKind = subjectKind;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public SubjectCardJPA() {}

    private SubjectCardJPA(Builder builder) {
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

    public static Builder builder(SubjectCardJPA subjectCardJPA) {
        return new Builder(subjectCardJPA);
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
                                  ModuleJPA module,
                                  String idSupervisor,
                                  SubjectKindJPA subjectKind,
                                  CreditingFormJPA creditingForm,
                                  long idStudyProgram,
                                  Set<SubjectObjectiveJPA> subjectObjective,
                                  Set<SubjectPrerequisiteJPA> subjectPrerequisites,
                                  Set<LiteratureJPA> literature,
                                  Set<TeachingToolJPA> teachingTools,
                                  Set<SubjectLearningEffectJPA> subjectLearningEffects)
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
        private ModuleJPA module;
        private String idSupervisor;
        private SubjectKindJPA subjectKind;
        private CreditingFormJPA creditingForm;
        private long idStudyProgram;
        private Set<SubjectObjectiveJPA> subjectObjective;
        private Set<SubjectPrerequisiteJPA> subjectPrerequisites;
        private Set<LiteratureJPA> literature;
        private Set<TeachingToolJPA> teachingTools;
        private Set<SubjectLearningEffectJPA> subjectLearningEffects;

        Builder() {}

        Builder(SubjectCardJPA subjectCardJPA) {
            id = subjectCardJPA.id;
            version = subjectCardJPA.version;
            createdDate = subjectCardJPA.createdDate;
            updatedDate = subjectCardJPA.updatedDate;
            valid = subjectCardJPA.valid;
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
            idStudyProgram = subjectCardJPA.idStudyProgram;
            subjectObjective = subjectCardJPA.subjectObjective;
            subjectPrerequisites = subjectCardJPA.subjectPrerequisites;
            literature = subjectCardJPA.literature;
            teachingTools = subjectCardJPA.teachingTools;
            subjectLearningEffects = subjectCardJPA.subjectLearningEffects;
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
                         ModuleJPA module,
                         String idSupervisor,
                         SubjectKindJPA subjectKind,
                         CreditingFormJPA creditingForm,
                         long idStudyProgram,
                         Set<SubjectObjectiveJPA> subjectObjective,
                         Set<SubjectPrerequisiteJPA> subjectPrerequisites,
                         Set<LiteratureJPA> literature,
                         Set<TeachingToolJPA> teachingTools,
                         Set<SubjectLearningEffectJPA> subjectLearningEffects)
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

        public SubjectCardJPA build() {
            return new SubjectCardJPA(this);
        }
    }
}
