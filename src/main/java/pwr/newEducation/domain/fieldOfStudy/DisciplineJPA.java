package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DisciplineJPA {
    @Id
    @GeneratedValue
    public long idDiscipline;
    public String name;

    public DisciplineJPA() {

    }

    public String getName() {
        return name;
    }

    public long getIdDiscipline() {
        return idDiscipline;
    }

    public DisciplineJPA(Builder builder) {
        this.idDiscipline = builder.idDiscipline;
        this.name = builder.name;
    }

    public static Builder builder (long idDiscipline, String name) {
        return new Builder(idDiscipline, name);
    }

    public static class Builder {
        private long idDiscipline;
        private String name;

        Builder() {

        }

        Builder(long idDiscipline, String name) {
            this.idDiscipline = idDiscipline;
            this.name = name;
        }

        public DisciplineJPA build() {
            return new DisciplineJPA(this);
        }
    }
}
