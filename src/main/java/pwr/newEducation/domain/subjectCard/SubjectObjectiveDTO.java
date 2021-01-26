package pwr.newEducation.domain.subjectCard;

public class SubjectObjectiveDTO {
    private long id;
    private String content;

    private SubjectObjectiveDTO(Builder builder) {
        this.id = builder.id;
        this.content = builder.content;
    }

    public long getIdSubjectObjective() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setIdSubjectObjective(long id) {
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
        
        Builder(SubjectObjectiveDTO subjectObjectiveDTO) {
            id = subjectObjectiveDTO.id;
            content = subjectObjectiveDTO.content;
        }

        private Builder(long id, String content){
            this.id = id;
            this.content = content;
        }

        public SubjectObjectiveDTO build() {
            return new SubjectObjectiveDTO(this);
        }
    }
}
