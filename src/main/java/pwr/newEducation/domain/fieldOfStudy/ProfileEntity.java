package pwr.newEducation.domain.fieldOfStudy;

public class ProfileEntity {
    private long idProfileEntity;
    private String name;

    private ProfileEntity() {

    }

    private ProfileEntity(Builder builder) {
        this.idProfileEntity = builder.idProfileEntity;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdProfileEntity() {
        return idProfileEntity;
    }

    public static Builder builder(ProfileEntity profileEntity) {
        return new Builder(profileEntity);
    }

    public static Builder builder(long idProfileEntity, String name) {
        return new Builder(idProfileEntity, name);
    }

    public static class Builder {
        private long idProfileEntity;
        private String name;

        Builder() {

        }

        Builder(ProfileEntity profileEntity) {
            idProfileEntity = profileEntity.idProfileEntity;
            name = profileEntity.name;
        }

        private Builder(long idProfileEntity, String name) {
            this.idProfileEntity = idProfileEntity;
            this.name = name;
        }

        public ProfileEntity build() {
            return new ProfileEntity(this);
        }
    }
}
