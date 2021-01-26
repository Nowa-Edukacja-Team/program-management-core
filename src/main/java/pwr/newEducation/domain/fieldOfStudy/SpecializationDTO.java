package pwr.newEducation.domain.fieldOfStudy;

public class SpecializationDTO {
    private long id;
    private String name;

    private SpecializationDTO() {

    }

    private SpecializationDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdSpecializationDTO() {
        return id;
    }

    public static Builder builder(SpecializationDTO specializationDTO) {
        return new Builder(specializationDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(SpecializationDTO specializationDTO) {
            id = specializationDTO.id;
            name = specializationDTO.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public SpecializationDTO build() {
            return new SpecializationDTO(this);
        }
    }
}
