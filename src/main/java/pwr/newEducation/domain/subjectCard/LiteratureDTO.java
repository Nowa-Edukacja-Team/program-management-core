package pwr.newEducation.domain.subjectCard;

public class LiteratureDTO {
    private long idLiterature;
    private String type;
    private String content;

    private LiteratureDTO() {}

    private LiteratureDTO(Builder builder) {
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

    public static Builder builder(LiteratureDTO literatureDTO) {
        return new Builder(literatureDTO);
    }

    public static Builder builder(long idLiterature, String type, String content) {
        return new Builder(idLiterature, type, content);
    }

    public static class Builder {
        private long idLiterature;
        private String type;
        private String content;

        Builder () {}

        Builder(LiteratureDTO literatureDTO) {
            idLiterature = literatureDTO.idLiterature;
            type = literatureDTO.type;
            content = literatureDTO.content;
        }

        Builder(long idLiterature, String name, String content) {
            this.idLiterature = idLiterature;
            this.type = name;
            this.content = content;
        }

        public LiteratureDTO build() {
            return new LiteratureDTO(this);
        }
    }
}
