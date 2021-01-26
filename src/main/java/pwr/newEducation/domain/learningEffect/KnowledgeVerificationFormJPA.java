package pwr.newEducation.domain.learningEffect;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KnowledgeVerificationFormJPA {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private float weight;

    public KnowledgeVerificationFormJPA() {}

    private KnowledgeVerificationFormJPA(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.weight = builder.weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public long getIdKnowledgeVerificationForm() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdKnowledgeVerificationForm(long id) {
        this.id = id;
    }

    public static Builder builder(KnowledgeVerificationFormJPA knowledgeVerificationFormJPA) {
        return new Builder(knowledgeVerificationFormJPA);
    }

    public static Builder builder(long id, String name, float weight) {
        return new Builder(id, name, weight);
    }

    public static class Builder {
        private long id;
        private String name;
        private float weight;

        Builder () {}

        Builder(KnowledgeVerificationFormJPA knowledgeVerificationFormJPA) {
            id = knowledgeVerificationFormJPA.id;
            name = knowledgeVerificationFormJPA.name;
            weight = knowledgeVerificationFormJPA.weight;
        }

        Builder(long id, String name, float weight) {
            this.id = id;
            this.name = name;
            this.weight = weight;
        }

        public KnowledgeVerificationFormJPA build() {
            return new KnowledgeVerificationFormJPA(this);
        }
    }
}
