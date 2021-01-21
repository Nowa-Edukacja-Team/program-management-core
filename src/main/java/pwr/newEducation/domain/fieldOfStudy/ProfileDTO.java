package pwr.newEducation.domain.fieldOfStudy;

public class ProfileDTO {
    private long idProfileDTO;
    private String name;

    private ProfileDTO() {

    }

    private ProfileDTO(Builder builder) {
        this.idProfileDTO = builder.idProfileDTO;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdProfileDTO() {
        return idProfileDTO;
    }

    public static Builder builder(ProfileDTO profileDTO) {
        return new Builder(profileDTO);
    }

    public static Builder builder(long idProfileDTO, String name) {
        return new Builder(idProfileDTO, name);
    }

    public static class Builder {
        private long idProfileDTO;
        private String name;

        Builder() {

        }

        Builder(ProfileDTO profileDTO) {
            idProfileDTO = profileDTO.idProfileDTO;
            name = profileDTO.name;
        }

        private Builder(long idProfileDTO, String name) {
            this.idProfileDTO = idProfileDTO;
            this.name = name;
        }

        public ProfileDTO build() {
            return new ProfileDTO(this);
        }
    }
}
