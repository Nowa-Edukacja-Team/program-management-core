package pwr.newEducation.domain.subjectCard;

public class SubjectPrerequisiteDTO {
    private String content;

    SubjectPrerequisiteDTO(Builder builder) {
        this.content = builder.content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Builder builder(String content) {
        return new Builder(content);
    }

    public static class Builder {
        private String content;

        Builder() {}

        Builder(SubjectPrerequisiteDTO subjectPrerequisiteDTO) {
            content = subjectPrerequisiteDTO.content;
        }

        private Builder(String content){
            this.content = content;
        }

        public SubjectPrerequisiteDTO build() {
            return new SubjectPrerequisiteDTO(this);
        }
    }
}
