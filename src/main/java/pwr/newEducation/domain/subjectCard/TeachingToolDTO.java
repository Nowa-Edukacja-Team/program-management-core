package pwr.newEducation.domain.subjectCard;

public class TeachingToolDTO {
    private long id;
    private String name;

    private TeachingToolDTO() {}

    private TeachingToolDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdTeachingTool() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdTeachingTool(long id) {
        this.id = id;
    }

    public static Builder builder(TeachingToolDTO TeachingToolDTO) {
        return new Builder(TeachingToolDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder () {}

        Builder(TeachingToolDTO TeachingToolDTO) {
            id = TeachingToolDTO.id;
            name = TeachingToolDTO.name;
        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public TeachingToolDTO build() {
            return new TeachingToolDTO(this);
        }
    }
}
