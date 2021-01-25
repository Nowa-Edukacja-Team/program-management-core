package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class SubjectLearningEffectDTOMapper {
    @Inject
    LearningEffectDTOMapper learningEffectDTOMapper;

    @Inject
    KnowledgeVerificationFormDTOMapper knowledgeVerificationFormDTOMapper;

    @Inject
    LearningEffectRangeDTOMapper learningEffectRangeDTOMapper;

    public SubjectLearningEffectEntity toEntity(SubjectLearningEffectDTO subjectLearningEffectDTO) {
        return SubjectLearningEffectEntity.builder(subjectLearningEffectDTO.getIdentifier(),
                subjectLearningEffectDTO.getContent(),
                subjectLearningEffectDTO.getLearningEffects().stream()
                        .map(learningEffectDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectLearningEffectDTO.getKnowledgeVerificationForms().stream()
                        .map(knowledgeVerificationFormDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectLearningEffectDTO.getLearningEffectRanges().stream()
                        .map(learningEffectRangeDTOMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public SubjectLearningEffectDTO toDTO(SubjectLearningEffectEntity subjectLearningEffectEntity) {
        return SubjectLearningEffectDTO.builder(subjectLearningEffectEntity.getIdentifier(),
                subjectLearningEffectEntity.getContent(),
                subjectLearningEffectEntity.getLearningEffects().stream()
                        .map(learningEffectDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectLearningEffectEntity.getKnowledgeVerificationForms().stream()
                        .map(knowledgeVerificationFormDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectLearningEffectEntity.getLearningEffectRanges().stream()
                        .map(learningEffectRangeDTOMapper::toDTO).collect(Collectors.toSet()))
                .build();
    }
}
