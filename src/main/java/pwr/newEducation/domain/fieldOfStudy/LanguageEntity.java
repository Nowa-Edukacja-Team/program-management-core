package pwr.newEducation.domain.fieldOfStudy;

public class LanguageEntity {
    private long idLanguageEntity;
    private String name;

    private LanguageEntity() {

    }

    private LanguageEntity(Builder builder) {
        this.idLanguageEntity = builder.idLanguageEntity;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdLanguageEntity() {
        return idLanguageEntity;
    }

    public static Builder builder(LanguageEntity languageEntity) {
        return new LanguageEntity.Builder(languageEntity);
    }

    public static Builder builder(long idLanguageEntity, String name) {
        return new Builder(idLanguageEntity, name);
    }

    public static class Builder {
        private long idLanguageEntity;
        private String name;

        Builder() {

        }

        Builder(LanguageEntity languageEntity) {
            idLanguageEntity = languageEntity.idLanguageEntity;
            name = languageEntity.name;
        }

        private Builder(long idLanguageEntity, String name) {
            this.idLanguageEntity = idLanguageEntity;
            this.name = name;
        }

        public LanguageEntity build() {
            return new LanguageEntity(this);
        }
    }
}
