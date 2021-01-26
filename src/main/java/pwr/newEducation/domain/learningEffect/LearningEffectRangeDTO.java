package pwr.newEducation.domain.learningEffect;

public class LearningEffectRangeDTO {
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdLearningEffectRange() {
        return id;
    }

    public LearningEffectRangeDTO() {}

    LearningEffectRangeDTO(Builder builder) {
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

        public Builder withIdLearningEffectRange(long id) {
            this.id = id;
            return this;
        }

        public LearningEffectRangeDTO build() {
            return new LearningEffectRangeDTO(this);
        }
    }
}
