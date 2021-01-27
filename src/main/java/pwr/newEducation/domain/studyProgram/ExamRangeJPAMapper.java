package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExamRangeJPAMapper {
    public String toEntity(ExamRangeJPA examRangeJPA) {
        return examRangeJPA.getText();
    }

    public ExamRangeJPA toJPA(String text) {
        return ExamRangeJPA.builder(text)
                .build();
    }
}

