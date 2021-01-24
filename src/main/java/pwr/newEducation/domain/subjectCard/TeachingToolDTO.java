package pwr.newEducation.domain.subjectCard;

public class TeachingToolDTO {
    private long idTeachingTool;
    private String name;

    private TeachingToolDTO() {}

    private TeachingToolDTO(Builder builder) {
        this.idTeachingTool = builder.idTeachingTool;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdTeachingTool() {
        return idTeachingTool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdTeachingTool(long idTeachingTool) {
        this.idTeachingTool = idTeachingTool;
    }

    public static Builder builder(TeachingToolDTO TeachingToolDTO) {
        return new Builder(TeachingToolDTO);
    }

    public static Builder builder(long idTeachingTool, String name) {
        return new Builder(idTeachingTool, name);
    }

    public static class Builder {
        private long idTeachingTool;
        private String name;

        Builder () {}

        Builder(TeachingToolDTO TeachingToolDTO) {
            idTeachingTool = TeachingToolDTO.idTeachingTool;
            name = TeachingToolDTO.name;
        }

        Builder(long idTeachingTool, String name) {
            this.idTeachingTool = idTeachingTool;
            this.name = name;
        }

        public TeachingToolDTO build() {
            return new TeachingToolDTO(this);
        }
    }
}
