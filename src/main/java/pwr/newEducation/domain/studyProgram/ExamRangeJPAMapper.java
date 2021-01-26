package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExamRangeJPAMapper {
    public ExamRangeEntity toEntity(ExamRangeJPA examRangeJPA) {
        return ExamRangeEntity.builder(examRangeJPA.getNumber(), examRangeJPA.getText())
                .build();
    }

    public ExamRangeJPA toJPA(ExamRangeEntity examRangeEntity) {
        return ExamRangeJPA.builder(examRangeEntity.getNumber(), examRangeEntity.getText())
                .build();
    }
}
