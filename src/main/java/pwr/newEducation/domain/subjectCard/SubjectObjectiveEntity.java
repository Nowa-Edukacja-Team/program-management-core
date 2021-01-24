package pwr.newEducation.domain.subjectCard;

public class SubjectObjectiveEntity {
	private long idSubjectObjective;
    private String content;

    private SubjectObjectiveEntity() {}

    private SubjectObjectiveEntity(Builder builder) {
        this.idSubjectObjective = builder.idSubjectObjective;
        this.content = builder.content;
    }

    public String getContent() {
        return content;
    }

    public long getIdSubjectObjective() {
        return idSubjectObjective;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIdSubjectObjective(long idSubjectObjective) {
        this.idSubjectObjective = idSubjectObjective;
    }

    public static Builder builder(SubjectObjectiveEntity SubjectObjectiveEntity) {
        return new Builder(SubjectObjectiveEntity);
    }

    public static Builder builder(long idSubjectObjective, String content) {
        return new Builder(idSubjectObjective, content);
    }

    public static class Builder {
        private long idSubjectObjective;
        private String content;

        Builder () {}

        Builder(SubjectObjectiveEntity SubjectObjectiveEntity) {
            idSubjectObjective = SubjectObjectiveEntity.idSubjectObjective;
            content = SubjectObjectiveEntity.content;
        }

        Builder(long idSubjectObjective, String content) {
            this.idSubjectObjective = idSubjectObjective;
            this.content = content;
        }

        public SubjectObjectiveEntity build() {
            return new SubjectObjectiveEntity(this);
        }
    }
}
