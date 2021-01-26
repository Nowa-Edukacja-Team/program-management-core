package pwr.newEducation.domain.subjectCard;

public class LiteratureEntity {
    private long id;
    private String type;
    private String content;

    private LiteratureEntity() {}

    private LiteratureEntity(Builder builder) {
        this.id = builder.id;
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
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIdLiterature(long id) {
        this.id = id;
    }

    public static Builder builder(LiteratureEntity literatureEntity) {
        return new Builder(literatureEntity);
    }

    public static Builder builder(long id, String type, String content) {
        return new Builder(id, type, content);
    }

    public static class Builder {
        private long id;
        private String type;
        private String content;

        Builder () {}

        Builder(LiteratureEntity literatureEntity) {
            id = literatureEntity.id;
            type = literatureEntity.type;
            content = literatureEntity.content;
        }

        Builder(long id, String name, String content) {
            this.id = id;
            this.type = name;
            this.content = content;
        }

        public LiteratureEntity build() {
            return new LiteratureEntity(this);
        }
    }
}
