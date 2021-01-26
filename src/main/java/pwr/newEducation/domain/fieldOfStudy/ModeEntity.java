package pwr.newEducation.domain.fieldOfStudy;

public class ModeEntity {
    private long id;
    private String name;

    private ModeEntity() {

    }

    private ModeEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdModeEntity() {
        return id;
    }

    public static Builder builder(ModeEntity modeEntity) {
        return new Builder(modeEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(ModeEntity modeEntity) {
            id = modeEntity.id;
            name = modeEntity.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public ModeEntity build() {
            return new ModeEntity(this);
        }
    }
}
