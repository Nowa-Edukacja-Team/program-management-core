package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class FacultyService {
    private FacultyRepository facultyRepository;

    @Inject
    FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    List<FacultyEntity> getAllFaculties() {
        return facultyRepository.getAllFaculties();
    }
}
