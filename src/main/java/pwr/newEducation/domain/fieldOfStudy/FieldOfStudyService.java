package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class FieldOfStudyService {
    private FieldOfStudyRepository fieldOfStudyRepository;

    @Inject
    FieldOfStudyService(FieldOfStudyRepository fieldOfStudyRepository) {
        this.fieldOfStudyRepository = fieldOfStudyRepository;
    }

    List<FieldOfStudyEntity> getAllFieldsOfStudy() {
        return fieldOfStudyRepository.getAllFieldsOfStudy();
    }
}
