package pwr.newEducation.domain.fieldOfStudy;

public class SpecializationDTO {
    private long idSpecializationDTO;
    private String name;

    private SpecializationDTO() {

    }

    private SpecializationDTO(Builder builder) {
        this.idSpecializationDTO = builder.idSpecializationDTO;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdSpecializationDTO() {
        return idSpecializationDTO;
    }

    public static Builder builder(SpecializationDTO specializationDTO) {
        return new Builder(specializationDTO);
    }

    public static Builder builder(long idSpecializationDTO, String name) {
        return new Builder(idSpecializationDTO, name);
    }

    public static class Builder {
        private long idSpecializationDTO;
        private String name;

        Builder() {

        }

        Builder(SpecializationDTO specializationDTO) {
            idSpecializationDTO = specializationDTO.idSpecializationDTO;
            name = specializationDTO.name;
        }

        private Builder(long idSpecializationDTO, String name) {
            this.idSpecializationDTO = idSpecializationDTO;
            this.name = name;
        }

        public SpecializationDTO build() {
            return new SpecializationDTO(this);
        }
    }
}
