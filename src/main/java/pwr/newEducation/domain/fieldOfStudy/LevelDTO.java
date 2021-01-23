package pwr.newEducation.domain.fieldOfStudy;

public class LevelDTO {
    private long idLevelDTO;
    private String name;

    private LevelDTO() {

    }

    private LevelDTO(Builder builder) {
        this.idLevelDTO = builder.idLevelDTO;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLevelDTO() {
        return idLevelDTO;
    }

    public static Builder builder(LevelDTO levelDTO) {
        return new Builder(levelDTO);
    }

    public static Builder builder(long idLevelDTO, String name) {
        return new Builder(idLevelDTO, name);
    }

    public static class Builder {
        private long idLevelDTO;
        private String name;

        Builder() {

        }

        Builder(LevelDTO levelDTO) {
            idLevelDTO = levelDTO.idLevelDTO;
            name = levelDTO.name;
        }

        private Builder(long idLevelDTO, String name) {
            this.idLevelDTO = idLevelDTO;
            this.name = name;
        }

        public LevelDTO build() {
            return new LevelDTO(this);
        }
    }
}
