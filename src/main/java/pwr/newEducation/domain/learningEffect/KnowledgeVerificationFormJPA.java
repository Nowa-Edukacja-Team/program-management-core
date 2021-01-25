package pwr.newEducation.domain.learningEffect;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KnowledgeVerificationFormJPA {
    @Id
    @GeneratedValue
    private long idKnowledgeVerificationForm;
    private String name;
    private float weight;

    public KnowledgeVerificationFormJPA() {}

    private KnowledgeVerificationFormJPA(Builder builder) {
        this.idKnowledgeVerificationForm = builder.idKnowledgeVerificationForm;
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
        return idKnowledgeVerificationForm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdKnowledgeVerificationForm(long idKnowledgeVerificationForm) {
        this.idKnowledgeVerificationForm = idKnowledgeVerificationForm;
    }

    public static Builder builder(KnowledgeVerificationFormJPA knowledgeVerificationFormJPA) {
        return new Builder(knowledgeVerificationFormJPA);
    }

    public static Builder builder(long idKnowledgeVerificationForm, String name, float weight) {
        return new Builder(idKnowledgeVerificationForm, name, weight);
    }

    public static class Builder {
        private long idKnowledgeVerificationForm;
        private String name;
        private float weight;

        Builder () {}

        Builder(KnowledgeVerificationFormJPA knowledgeVerificationFormJPA) {
            idKnowledgeVerificationForm = knowledgeVerificationFormJPA.idKnowledgeVerificationForm;
            name = knowledgeVerificationFormJPA.name;
            weight = knowledgeVerificationFormJPA.weight;
        }

        Builder(long idKnowledgeVerificationForm, String name, float weight) {
            this.idKnowledgeVerificationForm = idKnowledgeVerificationForm;
            this.name = name;
            this.weight = weight;
        }

        public KnowledgeVerificationFormJPA build() {
            return new KnowledgeVerificationFormJPA(this);
        }
    }
}
