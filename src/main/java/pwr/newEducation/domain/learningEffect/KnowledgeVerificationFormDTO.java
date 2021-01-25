package pwr.newEducation.domain.learningEffect;

public class KnowledgeVerificationFormDTO {
    private long idKnowledgeVerificationForm;
    private String name;
    private float weight;

    private KnowledgeVerificationFormDTO() {}

    private KnowledgeVerificationFormDTO(Builder builder) {
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

    public static Builder builder(KnowledgeVerificationFormDTO knowledgeVerificationFormDTO) {
        return new Builder(knowledgeVerificationFormDTO);
    }

    public static Builder builder(long idKnowledgeVerificationForm, String name, float weight) {
        return new Builder(idKnowledgeVerificationForm, name, weight);
    }

    public static class Builder {
        private long idKnowledgeVerificationForm;
        private String name;
        private float weight;

        Builder () {}

        Builder(KnowledgeVerificationFormDTO knowledgeVerificationFormDTO) {
            idKnowledgeVerificationForm = knowledgeVerificationFormDTO.idKnowledgeVerificationForm;
            name = knowledgeVerificationFormDTO.name;
            weight = knowledgeVerificationFormDTO.weight;
        }

        Builder(long idKnowledgeVerificationForm, String name, float weight) {
            this.idKnowledgeVerificationForm = idKnowledgeVerificationForm;
            this.name = name;
            this.weight = weight;
        }

        public KnowledgeVerificationFormDTO build() {
            return new KnowledgeVerificationFormDTO(this);
        }
    }
}
