package pwr.newEducation.domain.fieldOfStudy;

public class ModeDTO {
    private long idModeDTO;
    private String name;

    private ModeDTO() {

    }

    private ModeDTO(Builder builder) {
        this.idModeDTO = builder.idModeDTO;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdModeDTO() {
        return idModeDTO;
    }

    public static Builder builder(ModeDTO modeDTO) {
        return new Builder(modeDTO);
    }

    public static Builder builder(long idModeDTO, String name) {
        return new Builder(idModeDTO, name);
    }

    public static class Builder {
        private long idModeDTO;
        private String name;

        Builder() {

        }

        Builder(ModeDTO modeDTO) {
            idModeDTO = modeDTO.idModeDTO;
            name = modeDTO.name;
        }

        private Builder(long idModeDTO, String name) {
            this.idModeDTO = idModeDTO;
            this.name = name;
        }

        public ModeDTO build() {
            return new ModeDTO(this);
        }
    }
}
