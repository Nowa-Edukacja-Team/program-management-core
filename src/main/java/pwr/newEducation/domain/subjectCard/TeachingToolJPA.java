package pwr.newEducation.domain.subjectCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TeachingToolJPA {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    public TeachingToolJPA() {}

    private TeachingToolJPA(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdTeachingTool() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdTeachingTool(long id) {
        this.id = id;
    }

    public static Builder builder(TeachingToolJPA TeachingToolJPA) {
        return new Builder(TeachingToolJPA);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder () {}

        Builder(TeachingToolJPA TeachingToolJPA) {
            id = TeachingToolJPA.id;
            name = TeachingToolJPA.name;
        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public TeachingToolJPA build() {
            return new TeachingToolJPA(this);
        }
    }
}
