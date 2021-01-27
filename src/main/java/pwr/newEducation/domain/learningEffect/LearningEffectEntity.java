package pwr.newEducation.domain.learningEffect;

import java.util.Set;

public class LearningEffectEntity {
    private String id;
    private String content;
    private String universalCharacteristics;
    private String qualificationCharacteristics;
    private String engCompQualificationCharacteristics;
    private Set<LearningEffectRangeEntity> learningEffectRanges;

    public String getIdLearningEffect() {
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

    public Set<LearningEffectRangeEntity> getLearningEffectRanges() {
        return learningEffectRanges;
    }

    public LearningEffectEntity() {}

    LearningEffectEntity(LearningEffectEntity.Builder builder) {
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
        private String id;
        private String content;
        private String universalCharacteristics;
        private String qualificationCharacteristics;
        private String engCompQualificationCharacteristics;
        private Set<LearningEffectRangeEntity> learningEffectRanges;

        Builder() {}

        Builder(String content, String universalCharacteristics, String qualificationCharacteristics,
                String engCompQualificationCharacteristics) {
            this.content = content;
            this.engCompQualificationCharacteristics = engCompQualificationCharacteristics;
            this.qualificationCharacteristics = qualificationCharacteristics;
            this.universalCharacteristics = universalCharacteristics;
        }

        public Builder withIdLearningEffect(String id) {
            this.id = id;
            return this;
        }

        public Builder withLearningEffectRanges(Set<LearningEffectRangeEntity> learningEffectRanges) {
            this.learningEffectRanges = learningEffectRanges;
            return this;
        }

        public LearningEffectEntity build() {
            return new LearningEffectEntity(this);
        }
    }
}
