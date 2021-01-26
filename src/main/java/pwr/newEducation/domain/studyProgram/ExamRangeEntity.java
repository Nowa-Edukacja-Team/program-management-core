package pwr.newEducation.domain.studyProgram;

public class ExamRangeEntity {
    private long id;
    private int number;
    private String text;

    public int getNumber() {
        return number;
    }

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
        this.number = builder.number;
        this.text = builder.text;
    }

    public static Builder builder(int number, String text) {
        return new Builder(number, text);
    }

    public static class Builder {
        private long id;
        private int number;
        private String text;

        Builder() {}

        Builder(int number, String text) {
            this.number = number;
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
