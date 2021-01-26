package pwr.newEducation.domain.fieldOfStudy;

public class LanguageDTO {
    private long id;
    private String name;

    private LanguageDTO() {

    }

    private LanguageDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLanguageDTO() {
        return id;
    }

    public static Builder builder(LanguageDTO languageDTO) {
        return new Builder(languageDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(LanguageDTO languageDTO) {
            id = languageDTO.id;
            name = languageDTO.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public LanguageDTO build() {
            return new LanguageDTO(this);
        }
    }
}
