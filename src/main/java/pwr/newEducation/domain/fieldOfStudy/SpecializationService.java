package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SpecializationService {
    private SpecializationRepository specializationRepository;

    @Inject
    SpecializationService(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }

    List<SpecializationEntity> getAllSpecializations() {
        return specializationRepository.getAllSpecializations();
    }
}
