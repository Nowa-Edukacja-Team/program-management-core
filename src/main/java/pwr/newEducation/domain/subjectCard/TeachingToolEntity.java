package pwr.newEducation.domain.subjectCard;

public class TeachingToolEntity {
    private long id;
    private String name;

    private TeachingToolEntity() {}

    private TeachingToolEntity(Builder builder) {
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

    public static Builder builder(TeachingToolEntity TeachingToolEntity) {
        return new Builder(TeachingToolEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder () {}

        Builder(TeachingToolEntity TeachingToolEntity) {
            id = TeachingToolEntity.id;
            name = TeachingToolEntity.name;
        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public TeachingToolEntity build() {
            return new TeachingToolEntity(this);
        }
    }
}
