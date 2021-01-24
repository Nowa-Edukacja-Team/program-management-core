package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LearningEffectRangeDTOMapper {
    public LearningEffectRangeEntity toEntity(LearningEffectRangeDTO learningEffectRangeDTO) {
        return LearningEffectRangeEntity.builder(learningEffectRangeDTO.getName())
                .withIdLearningEffectRange(learningEffectRangeDTO.getIdLearningEffectRange())
                .build();
    }

    public LearningEffectRangeDTO toDTO(LearningEffectRangeEntity learningEffectRangeEntity) {
        return LearningEffectRangeDTO.builder(learningEffectRangeEntity.getName())
                .withIdLearningEffectRange(learningEffectRangeEntity.getIdLearningEffectRange())
                .build();
    }
}
