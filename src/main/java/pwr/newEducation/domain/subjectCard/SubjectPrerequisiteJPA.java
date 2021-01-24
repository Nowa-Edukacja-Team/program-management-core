package pwr.newEducation.domain.subjectCard;

import javax.persistence.*;

@Entity
public class SubjectPrerequisiteJPA {
    @Id
    @GeneratedValue
    private long idSubjectPrerequisite;
    private String content;

    public SubjectPrerequisiteJPA() {}

    private SubjectPrerequisiteJPA(Builder builder) {
        this.idSubjectPrerequisite = builder.idSubjectPrerequisite;
        this.content = builder.content;
    }

    public String getContent() {
        return content;
    }

    public long getIdSubjectPrerequisite() {
        return idSubjectPrerequisite;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIdSubjectPrerequisite(long idSubjectPrerequisite) {
        this.idSubjectPrerequisite = idSubjectPrerequisite;
    }

    public static Builder builder(SubjectPrerequisiteJPA SubjectPrerequisiteJPA) {
        return new Builder(SubjectPrerequisiteJPA);
    }

    public static Builder builder(long idSubjectPrerequisite, String content) {
        return new Builder(idSubjectPrerequisite, content);
    }

    public static class Builder {
        private long idSubjectPrerequisite;
        private String content;

        Builder () {}

        Builder(SubjectPrerequisiteJPA SubjectPrerequisiteJPA) {
            idSubjectPrerequisite = SubjectPrerequisiteJPA.idSubjectPrerequisite;
            content = SubjectPrerequisiteJPA.content;
        }

        Builder(long idSubjectPrerequisite, String content) {
            this.idSubjectPrerequisite = idSubjectPrerequisite;
            this.content = content;
        }

        public SubjectPrerequisiteJPA build() {
            return new SubjectPrerequisiteJPA(this);
        }
    }
}
