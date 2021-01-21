package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class FacultyJPA {
    @Id
    @GeneratedValue
    private long idFacultyJPA;
    private String name;


    private FacultyJPA(Builder builder){
        idFacultyJPA = builder.idFacultyJPA;
        name = builder.name;
    }

    public FacultyJPA() {

    }

    public long getIdFacultyJPA() {
        return idFacultyJPA;
    }

    public String getName() {
        return name;
    }

    public static Builder builder (long idFacultyJPA, String name) {
        return new Builder(idFacultyJPA, name);
    }

    public static class Builder {
        private long idFacultyJPA;
        private String name;

        Builder() {

        }

        Builder(long idFacultyJPA, String name) {
            this.idFacultyJPA = idFacultyJPA;
            this.name = name;
        }

        public FacultyJPA build() {
            return new FacultyJPA(this);
        }
    }
}
