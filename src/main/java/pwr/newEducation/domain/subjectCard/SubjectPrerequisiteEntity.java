package pwr.newEducation.domain.subjectCard;

public class SubjectPrerequisiteEntity {
    private long id;
    private String content;

    private SubjectPrerequisiteEntity() {}

    private SubjectPrerequisiteEntity(Builder builder) {
        this.id = builder.id;
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

    public static Builder builder(long id, String content) {
        return new Builder(id, content);
    }

    public static class Builder {
        private long id;
        private String content;

        Builder () {}

        Builder(SubjectPrerequisiteEntity SubjectPrerequisiteEntity) {
            id = SubjectPrerequisiteEntity.id;
            content = SubjectPrerequisiteEntity.content;
        }

        Builder(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public SubjectPrerequisiteEntity build() {
            return new SubjectPrerequisiteEntity(this);
        }
    }
}
