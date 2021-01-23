package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class LearningCycleRepository implements PanacheRepository<LearningCycleJPA> {
    LearningCycleJPAMapper learningCycleJPAMapper;

    @Inject
    public LearningCycleRepository(LearningCycleJPAMapper learningCycleJPAMapper) {
        this.learningCycleJPAMapper = learningCycleJPAMapper;
    }

    public List<LearningCycleEntity> getAllLearningCycles() {
        return streamAll().map(learningCycleJPAMapper::toEntity).collect(Collectors.toList());
    }
}
