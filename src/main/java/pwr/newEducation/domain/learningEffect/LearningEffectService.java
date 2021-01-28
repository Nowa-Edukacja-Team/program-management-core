package pwr.newEducation.domain.learningEffect;

import pwr.newEducation.domain.pagination.PaginationEntity;

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

    PaginationEntity<LearningEffectEntity> getAllLearningEffects(int pageIndex, int pageSize){
        return learningEffectRepository.getAllLearningEffect(pageIndex, pageSize);
    }
}
