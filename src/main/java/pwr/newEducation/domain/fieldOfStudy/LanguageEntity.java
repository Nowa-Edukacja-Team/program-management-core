package pwr.newEducation.domain.fieldOfStudy;

public class LanguageEntity {
    private long id;
    private String name;

    private LanguageEntity() {

    }

    private LanguageEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLanguageEntity() {
        return id;
    }

    public static Builder builder(LanguageEntity languageEntity) {
        return new LanguageEntity.Builder(languageEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(LanguageEntity languageEntity) {
            id = languageEntity.id;
            name = languageEntity.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public LanguageEntity build() {
            return new LanguageEntity(this);
        }
    }
}
