package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ModeJPA {
    @Id
    @GeneratedValue
    private long idModeJPA;
    private String name;


    private ModeJPA(Builder builder){
        idModeJPA = builder.idModeJPA;
        name = builder.name;
    }

    public ModeJPA() {

    }

    public long getIdModeJPA() {
        return idModeJPA;
    }

    public String getName() {
        return name;
    }

    public static Builder builder (long idModeJPA, String name) {
        return new Builder(idModeJPA, name);
    }

    public static class Builder {
        private long idModeJPA;
        private String name;

        Builder() {

        }

        Builder(long idModeJPA, String name) {
            this.idModeJPA = idModeJPA;
            this.name = name;
        }

        public ModeJPA build() {
            return new ModeJPA(this);
        }
    }
}
