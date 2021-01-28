package pwr.newEducation.domain.learningEffect;

import javax.persistence.*;
import java.util.Set;

@Entity
public class LearningEffectJPA {
    @Id
    @GeneratedValue
    private long id;
    private String content;
    private String universalCharacteristics;
    private String qualificationCharacteristics;
    private String engCompQualificationCharacteristics;

    @OneToMany
    private Set<LearningEffectRangeJPA> learningEffectRanges;

    public long getIdLearningEffect() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getEngCompQualificationCharacteristics() {
        return engCompQualificationCharacteristics;
    }

    public String getQualificationCharacteristics() {
        return qualificationCharacteristics;
    }

    public String getUniversalCharacteristics() {
        return universalCharacteristics;
    }

    public Set<LearningEffectRangeJPA> getLearningEffectRanges() {
        return learningEffectRanges;
    }

    public LearningEffectJPA() {}

    LearningEffectJPA(Builder builder) {
        this.id = builder.id;
        this.universalCharacteristics = builder.universalCharacteristics;
        this.content = builder.content;
        this.engCompQualificationCharacteristics = builder.engCompQualificationCharacteristics;
        this.qualificationCharacteristics = builder.qualificationCharacteristics;
        this.learningEffectRanges = builder.learningEffectRanges;
    }

    public static Builder builder(String content, String universalCharacteristics, String qualificationCharacteristics,
                                  String engCompQualificationCharacteristics) {
        return new Builder(content, universalCharacteristics, qualificationCharacteristics,
                engCompQualificationCharacteristics);
    }

    public static class Builder {
        private long id;
        private String content;
        private String universalCharacteristics;
        private String qualificationCharacteristics;
        private String engCompQualificationCharacteristics;
        private Set<LearningEffectRangeJPA> learningEffectRanges;

        Builder() {}

        Builder(String content, String universalCharacteristics, String qualificationCharacteristics,
                String engCompQualificationCharacteristics) {
            this.content = content;
            this.engCompQualificationCharacteristics = engCompQualificationCharacteristics;
            this.qualificationCharacteristics = qualificationCharacteristics;
            this.universalCharacteristics = universalCharacteristics;
        }

        public Builder withIdLearningEffect(long id) {
            this.id = id;
            return this;
        }

        public Builder withLearningEffectRanges(Set<LearningEffectRangeJPA> learningEffectRanges) {
            this.learningEffectRanges = learningEffectRanges;
            return this;
        }

        public LearningEffectJPA build() {
            return new LearningEffectJPA(this);
        }
    }
}
