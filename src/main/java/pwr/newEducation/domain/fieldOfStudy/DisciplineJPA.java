package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DisciplineJPA {
    @Id
    @GeneratedValue
    public long id;
    public String name;

    public DisciplineJPA() {

    }

    public String getName() {
        return name;
    }

    public long getIdDiscipline() {
        return id;
    }

    public DisciplineJPA(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder (long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public DisciplineJPA build() {
            return new DisciplineJPA(this);
        }
    }
}
