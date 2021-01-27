package pwr.newEducation.domain.subjectCard;

public class LiteratureDTO {
    private String type;
    private String content;

    private LiteratureDTO() {}

    private LiteratureDTO(Builder builder) {
        this.type = builder.type;
        this.content = builder.content;
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

    public void setType(String type) {
        this.type = type;
    }

    public static Builder builder(LiteratureDTO literatureDTO) {
        return new Builder(literatureDTO);
    }

    public static Builder builder(String type, String content) {
        return new Builder(type, content);
    }

    public static class Builder {
        private String type;
        private String content;

        Builder () {}

        Builder(LiteratureDTO literatureDTO) {
            type = literatureDTO.type;
            content = literatureDTO.content;
        }

        Builder(String name, String content) {
            this.type = name;
            this.content = content;
        }

        public LiteratureDTO build() {
            return new LiteratureDTO(this);
        }
    }
}
