package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class LearningCycleService {
    private LearningCycleRepository learningCycleRepository;

    @Inject
    LearningCycleService(LearningCycleRepository learningCycleRepository) {
        this.learningCycleRepository = learningCycleRepository;
    }

    List<LearningCycleEntity> getAllLearningCycles() {
        return learningCycleRepository.getAllLearningCycles();
    }
}
