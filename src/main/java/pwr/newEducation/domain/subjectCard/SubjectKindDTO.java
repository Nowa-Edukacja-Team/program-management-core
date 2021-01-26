package pwr.newEducation.domain.subjectCard;

public class SubjectKindDTO {
    private long id;
    private String name;

    private SubjectKindDTO() {}

    private SubjectKindDTO(SubjectKindDTO.Builder builder) {
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

    public static Builder builder(SubjectKindDTO subjectKindDTO) {
        return new SubjectKindDTO.Builder(subjectKindDTO);
    }

    public static Builder builder(long id, String name) {
        return new SubjectKindDTO.Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder () {}

        Builder(SubjectKindDTO subjectKindDTO) {
            id = subjectKindDTO.id;
            name = subjectKindDTO.name;
        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public SubjectKindDTO build() {
            return new SubjectKindDTO(this);
        }
    }
}
