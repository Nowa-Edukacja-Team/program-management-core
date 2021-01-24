package pwr.newEducation.domain.subjectCard;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectKindRepository implements PanacheRepository<SubjectKindJPA> {
    SubjectKindJPAMapper subjectKindJPAMapper;

    @Inject
    public SubjectKindRepository(SubjectKindJPAMapper subjectKindJPAMapper) {
        this.subjectKindJPAMapper = subjectKindJPAMapper;
    }

    public List<SubjectKindEntity> getAllSubjectKinds() {
        return streamAll().map(subjectKindJPAMapper::toEntity).collect(Collectors.toList());
    }
}
