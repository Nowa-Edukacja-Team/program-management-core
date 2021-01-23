package pwr.newEducation.domain.fieldOfStudy;

public class LanguageDTO {
    private long idLanguageDTO;
    private String name;

    private LanguageDTO() {

    }

    private LanguageDTO(Builder builder) {
        this.idLanguageDTO = builder.idLanguageDTO;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLanguageDTO() {
        return idLanguageDTO;
    }

    public static Builder builder(LanguageDTO languageDTO) {
        return new Builder(languageDTO);
    }

    public static Builder builder(long idLanguageDTO, String name) {
        return new Builder(idLanguageDTO, name);
    }

    public static class Builder {
        private long idLanguageDTO;
        private String name;

        Builder() {

        }

        Builder(LanguageDTO languageDTO) {
            idLanguageDTO = languageDTO.idLanguageDTO;
            name = languageDTO.name;
        }

        private Builder(long idLanguageDTO, String name) {
            this.idLanguageDTO = idLanguageDTO;
            this.name = name;
        }

        public LanguageDTO build() {
            return new LanguageDTO(this);
        }
    }
}
