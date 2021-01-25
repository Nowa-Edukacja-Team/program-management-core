package pwr.newEducation.domain.subjectCard;

public class LiteratureEntity {
    private long idLiterature;
    private String type;
    private String content;

    private LiteratureEntity() {}

    private LiteratureEntity(Builder builder) {
        this.idLiterature = builder.idLiterature;
        this.type = builder.type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public long getIdLiterature() {
        return idLiterature;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIdLiterature(long idLiterature) {
        this.idLiterature = idLiterature;
    }

    public static Builder builder(LiteratureEntity literatureEntity) {
        return new Builder(literatureEntity);
    }

    public static Builder builder(long idLiterature, String type, String content) {
        return new Builder(idLiterature, type, content);
    }

    public static class Builder {
        private long idLiterature;
        private String type;
        private String content;

        Builder () {}

        Builder(LiteratureEntity literatureEntity) {
            idLiterature = literatureEntity.idLiterature;
            type = literatureEntity.type;
            content = literatureEntity.content;
        }

        Builder(long idLiterature, String name, String content) {
            this.idLiterature = idLiterature;
            this.type = name;
            this.content = content;
        }

        public LiteratureEntity build() {
            return new LiteratureEntity(this);
        }
    }
}
