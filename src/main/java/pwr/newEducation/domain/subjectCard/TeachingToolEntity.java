package pwr.newEducation.domain.subjectCard;

public class TeachingToolEntity {
    private long idTeachingTool;
    private String name;

    private TeachingToolEntity() {}

    private TeachingToolEntity(Builder builder) {
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

    public static Builder builder(TeachingToolEntity TeachingToolEntity) {
        return new Builder(TeachingToolEntity);
    }

    public static Builder builder(long idTeachingTool, String name) {
        return new Builder(idTeachingTool, name);
    }

    public static class Builder {
        private long idTeachingTool;
        private String name;

        Builder () {}

        Builder(TeachingToolEntity TeachingToolEntity) {
            idTeachingTool = TeachingToolEntity.idTeachingTool;
            name = TeachingToolEntity.name;
        }

        Builder(long idTeachingTool, String name) {
            this.idTeachingTool = idTeachingTool;
            this.name = name;
        }

        public TeachingToolEntity build() {
            return new TeachingToolEntity(this);
        }
    }
}
