package pwr.newEducation.domain.subjectCard;

public class TeachingToolDTO {

    private String name;

    private TeachingToolDTO() {}

    private TeachingToolDTO(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Builder builder(TeachingToolDTO TeachingToolDTO) {
        return new Builder(TeachingToolDTO);
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private String name;

        Builder () {}

        Builder(TeachingToolDTO TeachingToolDTO) {
            name = TeachingToolDTO.name;
        }

        Builder(String name) {
            this.name = name;
        }

        public TeachingToolDTO build() {
            return new TeachingToolDTO(this);
        }
    }
}
