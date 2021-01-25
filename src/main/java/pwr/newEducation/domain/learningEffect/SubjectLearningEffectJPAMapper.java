package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class SubjectLearningEffectJPAMapper {
    @Inject
    LearningEffectJPAMapper learningEffectJPAMapper;

    @Inject
    KnowledgeVerificationFormJPAMapper knowledgeVerificationFormJPAMapper;

    @Inject
    LearningEffectRangeJPAMapper learningEffectRangeJPAMapper;

    public SubjectLearningEffectEntity toEntity(SubjectLearningEffectJPA subjectLearningEffectJPA) {
        return SubjectLearningEffectEntity.builder(subjectLearningEffectJPA.getIdentifier(),
                subjectLearningEffectJPA.getContent(),
                subjectLearningEffectJPA.getLearningEffects().stream()
                        .map(learningEffectJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectLearningEffectJPA.getKnowledgeVerificationForms().stream()
                        .map(knowledgeVerificationFormJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectLearningEffectJPA.getLearningEffectRanges().stream()
                        .map(learningEffectRangeJPAMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public SubjectLearningEffectJPA toJPA(SubjectLearningEffectEntity subjectLearningEffectEntity) {
        return SubjectLearningEffectJPA.builder(subjectLearningEffectEntity.getIdentifier(),
                subjectLearningEffectEntity.getContent(),
                subjectLearningEffectEntity.getLearningEffects().stream()
                        .map(learningEffectJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectLearningEffectEntity.getKnowledgeVerificationForms().stream()
                        .map(knowledgeVerificationFormJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectLearningEffectEntity.getLearningEffectRanges().stream()
                        .map(learningEffectRangeJPAMapper::toJPA).collect(Collectors.toSet()))
                .build();
    }
}
