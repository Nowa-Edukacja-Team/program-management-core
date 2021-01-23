package pwr.newEducation.domain.studyProgram;

import javax.persistence.*;

@Entity
@Table
public class ExamRangeJPA {
    @Id
    @GeneratedValue
    public long idExamRange;
    public int number;
    public String text;

    public int getNumber() {
        return number;
    }

    public long getIdExamRange() {
        return idExamRange;
    }

    public String getText() {
        return text;
    }

    public static class Builder {
        public long idExamRange;
        public int number;
        public String text;
        public StudyProgramJPA studyProgramJPA;

        Builder() {}

        Builder(long idExamRange, int number, String text) {

        }
    }
}
