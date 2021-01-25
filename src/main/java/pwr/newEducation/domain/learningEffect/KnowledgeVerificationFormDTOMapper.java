package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KnowledgeVerificationFormDTOMapper {
    public KnowledgeVerificationFormEntity toEntity(KnowledgeVerificationFormDTO knowledgeVerificationFormDTO) {
        return KnowledgeVerificationFormEntity.builder(knowledgeVerificationFormDTO.getIdKnowledgeVerificationForm(),
                knowledgeVerificationFormDTO.getName(),
                knowledgeVerificationFormDTO.getWeight())
                .build();
    }

    public KnowledgeVerificationFormDTO toDTO(KnowledgeVerificationFormEntity knowledgeVerificationFormEntity) {
        return KnowledgeVerificationFormDTO.builder(knowledgeVerificationFormEntity.getIdKnowledgeVerificationForm(),
                knowledgeVerificationFormEntity.getName(),
                knowledgeVerificationFormEntity.getWeight())
                .build();
    }
}
