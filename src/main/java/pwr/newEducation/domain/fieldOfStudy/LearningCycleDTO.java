package pwr.newEducation.domain.fieldOfStudy;

public class LearningCycleDTO {
    private long idLearningCycleDTO;
    private String name;

    private LearningCycleDTO() {

    }

    private LearningCycleDTO(Builder builder) {
        this.idLearningCycleDTO = builder.idLearningCycleDTO;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLearningCycleDTO() {
        return idLearningCycleDTO;
    }

    public static Builder builder(LearningCycleDTO learningCycleDTO) {
        return new Builder(learningCycleDTO);
    }

    public static Builder builder(long idLearningCycleDTO, String name) {
        return new Builder(idLearningCycleDTO, name);
    }

    public static class Builder {
        private long idLearningCycleDTO;
        private String name;

        Builder() {

        }

        Builder(LearningCycleDTO learningCycleDTO) {
            idLearningCycleDTO = learningCycleDTO.idLearningCycleDTO;
            name = learningCycleDTO.name;
        }

        private Builder(long idLearningCycleDTO, String name) {
            this.idLearningCycleDTO = idLearningCycleDTO;
            this.name = name;
        }

        public LearningCycleDTO build() {
            return new LearningCycleDTO(this);
        }
    }
}
