package pwr.newEducation.domain.studyProgram;

public class ExamRangeEntity {
    private long idExamRange;
    private int number;
    private String text;

    public int getNumber() {
        return number;
    }

    public long getIdExamRange() {
        return idExamRange;
    }

    public String getText() {
        return text;
    }

    public ExamRangeEntity() {

    }

    ExamRangeEntity(Builder builder) {
        this.idExamRange = builder.idExamRange;
        this.number = builder.number;
        this.text = builder.text;
    }

    public static Builder builder(int number, String text) {
        return new Builder(number, text);
    }

    public static class Builder {
        private long idExamRange;
        private int number;
        private String text;

        Builder() {}

        Builder(int number, String text) {
            this.number = number;
            this.text = text;
        }

        public Builder withIdExamRange(long idExamRange) {
            this.idExamRange = idExamRange;
            return this;
        }

        public ExamRangeEntity build() {
            return new ExamRangeEntity(this);
        }
    }
}
