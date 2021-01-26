package pwr.newEducation.domain.fieldOfStudy;

public class ProfileDTO {
    private long id;
    private String name;

    private ProfileDTO() {

    }

    private ProfileDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdProfileDTO() {
        return id;
    }

    public static Builder builder(ProfileDTO profileDTO) {
        return new Builder(profileDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(ProfileDTO profileDTO) {
            id = profileDTO.id;
            name = profileDTO.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public ProfileDTO build() {
            return new ProfileDTO(this);
        }
    }
}
