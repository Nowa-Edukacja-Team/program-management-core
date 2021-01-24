package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class LearningEffectDTOMapper {
    @Inject
    LearningEffectRangeDTOMapper learningEffectRangeDTOMapper;

    public LearningEffectEntity toEntity(LearningEffectDTO learningEffectDTO) {
        return LearningEffectEntity.builder(learningEffectDTO.getContent(), learningEffectDTO.getUniversalCharacteristics(),
                learningEffectDTO.getQualificationCharacteristics(), learningEffectDTO.getEngCompQualificationCharacteristics())
                .withLearningEffectRanges(learningEffectDTO.getLearningEffectRanges().stream().map(learningEffectRangeDTOMapper::toEntity).collect(Collectors.toSet()))
                .withIdLearningEffect(learningEffectDTO.getIdLearningEffect())
                .build();
    }

    public LearningEffectDTO toDTO(LearningEffectEntity learningEffectEntity) {
        return LearningEffectDTO.builder(learningEffectEntity.getContent(), learningEffectEntity.getUniversalCharacteristics(),
                learningEffectEntity.getQualificationCharacteristics(), learningEffectEntity.getEngCompQualificationCharacteristics())
                .withIdLearningEffect(learningEffectEntity.getIdLearningEffect())
                .withLearningEffectRanges(learningEffectEntity.getLearningEffectRanges().stream().map(learningEffectRangeDTOMapper::toDTO).collect(Collectors.toSet()))
                .build();
    }
}
