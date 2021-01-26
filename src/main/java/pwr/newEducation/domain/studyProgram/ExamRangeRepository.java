package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class ExamRangeRepository implements PanacheRepository<ExamRangeJPA> {
    ExamRangeJPAMapper examRangeJPAMapper;

    @Inject
    public ExamRangeRepository(ExamRangeJPAMapper examRangeJPAMapper) {
        this.examRangeJPAMapper = examRangeJPAMapper;
    }

    public List<ExamRangeEntity> getAllExamRanges(){
        return streamAll().map(examRangeJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}
