package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.persistence.*;

@Entity
@Table
public class ExamRangeJPA {
    @Id
    @GeneratedValue
    public long idExamRange;
    public int number;
    public String text;

    @OneToOne
    public StudyProgramJPA studyProgramJPA;

    public int getNumber() {
        return number;
    }

    public long getIdExamRange() {
        return idExamRange;
    }

    public String getText() {
        return text;
    }

    public StudyProgramJPA getStudyProgramJPA() {
        return studyProgramJPA;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStudyProgramJPA(StudyProgramJPA studyProgramJPA) {
        this.studyProgramJPA = studyProgramJPA;
    }

    public void setText(String text) {
        this.text = text;
    }
}
