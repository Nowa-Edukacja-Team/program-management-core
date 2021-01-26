package pwr.newEducation.domain.fieldOfStudy;

public class LevelEntity {
    private long id;
    private String name;

    private LevelEntity() {

    }

    private LevelEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLevelEntity() {
        return id;
    }

    public static Builder builder(LevelEntity levelEntity) {
        return new Builder(levelEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(LevelEntity levelEntity) {
            id = levelEntity.id;
            name = levelEntity.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public LevelEntity build() {
            return new LevelEntity(this);
        }
    }
}
