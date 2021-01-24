package pwr.newEducation.domain.subjectCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubjectKindJPA {
    @Id
    @GeneratedValue
    private long idSubjectKind;
    private String name;

    public SubjectKindJPA(){}

    public String getName() {
        return name;
    }

    public long getIdSubjectKind() {
        return idSubjectKind;
    }

    public SubjectKindJPA(Builder builder) {
        this.idSubjectKind = builder.idSubjectKind;
        this.name = builder.name;
    }

    public static Builder builder (long idSubjectKind, String name) {
        return new Builder(idSubjectKind, name);
    }

    public static class Builder {
        private long idSubjectKind;
        private String name;

        Builder(){}

        Builder(long idSubjectKind, String name) {
            this.idSubjectKind = idSubjectKind;
            this.name = name;
        }

        public SubjectKindJPA build() {
            return new SubjectKindJPA(this);
        }
    }
}
