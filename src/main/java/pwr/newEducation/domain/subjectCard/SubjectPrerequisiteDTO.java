package pwr.newEducation.domain.subjectCard;

public class SubjectPrerequisiteDTO {
    private long id;
    private String content;

    private SubjectPrerequisiteDTO(Builder builder) {
        this.id = builder.id;
        this.content = builder.content;
    }

    public long getIdSubjectPrerequisite() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setIdSubjectPrerequisite(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Builder builder(long id, String content) {
        return new Builder(id, content);
    }

    public static class Builder {
        private long id;
        private String content;

        Builder() {}

        Builder(SubjectPrerequisiteDTO subjectPrerequisiteDTO) {
            id = subjectPrerequisiteDTO.id;
            content = subjectPrerequisiteDTO.content;
        }

        private Builder(long id, String content){
            this.id = id;
            this.content = content;
        }

        public SubjectPrerequisiteDTO build() {
            return new SubjectPrerequisiteDTO(this);
        }
    }
}
