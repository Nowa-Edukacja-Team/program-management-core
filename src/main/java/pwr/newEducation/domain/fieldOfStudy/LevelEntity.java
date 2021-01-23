package pwr.newEducation.domain.fieldOfStudy;

public class LevelEntity {
    private long idLevelEntity;
    private String name;

    private LevelEntity() {

    }

    private LevelEntity(Builder builder) {
        this.idLevelEntity = builder.idLevelEntity;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLevelEntity() {
        return idLevelEntity;
    }

    public static Builder builder(LevelEntity levelEntity) {
        return new Builder(levelEntity);
    }

    public static Builder builder(long idLevelEntity, String name) {
        return new Builder(idLevelEntity, name);
    }

    public static class Builder {
        private long idLevelEntity;
        private String name;

        Builder() {

        }

        Builder(LevelEntity levelEntity) {
            idLevelEntity = levelEntity.idLevelEntity;
            name = levelEntity.name;
        }

        private Builder(long idLevelEntity, String name) {
            this.idLevelEntity = idLevelEntity;
            this.name = name;
        }

        public LevelEntity build() {
            return new LevelEntity(this);
        }
    }
}
