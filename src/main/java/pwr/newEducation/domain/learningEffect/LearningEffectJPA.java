package pwr.newEducation.domain.learningEffect;

import javax.persistence.*;
import java.util.Set;

@Entity
public class LearningEffectJPA {
    @Id
    @GeneratedValue
    private long idLearningEffect;
    private String content;
    private String universalCharacteristics;
    private String qualificationCharacteristics;
    private String engCompQualificationCharacteristics;

    @OneToMany
    private Set<LearningEffectRangeJPA> learningEffectRanges;

    public long getIdLearningEffect() {
        return idLearningEffect;
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
        this.idLearningEffect = builder.idLearningEffect;
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
        private long idLearningEffect;
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

        public Builder withIdLearningEffect(long idLearningEffect) {
            this.idLearningEffect = idLearningEffect;
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
