package pwr.newEducation.domain.subjectCard;

public class LiteratureDTO {
    private long id;
    private String type;
    private String content;

    private LiteratureDTO() {}

    private LiteratureDTO(Builder builder) {
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

    public static Builder builder(LiteratureDTO literatureDTO) {
        return new Builder(literatureDTO);
    }

    public static Builder builder(long id, String type, String content) {
        return new Builder(id, type, content);
    }

    public static class Builder {
        private long id;
        private String type;
        private String content;

        Builder () {}

        Builder(LiteratureDTO literatureDTO) {
            id = literatureDTO.id;
            type = literatureDTO.type;
            content = literatureDTO.content;
        }

        Builder(long id, String name, String content) {
            this.id = id;
            this.type = name;
            this.content = content;
        }

        public LiteratureDTO build() {
            return new LiteratureDTO(this);
        }
    }
}
