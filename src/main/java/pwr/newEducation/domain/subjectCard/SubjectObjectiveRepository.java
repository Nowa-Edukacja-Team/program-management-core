package pwr.newEducation.domain.subjectCard;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectObjectiveRepository implements PanacheRepository<SubjectObjectiveJPA> {
    SubjectObjectiveJPAMapper subjectObjectiveJPAMapper;

    @Inject
    public SubjectObjectiveRepository(SubjectObjectiveJPAMapper subjectObjectiveJPAMapper) {
        this.subjectObjectiveJPAMapper = subjectObjectiveJPAMapper;
    }

    public List<SubjectObjectiveEntity> getAllDisciplines() {
        return streamAll().map(subjectObjectiveJPAMapper::toEntity).collect(Collectors.toList());
    }
}
