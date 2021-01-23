package pwr.newEducation.domain.fieldOfStudy;

public class LearningCycleEntity {
    private long idLearningCycleEntity;
    private String name;

    private LearningCycleEntity() {

    }

    private LearningCycleEntity(Builder builder) {
        this.idLearningCycleEntity = builder.idLearningCycleEntity;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLearningCycleEntity() {
        return idLearningCycleEntity;
    }

    public static Builder builder(LearningCycleEntity learningCycleEntity) {
        return new Builder(learningCycleEntity);
    }

    public static Builder builder(long idLearningCycleEntity, String name) {
        return new Builder(idLearningCycleEntity, name);
    }

    public static class Builder {
        private long idLearningCycleEntity;
        private String name;

        Builder() {

        }

        Builder(LearningCycleEntity learningCycleEntity) {
            idLearningCycleEntity = learningCycleEntity.idLearningCycleEntity;
            name = learningCycleEntity.name;
        }

        private Builder(long idLearningCycleEntity, String name) {
            this.idLearningCycleEntity = idLearningCycleEntity;
            this.name = name;
        }

        public LearningCycleEntity build() {
            return new LearningCycleEntity(this);
        }
    }
}
