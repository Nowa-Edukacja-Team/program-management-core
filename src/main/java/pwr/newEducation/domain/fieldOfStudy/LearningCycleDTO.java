package pwr.newEducation.domain.fieldOfStudy;

public class LearningCycleDTO {
    private long id;
    private String name;

    private LearningCycleDTO() {

    }

    private LearningCycleDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLearningCycleDTO() {
        return id;
    }

    public static Builder builder(LearningCycleDTO learningCycleDTO) {
        return new Builder(learningCycleDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(LearningCycleDTO learningCycleDTO) {
            id = learningCycleDTO.id;
            name = learningCycleDTO.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public LearningCycleDTO build() {
            return new LearningCycleDTO(this);
        }
    }
}
