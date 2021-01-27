package pwr.newEducation.domain.subjectCard;

public class TeachingToolEntity {
    private long id;
    private String name;

    private TeachingToolEntity() {}

    private TeachingToolEntity(Builder builder) {
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


    public static Builder builder(TeachingToolEntity TeachingToolEntity) {
        return new Builder(TeachingToolEntity);
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private String name;

        Builder () {}

        Builder(TeachingToolEntity TeachingToolEntity) {
            name = TeachingToolEntity.name;
        }

        Builder(String name) {
            this.name = name;
        }

        public TeachingToolEntity build() {
            return new TeachingToolEntity(this);
        }
    }
}
