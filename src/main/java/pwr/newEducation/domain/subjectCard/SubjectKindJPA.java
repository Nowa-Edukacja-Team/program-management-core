package pwr.newEducation.domain.subjectCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubjectKindJPA {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    public SubjectKindJPA(){}

    public String getName() {
        return name;
    }

    public long getIdSubjectKind() {
        return id;
    }

    public SubjectKindJPA(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder (long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder(){}

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public SubjectKindJPA build() {
            return new SubjectKindJPA(this);
        }
    }
}
