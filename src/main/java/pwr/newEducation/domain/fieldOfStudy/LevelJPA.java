package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class LevelJPA {
    @Id
    @GeneratedValue
    private long idLevelJPA;
    private String name;


    private LevelJPA(Builder builder){
        idLevelJPA = builder.idLevelJPA;
        name = builder.name;
    }

    public LevelJPA() {

    }

    public long getIdLevelJPA() {
        return idLevelJPA;
    }

    public String getName() {
        return name;
    }

    public static Builder builder (long idLevelJPA, String name) {
        return new Builder(idLevelJPA, name);
    }

    public static class Builder {
        private long idLevelJPA;
        private String name;

        Builder() {

        }

        Builder(long idLevelJPA, String name) {
            this.idLevelJPA = idLevelJPA;
            this.name = name;
        }

        public LevelJPA build() {
            return new LevelJPA(this);
        }
    }
}