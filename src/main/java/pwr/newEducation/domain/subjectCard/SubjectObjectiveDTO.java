package pwr.newEducation.domain.subjectCard;

public class SubjectObjectiveDTO {
    private long idSubjectObjective;
    private String content;

    private SubjectObjectiveDTO(Builder builder) {
        this.idSubjectObjective = builder.idSubjectObjective;
        this.content = builder.content;
    }

    public long getIdSubjectObjective() {
        return idSubjectObjective;
    }

    public String getContent() {
        return content;
    }

    public void setIdSubjectObjective(long idSubjectObjective) {
        this.idSubjectObjective = idSubjectObjective;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Builder builder(long idSubjectObjective, String content) {
        return new Builder(idSubjectObjective, content);
    }

    public static class Builder {
        private long idSubjectObjective;
        private String content;
        
        Builder() {}
        
        Builder(SubjectObjectiveDTO subjectObjectiveDTO) {
            idSubjectObjective = subjectObjectiveDTO.idSubjectObjective;
            content = subjectObjectiveDTO.content;
        }

        private Builder(long idSubjectObjective, String content){
            this.idSubjectObjective = idSubjectObjective;
            this.content = content;
        }

        public SubjectObjectiveDTO build() {
            return new SubjectObjectiveDTO(this);
        }
    }
}
