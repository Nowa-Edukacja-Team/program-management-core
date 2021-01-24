package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LearningEffectRangeJPAMapper {
    public LearningEffectRangeEntity toEntity(LearningEffectRangeJPA learningEffectRangeJPA) {
        return LearningEffectRangeEntity.builder(learningEffectRangeJPA.getName())
                .withIdLearningEffectRange(learningEffectRangeJPA.getIdLearningEffectRange())
                .build();
    }

    public LearningEffectRangeJPA toJPA(LearningEffectRangeEntity learningEffectRangeEntity) {
        return LearningEffectRangeJPA.builder(learningEffectRangeEntity.getName())
                .withIdLearningEffectRange(learningEffectRangeEntity.getIdLearningEffectRange())
                .build();
    }    
}
