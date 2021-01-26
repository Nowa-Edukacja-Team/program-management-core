package pwr.newEducation.domain.learningEffect;

public class KnowledgeVerificationFormEntity {
    private long id;
    private String name;
    private float weight;

    private KnowledgeVerificationFormEntity() {}

    private KnowledgeVerificationFormEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.weight = builder.weight;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public static Builder builder(KnowledgeVerificationFormEntity knowledgeVerificationFormEntity) {
        return new Builder(knowledgeVerificationFormEntity);
    }

    public static Builder builder(long id, String name, float weight) {
        return new Builder(id, name, weight);
    }

    public static class Builder {
        private long id;
        private String name;
        private float weight;

        Builder () {}

        Builder(KnowledgeVerificationFormEntity knowledgeVerificationFormEntity) {
            id = knowledgeVerificationFormEntity.id;
            name = knowledgeVerificationFormEntity.name;
            weight = knowledgeVerificationFormEntity.weight;
        }

        Builder(long id, String name, float weight) {
            this.id = id;
            this.name = name;
            this.weight = weight;
        }

        public KnowledgeVerificationFormEntity build() {
            return new KnowledgeVerificationFormEntity(this);
        }
    }
}
