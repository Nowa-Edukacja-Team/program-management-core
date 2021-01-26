package pwr.newEducation.domain.learningEffect;

import java.util.Set;

public class LearningEffectDTO {
    private long id;
    private String content;
    private String universalCharacteristics;
    private String qualificationCharacteristics;
    private String engCompQualificationCharacteristics;
    private Set<LearningEffectRangeDTO> learningEffectRanges;

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

    public Set<LearningEffectRangeDTO> getLearningEffectRanges() {
        return learningEffectRanges;
    }

    public LearningEffectDTO() {}

    LearningEffectDTO(Builder builder) {
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
        private Set<LearningEffectRangeDTO> learningEffectRanges;

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

        public Builder withLearningEffectRanges(Set<LearningEffectRangeDTO> learningEffectRanges) {
            this.learningEffectRanges = learningEffectRanges;
            return this;
        }

        public LearningEffectDTO build() {
            return new LearningEffectDTO(this);
        }
    }
}
