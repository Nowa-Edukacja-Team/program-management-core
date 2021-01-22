package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class LearningCycleJPA {
    @Id
    @GeneratedValue
    private long idLearningCycleJPA;
    private String name;


    private LearningCycleJPA(Builder builder){
        idLearningCycleJPA = builder.idLearningCycleJPA;
        name = builder.name;
    }

    public LearningCycleJPA() {

    }

    public long getIdLearningCycleJPA() {
        return idLearningCycleJPA;
    }

    public String getName() {
        return name;
    }

    public static Builder builder (long idLearningCycleJPA, String name) {
        return new Builder(idLearningCycleJPA, name);
    }

    public static class Builder {
        private long idLearningCycleJPA;
        private String name;

        Builder() {

        }

        Builder(long idLearningCycleJPA, String name) {
            this.idLearningCycleJPA = idLearningCycleJPA;
            this.name = name;
        }

        public LearningCycleJPA build() {
            return new LearningCycleJPA(this);
        }
    }
}
