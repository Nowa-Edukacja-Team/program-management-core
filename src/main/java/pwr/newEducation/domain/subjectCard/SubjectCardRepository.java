package pwr.newEducation.domain.subjectCard;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectCardRepository implements PanacheRepository<SubjectCardJPA> {
    SubjectCardJPAMapper subjectCardJPAMapper;

    @Inject
    public SubjectCardRepository(SubjectCardJPAMapper subjectCardJPAMapper) {
        this.subjectCardJPAMapper = subjectCardJPAMapper;
    }

    public List<SubjectCardEntity> getAllSubjectCards() {
        return streamAll().map(subjectCardJPAMapper::toEntity).collect(Collectors.toList());
    }

    public List<SubjectCardEntity> getSubjectCardsForStudyPrograms(int pageIndex, int pageSize, long studyProgramId) {
        return find("idStudyProgram", studyProgramId).page(pageIndex, pageSize).stream()
                .map(subjectCardJPAMapper::toEntity)
                .collect(Collectors.toList());
        /*return find(
                "SELECT sc.* FROM SubjectCardJPA sc \n" +
                        "WHERE sc.idStudyProgram = " + studyProgramId
        ).page(pageIndex, pageSize).stream()
                .map(subjectCardJPAMapper::toEntity).collect(Collectors.toList());*/
    }
}
