package pwr.newEducation.domain.fieldOfStudy;

public class ModeEntity {
    private long idModeEntity;
    private String name;

    private ModeEntity() {

    }

    private ModeEntity(Builder builder) {
        this.idModeEntity = builder.idModeEntity;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdModeEntity() {
        return idModeEntity;
    }

    public static Builder builder(ModeEntity modeEntity) {
        return new Builder(modeEntity);
    }

    public static Builder builder(long idModeEntity, String name) {
        return new Builder(idModeEntity, name);
    }

    public static class Builder {
        private long idModeEntity;
        private String name;

        Builder() {

        }

        Builder(ModeEntity modeEntity) {
            idModeEntity = modeEntity.idModeEntity;
            name = modeEntity.name;
        }

        private Builder(long idModeEntity, String name) {
            this.idModeEntity = idModeEntity;
            this.name = name;
        }

        public ModeEntity build() {
            return new ModeEntity(this);
        }
    }
}
