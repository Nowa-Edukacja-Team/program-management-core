package pwr.newEducation.domain.subjectCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LiteratureJPA {
    @Id
    @GeneratedValue
    private long idLiterature;
    private String type;
    private String content;

    public LiteratureJPA() {}

    private LiteratureJPA(Builder builder) {
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

    public static Builder builder(LiteratureJPA literatureJPA) {
        return new Builder(literatureJPA);
    }

    public static Builder builder(long idLiterature, String type, String content) {
        return new Builder(idLiterature, type, content);
    }

    public static class Builder {
        private long idLiterature;
        private String type;
        private String content;

        Builder () {}

        Builder(LiteratureJPA literatureJPA) {
            idLiterature = literatureJPA.idLiterature;
            type = literatureJPA.type;
            content = literatureJPA.content;
        }

        Builder(long idLiterature, String name, String content) {
            this.idLiterature = idLiterature;
            this.type = name;
            this.content = content;
        }

        public LiteratureJPA build() {
            return new LiteratureJPA(this);
        }
    }
}
