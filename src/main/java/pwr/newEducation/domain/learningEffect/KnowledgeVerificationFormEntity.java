package pwr.newEducation.domain.learningEffect;

public class KnowledgeVerificationFormEntity {
    private long idKnowledgeVerificationForm;
    private String name;
    private float weight;

    private KnowledgeVerificationFormEntity() {}

    private KnowledgeVerificationFormEntity(Builder builder) {
        this.idKnowledgeVerificationForm = builder.idKnowledgeVerificationForm;
        this.name = builder.name;
        this.weight = builder.weight;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public static Builder builder(KnowledgeVerificationFormEntity knowledgeVerificationFormEntity) {
        return new Builder(knowledgeVerificationFormEntity);
    }

    public static Builder builder(long idKnowledgeVerificationForm, String name, float weight) {
        return new Builder(idKnowledgeVerificationForm, name, weight);
    }

    public static class Builder {
        private long idKnowledgeVerificationForm;
        private String name;
        private float weight;

        Builder () {}

        Builder(KnowledgeVerificationFormEntity knowledgeVerificationFormEntity) {
            idKnowledgeVerificationForm = knowledgeVerificationFormEntity.idKnowledgeVerificationForm;
            name = knowledgeVerificationFormEntity.name;
            weight = knowledgeVerificationFormEntity.weight;
        }

        Builder(long idKnowledgeVerificationForm, String name, float weight) {
            this.idKnowledgeVerificationForm = idKnowledgeVerificationForm;
            this.name = name;
            this.weight = weight;
        }

        public KnowledgeVerificationFormEntity build() {
            return new KnowledgeVerificationFormEntity(this);
        }
    }
}
