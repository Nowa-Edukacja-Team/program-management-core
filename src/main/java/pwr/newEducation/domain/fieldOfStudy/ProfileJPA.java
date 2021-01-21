package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ProfileJPA {
    @Id
    @GeneratedValue
    private long idProfileJPA;
    private String name;


    private ProfileJPA(Builder builder){
        idProfileJPA = builder.idProfileJPA;
        name = builder.name;
    }

    public ProfileJPA() {

    }

    public long getIdProfileJPA() {
        return idProfileJPA;
    }

    public String getName() {
        return name;
    }

    public static Builder builder (long idProfileJPA, String name) {
        return new Builder(idProfileJPA, name);
    }

    public static class Builder {
        private long idProfileJPA;
        private String name;

        Builder() {

        }

        Builder(long idProfileJPA, String name) {
            this.idProfileJPA = idProfileJPA;
            this.name = name;
        }

        public ProfileJPA build() {
            return new ProfileJPA(this);
        }
    }
}
