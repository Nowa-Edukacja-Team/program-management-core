package pwr.newEducation.domain.learningEffect;

public class LearningEffectRangeEntity {
    private long idLearningEffectRange;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdLearningEffectRange() {
        return idLearningEffectRange;
    }

    public LearningEffectRangeEntity() {}

    LearningEffectRangeEntity(Builder builder) {
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

        public LearningEffectRangeEntity.Builder withIdLearningEffectRange(long idLearningEffectRange) {
            this.idLearningEffectRange = idLearningEffectRange;
            return this;
        }

        public LearningEffectRangeEntity build() {
            return new LearningEffectRangeEntity(this);
        }
    }
}
