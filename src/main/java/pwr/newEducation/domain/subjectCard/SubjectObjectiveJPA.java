package pwr.newEducation.domain.subjectCard;

import javax.persistence.*;

@Entity
public class SubjectObjectiveJPA {
    @Id
    @GeneratedValue
    public long id;
    public String content;

    public SubjectObjectiveJPA() {}

    public SubjectObjectiveJPA(Builder builder) {
        id = builder.id;
        content = builder.content;
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


    public static Builder builder (long id, String content) {
        return new Builder(id, content);
    }

    public static class Builder {
        public long id;
        public String content;

        Builder() {}

        Builder(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public SubjectObjectiveJPA build() {
            return new SubjectObjectiveJPA(this);
        }
    }
}
