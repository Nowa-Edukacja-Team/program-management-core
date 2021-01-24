package pwr.newEducation.domain.subjectCard;

import javax.persistence.*;

@Entity
public class SubjectObjectiveJPA {
    @Id
    @GeneratedValue
    public long idSubjectObjective;
    public String content;

    public SubjectObjectiveJPA() {}

    public SubjectObjectiveJPA(Builder builder) {
        idSubjectObjective = builder.idSubjectObjective;
        content = builder.content;
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


    public static Builder builder (long idSubjectObjective, String content) {
        return new Builder(idSubjectObjective, content);
    }

    public static class Builder {
        public long idSubjectObjective;
        public String content;

        Builder() {}

        Builder(long idSubjectObjective, String content) {
            this.idSubjectObjective = idSubjectObjective;
            this.content = content;
        }

        public SubjectObjectiveJPA build() {
            return new SubjectObjectiveJPA(this);
        }
    }
}
