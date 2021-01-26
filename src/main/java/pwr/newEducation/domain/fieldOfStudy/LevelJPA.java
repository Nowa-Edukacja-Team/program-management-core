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
    private long id;
    private String name;


    private LevelJPA(Builder builder){
        id = builder.id;
        name = builder.name;
    }

    public LevelJPA() {

    }

    public long getIdLevelJPA() {
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

        public LevelJPA build() {
            return new LevelJPA(this);
        }
    }
}