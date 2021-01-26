package pwr.newEducation.domain.learningEffect;

public class KnowledgeVerificationFormDTO {
    private long id;
    private String name;
    private float weight;

    private KnowledgeVerificationFormDTO() {}

    private KnowledgeVerificationFormDTO(Builder builder) {
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

    public static Builder builder(KnowledgeVerificationFormDTO knowledgeVerificationFormDTO) {
        return new Builder(knowledgeVerificationFormDTO);
    }

    public static Builder builder(long id, String name, float weight) {
        return new Builder(id, name, weight);
    }

    public static class Builder {
        private long id;
        private String name;
        private float weight;

        Builder () {}

        Builder(KnowledgeVerificationFormDTO knowledgeVerificationFormDTO) {
            id = knowledgeVerificationFormDTO.id;
            name = knowledgeVerificationFormDTO.name;
            weight = knowledgeVerificationFormDTO.weight;
        }

        Builder(long id, String name, float weight) {
            this.id = id;
            this.name = name;
            this.weight = weight;
        }

        public KnowledgeVerificationFormDTO build() {
            return new KnowledgeVerificationFormDTO(this);
        }
    }
}
