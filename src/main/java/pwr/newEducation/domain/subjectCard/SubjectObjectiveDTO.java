package pwr.newEducation.domain.subjectCard;

public class SubjectObjectiveDTO {
    private String content;

    SubjectObjectiveDTO(Builder builder) {
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
        
        Builder(SubjectObjectiveDTO subjectObjectiveDTO) {
            content = subjectObjectiveDTO.content;
        }

        private Builder(String content){
            this.content = content;
        }

        public SubjectObjectiveDTO build() {
            return new SubjectObjectiveDTO(this);
        }
    }
}
