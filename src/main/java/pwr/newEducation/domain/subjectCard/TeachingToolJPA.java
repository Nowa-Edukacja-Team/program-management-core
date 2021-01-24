package pwr.newEducation.domain.subjectCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TeachingToolJPA {
    @Id
    @GeneratedValue
    private long idTeachingTool;
    private String name;

    public TeachingToolJPA() {}

    private TeachingToolJPA(Builder builder) {
        this.idTeachingTool = builder.idTeachingTool;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdTeachingTool() {
        return idTeachingTool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdTeachingTool(long idTeachingTool) {
        this.idTeachingTool = idTeachingTool;
    }

    public static Builder builder(TeachingToolJPA TeachingToolJPA) {
        return new Builder(TeachingToolJPA);
    }

    public static Builder builder(long idTeachingTool, String name) {
        return new Builder(idTeachingTool, name);
    }

    public static class Builder {
        private long idTeachingTool;
        private String name;

        Builder () {}

        Builder(TeachingToolJPA TeachingToolJPA) {
            idTeachingTool = TeachingToolJPA.idTeachingTool;
            name = TeachingToolJPA.name;
        }

        Builder(long idTeachingTool, String name) {
            this.idTeachingTool = idTeachingTool;
            this.name = name;
        }

        public TeachingToolJPA build() {
            return new TeachingToolJPA(this);
        }
    }
}
