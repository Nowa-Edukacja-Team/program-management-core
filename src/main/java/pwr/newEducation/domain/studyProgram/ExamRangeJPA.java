package pwr.newEducation.domain.studyProgram;

import javax.persistence.*;

@Entity
@Table
public class ExamRangeJPA {
    @Id
    @GeneratedValue
    private long id;
    private String text;

    public long getIdExamRange() {
        return id;
    }

    public String getText() {
        return text;
    }

    public ExamRangeJPA() {

    }

    ExamRangeJPA(Builder builder) {
        this.id = builder.id;
        this.text = builder.text;
    }

    public static Builder builder(String text) {
        return new Builder(text);
    }

    public static class Builder {
        private long id;
        private String text;

        Builder() {}

        Builder(String text) {
            this.text = text;
        }

        public Builder withIdExamRange(long id) {
            this.id = id;
            return this;
        }

        public ExamRangeJPA build() {
            return new ExamRangeJPA(this);
        }
    }
}
