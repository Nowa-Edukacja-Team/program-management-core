package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.studyProgram.ModuleJPA;
import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;

public class SubjectCardJPA {
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
    @OneToMany
    private Set<ModuleJPA> module;
    private int idSupervisor;
    @OneToMany
    private Set<SubjectKindJPA> subjectKind;
    @OneToMany
    private Set<CreditingFormJPA> creditingForm;
    @OneToMany
    private Set<StudyProgramJPA> studyProgram;
    @ManyToOne
    private Set<SubjectObjectiveJPA> subjectObjectiveJPA;

    public Set<SubjectKindJPA> getSubjectKind() {
        return subjectKind;
    }

    public void setSubjectKind(Set<SubjectKindJPA> subjectKind) {
        this.subjectKind = subjectKind;
    }

    public long getIdSubjectCards() {
        return idSubjectCards;
    }

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

    public Set<SubjectObjectiveJPA> getSubjectObjectiveJPA() {
        return subjectObjectiveJPA;
    }

    public void setSubjectObjectiveJPA(Set<SubjectObjectiveJPA> subjectObjectiveJPA) {
        this.subjectObjectiveJPA = subjectObjectiveJPA;
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

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    private SubjectCardJPA() {}

    private SubjectCardJPA(SubjectCardJPA.Builder builder) {
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
                                    Set<SubjectObjectiveJPA> subjectObjective)
    {
        return new Builder(idSubjectCards, version, createdDate, updatedDate, validFromDate,
                isCurrent, subjectCode, name, isGroup, zzuHours, cnpsHours, subjectECTS,
                semester, lastSemester, module, idSupervisor, subjectKind, creditingForm,
                studyProgram, subjectObjective);
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
        private Set<SubjectObjectiveJPA> subjectObjectiveJPA;

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
            subjectObjectiveJPA = subjectCardJPA.subjectObjectiveJPA;
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
                         Set<SubjectObjectiveJPA> subjectObjectiveJPA)
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
            this.subjectObjectiveJPA = subjectObjectiveJPA;
        }

        public SubjectCardJPA build() {
            return new SubjectCardJPA(this);
        }
    }
}
