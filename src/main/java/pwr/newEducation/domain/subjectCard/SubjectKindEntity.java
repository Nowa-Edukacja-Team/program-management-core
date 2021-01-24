package pwr.newEducation.domain.subjectCard;

public class SubjectKindEntity {
    private long idSubjectKind;
    private String name;

    private SubjectKindEntity() {}

    private SubjectKindEntity(Builder builder) {
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

    public static Builder builder(SubjectKindEntity subjectKindEntity) {
        return new Builder(subjectKindEntity);
    }

    public static Builder builder(long idSubjectKind, String name) {
        return new Builder(idSubjectKind, name);
    }

    public static class Builder {
        private long idSubjectKind;
        private String name;

        Builder () {}

        Builder(SubjectKindEntity subjectKindEntity) {
            idSubjectKind = subjectKindEntity.idSubjectKind;
            name = subjectKindEntity.name;
        }

        Builder(long idSubjectKind, String name) {
            this.idSubjectKind = idSubjectKind;
            this.name = name;
        }

        public SubjectKindEntity build() {
            return new SubjectKindEntity(this);
        }
    }
}
