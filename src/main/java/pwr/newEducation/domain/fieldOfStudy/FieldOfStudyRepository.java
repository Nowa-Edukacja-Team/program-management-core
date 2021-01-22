package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class FieldOfStudyRepository implements PanacheRepository<FieldOfStudyJPA> {
    FieldOfStudyJPAMapper fieldOfStudyJPAMapper;

    @Inject
    public FieldOfStudyRepository(FieldOfStudyJPAMapper fieldOfStudyJPAMapper) {
        this.fieldOfStudyJPAMapper = fieldOfStudyJPAMapper;
    }

    public List<FieldOfStudyEntity> getAllFieldsOfStudy() {
        return streamAll().map(fieldOfStudyJPAMapper::toEntity).collect(Collectors.toList());
    }
}
