package pwr.newEducation.domain.learningEffect;

public class LearningEffectEntity {
    private long idLearningEffect;
    private String content;
    private String universalCharacteristics;
    private String qualificationCharacteristics;
    private String engCompQualificationCharacteristics;

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

    public LearningEffectEntity() {}

    public LearningEffectEntity(Builder builder) {

    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long idLearningEffect;
        private String content;
        private String universalCharacteristics;
        private String qualificationCharacteristics;
        private String engCompQualificationCharacteristics;

        Builder() {}

        Builder(String content, String universalCharacteristics, String qualificationCharacteristics,
                String engCompQualificationCharacteristics) {
            this.content = content;
            this.engCompQualificationCharacteristics = engCompQualificationCharacteristics;
            this.qualificationCharacteristics = qualificationCharacteristics;
            this.universalCharacteristics = universalCharacteristics;
        }
    }
}
