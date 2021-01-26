package pwr.newEducation.domain.subjectCard;

public class SubjectObjectiveEntity {
	private long id;
    private String content;

    private SubjectObjectiveEntity() {}

    private SubjectObjectiveEntity(Builder builder) {
        this.id = builder.id;
        this.content = builder.content;
    }

    public String getContent() {
        return content;
    }

    public long getIdSubjectObjective() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIdSubjectObjective(long id) {
        this.id = id;
    }

    public static Builder builder(SubjectObjectiveEntity SubjectObjectiveEntity) {
        return new Builder(SubjectObjectiveEntity);
    }

    public static Builder builder(long id, String content) {
        return new Builder(id, content);
    }

    public static class Builder {
        private long id;
        private String content;

        Builder () {}

        Builder(SubjectObjectiveEntity SubjectObjectiveEntity) {
            id = SubjectObjectiveEntity.id;
            content = SubjectObjectiveEntity.content;
        }

        Builder(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public SubjectObjectiveEntity build() {
            return new SubjectObjectiveEntity(this);
        }
    }
}
