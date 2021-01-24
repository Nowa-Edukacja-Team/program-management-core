package pwr.newEducation.domain.subjectCard;

public class SubjectPrerequisiteDTO {
    private long idSubjectPrerequisite;
    private String content;

    private SubjectPrerequisiteDTO(Builder builder) {
        this.idSubjectPrerequisite = builder.idSubjectPrerequisite;
        this.content = builder.content;
    }

    public long getIdSubjectPrerequisite() {
        return idSubjectPrerequisite;
    }

    public String getContent() {
        return content;
    }

    public void setIdSubjectPrerequisite(long idSubjectPrerequisite) {
        this.idSubjectPrerequisite = idSubjectPrerequisite;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Builder builder(long idSubjectPrerequisite, String content) {
        return new Builder(idSubjectPrerequisite, content);
    }

    public static class Builder {
        private long idSubjectPrerequisite;
        private String content;

        Builder() {}

        Builder(SubjectPrerequisiteDTO subjectPrerequisiteDTO) {
            idSubjectPrerequisite = subjectPrerequisiteDTO.idSubjectPrerequisite;
            content = subjectPrerequisiteDTO.content;
        }

        private Builder(long idSubjectPrerequisite, String content){
            this.idSubjectPrerequisite = idSubjectPrerequisite;
            this.content = content;
        }

        public SubjectPrerequisiteDTO build() {
            return new SubjectPrerequisiteDTO(this);
        }
    }
}
