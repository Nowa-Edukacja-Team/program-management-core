package pwr.newEducation.domain.subjectCard;

public class SubjectPrerequisiteEntity {
    private long id;
    private String content;

    private SubjectPrerequisiteEntity() {}

    private SubjectPrerequisiteEntity(Builder builder) {
        this.content = builder.content;
    }

    public String getContent() {
        return content;
    }

    public long getIdSubjectPrerequisite() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIdSubjectPrerequisite(long id) {
        this.id = id;
    }

    public static Builder builder(SubjectPrerequisiteEntity SubjectPrerequisiteEntity) {
        return new Builder(SubjectPrerequisiteEntity);
    }

    public static Builder builder(String content) {
        return new Builder(content);
    }

    public static class Builder {
        private String content;

        Builder () {}

        Builder(SubjectPrerequisiteEntity SubjectPrerequisiteEntity) {
            content = SubjectPrerequisiteEntity.content;
        }

        Builder(String content) {
            this.content = content;
        }

        public SubjectPrerequisiteEntity build() {
            return new SubjectPrerequisiteEntity(this);
        }
    }
}
