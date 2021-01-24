package pwr.newEducation.domain.learningEffect;

public class LearningEffectRangeDTO {
    private long idLearningEffectRange;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdLearningEffectRange() {
        return idLearningEffectRange;
    }

    public LearningEffectRangeDTO() {}

    LearningEffectRangeDTO(Builder builder) {
        this.name = builder.name;
        this.idLearningEffectRange = builder.idLearningEffectRange;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long idLearningEffectRange;
        private String name;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdLearningEffectRange(long idLearningEffectRange) {
            this.idLearningEffectRange = idLearningEffectRange;
            return this;
        }

        public LearningEffectRangeDTO build() {
            return new LearningEffectRangeDTO(this);
        }
    }
}
