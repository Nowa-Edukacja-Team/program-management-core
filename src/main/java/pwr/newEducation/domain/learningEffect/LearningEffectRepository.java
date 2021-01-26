package pwr.newEducation.domain.learningEffect;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class LearningEffectRepository implements PanacheRepository<LearningEffectJPA> {
    private LearningEffectJPAMapper learningEffectJPAMapper;

    @Inject
    public LearningEffectRepository(LearningEffectJPAMapper learningEffectJPAMapper) {
        this.learningEffectJPAMapper = learningEffectJPAMapper;
    }

    public List<LearningEffectEntity> getAllLearningEffect(){
        return streamAll().map(learningEffectJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}
