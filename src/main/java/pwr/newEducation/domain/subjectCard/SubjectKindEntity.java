package pwr.newEducation.domain.subjectCard;

public class SubjectKindEntity {
    private long id;
    private String name;

    private SubjectKindEntity() {}

    private SubjectKindEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdSubjectKind() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdSubjectKind(long id) {
        this.id = id;
    }

    public static Builder builder(SubjectKindEntity subjectKindEntity) {
        return new Builder(subjectKindEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder () {}

        Builder(SubjectKindEntity subjectKindEntity) {
            id = subjectKindEntity.id;
            name = subjectKindEntity.name;
        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public SubjectKindEntity build() {
            return new SubjectKindEntity(this);
        }
    }
}
