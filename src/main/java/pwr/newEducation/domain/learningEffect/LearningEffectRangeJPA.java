package pwr.newEducation.domain.learningEffect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LearningEffectRangeJPA {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdLearningEffectRange() {
        return id;
    }

    public LearningEffectRangeJPA() {}

    LearningEffectRangeJPA(Builder builder) {
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

        public LearningEffectRangeJPA build() {
            return new LearningEffectRangeJPA(this);
        }
    }
}
