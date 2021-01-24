package pwr.newEducation.domain.subjectCard;

public class SubjectPrerequisiteEntity {
    private long idSubjectPrerequisite;
    private String content;

    private SubjectPrerequisiteEntity() {}

    private SubjectPrerequisiteEntity(Builder builder) {
        this.idSubjectPrerequisite = builder.idSubjectPrerequisite;
        this.content = builder.content;
    }

    public String getContent() {
        return content;
    }

    public long getIdSubjectPrerequisite() {
        return idSubjectPrerequisite;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIdSubjectPrerequisite(long idSubjectPrerequisite) {
        this.idSubjectPrerequisite = idSubjectPrerequisite;
    }

    public static Builder builder(SubjectPrerequisiteEntity SubjectPrerequisiteEntity) {
        return new Builder(SubjectPrerequisiteEntity);
    }

    public static Builder builder(long idSubjectPrerequisite, String content) {
        return new Builder(idSubjectPrerequisite, content);
    }

    public static class Builder {
        private long idSubjectPrerequisite;
        private String content;

        Builder () {}

        Builder(SubjectPrerequisiteEntity SubjectPrerequisiteEntity) {
            idSubjectPrerequisite = SubjectPrerequisiteEntity.idSubjectPrerequisite;
            content = SubjectPrerequisiteEntity.content;
        }

        Builder(long idSubjectPrerequisite, String content) {
            this.idSubjectPrerequisite = idSubjectPrerequisite;
            this.content = content;
        }

        public SubjectPrerequisiteEntity build() {
            return new SubjectPrerequisiteEntity(this);
        }
    }
}
