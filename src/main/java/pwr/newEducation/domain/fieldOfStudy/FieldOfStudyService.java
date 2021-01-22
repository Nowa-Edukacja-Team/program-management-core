package pwr.newEducation.domain.fieldOfStudy;

import javax.inject.Inject;
import java.util.List;

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
