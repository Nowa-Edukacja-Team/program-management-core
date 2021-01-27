package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExamRangeDTOMapper {
    public ExamRangeEntity toEntity(ExamRangeDTO examRangeDTO) {
        return ExamRangeEntity.builder(examRangeDTO.getText())
                .withIdExamRange(examRangeDTO.getIdExamRange())
                .build();
    }

    public ExamRangeDTO toDTO(ExamRangeEntity examRangeEntity) {
        return ExamRangeDTO.builder(examRangeEntity.getText())
                .withIdExamRange(examRangeEntity.getIdExamRange())
                .build();
    }
}
