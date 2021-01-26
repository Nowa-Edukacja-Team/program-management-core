package pwr.newEducation.domain.fieldOfStudy;

public class ModeDTO {
    private long id;
    private String name;

    private ModeDTO() {

    }

    private ModeDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdModeDTO() {
        return id;
    }

    public static Builder builder(ModeDTO modeDTO) {
        return new Builder(modeDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(ModeDTO modeDTO) {
            id = modeDTO.id;
            name = modeDTO.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public ModeDTO build() {
            return new ModeDTO(this);
        }
    }
}
