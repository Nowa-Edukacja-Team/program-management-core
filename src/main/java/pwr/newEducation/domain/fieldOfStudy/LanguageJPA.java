package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class LanguageJPA {
    @Id
    @GeneratedValue
    private long idLanguageJPA;
    private String name;


    private LanguageJPA(Builder builder){
        idLanguageJPA = builder.idLanguageJPA;
        name = builder.name;
    }

    public LanguageJPA() {

    }

    public long getIdLanguageJPA() {
        return idLanguageJPA;
    }

    public String getName() {
        return name;
    }

    public static Builder builder (long idLanguageJPA, String name) {
        return new Builder(idLanguageJPA, name);
    }

    public static class Builder {
        private long idLanguageJPA;
        private String name;

        Builder() {

        }

        Builder(long idLanguageJPA, String name) {
            this.idLanguageJPA = idLanguageJPA;
            this.name = name;
        }

        public LanguageJPA build() {
            return new LanguageJPA(this);
        }
    }
}
