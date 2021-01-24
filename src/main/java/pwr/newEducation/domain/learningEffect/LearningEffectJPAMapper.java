package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class LearningEffectJPAMapper {
    @Inject
    LearningEffectRangeJPAMapper learningEffectRangeJPAMapper;

    public LearningEffectEntity toEntity(LearningEffectJPA learningEffectJPA) {
        return LearningEffectEntity.builder(learningEffectJPA.getContent(), learningEffectJPA.getUniversalCharacteristics(),
                learningEffectJPA.getQualificationCharacteristics(), learningEffectJPA.getEngCompQualificationCharacteristics())
                .withIdLearningEffect(learningEffectJPA.getIdLearningEffect())
                .withLearningEffectRanges(learningEffectJPA.getLearningEffectRanges().stream().map(learningEffectRangeJPAMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public LearningEffectJPA toJPA(LearningEffectEntity learningEffectEntity) {
        return LearningEffectJPA.builder(learningEffectEntity.getContent(), learningEffectEntity.getUniversalCharacteristics(),
                learningEffectEntity.getQualificationCharacteristics(), learningEffectEntity.getEngCompQualificationCharacteristics())
                .withIdLearningEffect(learningEffectEntity.getIdLearningEffect())
                .withLearningEffectRanges(learningEffectEntity.getLearningEffectRanges().stream().map(learningEffectRangeJPAMapper::toJPA).collect(Collectors.toSet()))
                .build();
    }
}
