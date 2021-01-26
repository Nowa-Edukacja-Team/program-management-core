package pwr.newEducation.domain.subjectCard;

import javax.persistence.*;

@Entity
public class SubjectPrerequisiteJPA {
    @Id
    @GeneratedValue
    private long id;
    private String content;

    public SubjectPrerequisiteJPA() {}

    private SubjectPrerequisiteJPA(Builder builder) {
        this.id = builder.id;
        this.content = builder.content;
    }

    public String getContent() {
        return content;
    }

    public long getIdSubjectPrerequisite() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIdSubjectPrerequisite(long id) {
        this.id = id;
    }

    public static Builder builder(SubjectPrerequisiteJPA SubjectPrerequisiteJPA) {
        return new Builder(SubjectPrerequisiteJPA);
    }

    public static Builder builder(long id, String content) {
        return new Builder(id, content);
    }

    public static class Builder {
        private long id;
        private String content;

        Builder () {}

        Builder(SubjectPrerequisiteJPA SubjectPrerequisiteJPA) {
            id = SubjectPrerequisiteJPA.id;
            content = SubjectPrerequisiteJPA.content;
        }

        Builder(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public SubjectPrerequisiteJPA build() {
            return new SubjectPrerequisiteJPA(this);
        }
    }
}
