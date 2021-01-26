package pwr.newEducation.domain.fieldOfStudy;

public class ProfileEntity {
    private long id;
    private String name;

    private ProfileEntity() {

    }

    private ProfileEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdProfileEntity() {
        return id;
    }

    public static Builder builder(ProfileEntity profileEntity) {
        return new Builder(profileEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(ProfileEntity profileEntity) {
            id = profileEntity.id;
            name = profileEntity.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public ProfileEntity build() {
            return new ProfileEntity(this);
        }
    }
}
