package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class FacultyRepository implements PanacheRepository<FacultyJPA> {
    FacultyJPAMapper facultyJPAMapper;

    @Inject
    public FacultyRepository(FacultyJPAMapper facultyJPAMapper) {
        this.facultyJPAMapper = facultyJPAMapper;
    }

    public List<FacultyEntity> getAllFaculties() {
        return streamAll().map(facultyJPAMapper::toEntity).collect(Collectors.toList());
    }
}
