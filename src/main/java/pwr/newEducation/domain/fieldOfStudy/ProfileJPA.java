package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ProfileJPA {
    @Id
    @GeneratedValue
    private long id;
    private String name;


    private ProfileJPA(Builder builder){
        id = builder.id;
        name = builder.name;
    }

    public ProfileJPA() {

    }

    public long getIdProfileJPA() {
        return id;
    }

    public String getName() {
        return name;
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

        public ProfileJPA build() {
            return new ProfileJPA(this);
        }
    }
}
