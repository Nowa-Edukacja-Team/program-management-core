package pwr.newEducation.domain.subjectCard;

public class SubjectKindDTO {
    private long idSubjectKind;
    private String name;

    private SubjectKindDTO() {}

    private SubjectKindDTO(SubjectKindDTO.Builder builder) {
        this.idSubjectKind = builder.idSubjectKind;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdSubjectKind() {
        return idSubjectKind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdSubjectKind(long idSubjectKind) {
        this.idSubjectKind = idSubjectKind;
    }

    public static Builder builder(SubjectKindDTO subjectKindDTO) {
        return new SubjectKindDTO.Builder(subjectKindDTO);
    }

    public static Builder builder(long idSubjectKind, String name) {
        return new SubjectKindDTO.Builder(idSubjectKind, name);
    }

    public static class Builder {
        private long idSubjectKind;
        private String name;

        Builder () {}

        Builder(SubjectKindDTO subjectKindDTO) {
            idSubjectKind = subjectKindDTO.idSubjectKind;
            name = subjectKindDTO.name;
        }

        Builder(long idSubjectKind, String name) {
            this.idSubjectKind = idSubjectKind;
            this.name = name;
        }

        public SubjectKindDTO build() {
            return new SubjectKindDTO(this);
        }
    }
}
