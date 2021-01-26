package pwr.newEducation.domain.subjectCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LiteratureJPA {
    @Id
    @GeneratedValue
    private long id;
    private String type;
    private String content;

    public LiteratureJPA() {}

    private LiteratureJPA(Builder builder) {
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

    public static Builder builder(LiteratureJPA literatureJPA) {
        return new Builder(literatureJPA);
    }

    public static Builder builder(long id, String type, String content) {
        return new Builder(id, type, content);
    }

    public static class Builder {
        private long id;
        private String type;
        private String content;

        Builder () {}

        Builder(LiteratureJPA literatureJPA) {
            id = literatureJPA.id;
            type = literatureJPA.type;
            content = literatureJPA.content;
        }

        Builder(long id, String name, String content) {
            this.id = id;
            this.type = name;
            this.content = content;
        }

        public LiteratureJPA build() {
            return new LiteratureJPA(this);
        }
    }
}
