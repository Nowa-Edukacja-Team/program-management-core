package pwr.newEducation.domain.learningEffect;

public class LearningEffectRangeEntity {
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdLearningEffectRange() {
        return id;
    }

    public LearningEffectRangeEntity() {}

    LearningEffectRangeEntity(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public LearningEffectRangeEntity.Builder withIdLearningEffectRange(long id) {
            this.id = id;
            return this;
        }

        public LearningEffectRangeEntity build() {
            return new LearningEffectRangeEntity(this);
        }
    }
}
