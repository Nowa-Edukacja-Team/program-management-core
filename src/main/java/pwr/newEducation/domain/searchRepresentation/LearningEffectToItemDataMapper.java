package pwr.newEducation.domain.searchRepresentation;

import pwr.newEducation.domain.learningEffect.LearningEffectJPA;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LearningEffectToItemDataMapper {
    public ItemDataEntity toEntity(LearningEffectJPA learningEffectJPA) {
        return ItemDataEntity.builder(learningEffectJPA.getIdLearningEffect(), learningEffectJPA.getContent())
                .build();
    }
}
