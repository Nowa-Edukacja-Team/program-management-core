package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class LearningEffectService {
    private LearningEffectRepository learningEffectRepository;

    @Inject
    public LearningEffectService(LearningEffectRepository learningEffectRepository) {
        this.learningEffectRepository = learningEffectRepository;
    }

    List<LearningEffectEntity> getAllLearningEffects(){
        return learningEffectRepository.getAllLearningEffect();
    }
}
