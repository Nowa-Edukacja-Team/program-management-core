package pwr.newEducation.domain.studyProgram;

public class ExamRangeEntity {
    private long id;
    private String text;

    public long getIdExamRange() {
        return id;
    }

    public String getText() {
        return text;
    }

    public ExamRangeEntity() {

    }

    ExamRangeEntity(Builder builder) {
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

        public ExamRangeEntity build() {
            return new ExamRangeEntity(this);
        }
    }
}
