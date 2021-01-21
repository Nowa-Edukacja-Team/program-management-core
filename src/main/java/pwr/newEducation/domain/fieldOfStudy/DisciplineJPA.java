package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DisciplineJPA {
    @Id
    @GeneratedValue
    public long idDisciplineJPA;
    public String name;

    public DisciplineJPA() {

    }

    public String getName() {
        return name;
    }

    public long getIdDisciplineJPA() {
        return idDisciplineJPA;
    }

    public DisciplineJPA(Builder builder) {
        this.idDisciplineJPA = builder.idDisciplineJPA;
        this.name = builder.name;
    }

    public static Builder builder (long idDisciplineJPA, String name) {
        return new Builder(idDisciplineJPA, name);
    }

    public static class Builder {
        private long idDisciplineJPA;
        private String name;

        Builder() {

        }

        Builder(long idDisciplineJPA, String name) {
            this.idDisciplineJPA = idDisciplineJPA;
            this.name = name;
        }

        public DisciplineJPA build() {
            return new DisciplineJPA(this);
        }
    }
}
