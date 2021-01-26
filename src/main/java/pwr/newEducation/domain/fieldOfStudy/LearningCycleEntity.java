package pwr.newEducation.domain.fieldOfStudy;

public class LearningCycleEntity {
    private long id;
    private String name;

    private LearningCycleEntity() {

    }

    private LearningCycleEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLearningCycleEntity() {
        return id;
    }

    public static Builder builder(LearningCycleEntity learningCycleEntity) {
        return new Builder(learningCycleEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(LearningCycleEntity learningCycleEntity) {
            id = learningCycleEntity.id;
            name = learningCycleEntity.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public LearningCycleEntity build() {
            return new LearningCycleEntity(this);
        }
    }
}
