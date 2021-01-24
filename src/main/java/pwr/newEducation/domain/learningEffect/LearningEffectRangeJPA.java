package pwr.newEducation.domain.learningEffect;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class LearningEffectRangeJPA {
    @Id
    @GeneratedValue
    private long idLearningEffectRange;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdLearningEffectRange() {
        return idLearningEffectRange;
    }

    public LearningEffectRangeJPA() {}

    LearningEffectRangeJPA(Builder builder) {
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

        public LearningEffectRangeJPA build() {
            return new LearningEffectRangeJPA(this);
        }
    }
}
