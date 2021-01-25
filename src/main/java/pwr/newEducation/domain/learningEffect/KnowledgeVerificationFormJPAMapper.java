package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KnowledgeVerificationFormJPAMapper {
    public KnowledgeVerificationFormEntity toEntity(KnowledgeVerificationFormJPA knowledgeVerificationFormJPA) {
       return KnowledgeVerificationFormEntity.builder(knowledgeVerificationFormJPA.getIdKnowledgeVerificationForm(),
               knowledgeVerificationFormJPA.getName(),
               knowledgeVerificationFormJPA.getWeight())
               .build();
    }

    public KnowledgeVerificationFormJPA toJPA(KnowledgeVerificationFormEntity knowledgeVerificationFormEntity) {
        return KnowledgeVerificationFormJPA.builder(knowledgeVerificationFormEntity.getIdKnowledgeVerificationForm(),
                knowledgeVerificationFormEntity.getName(),
                knowledgeVerificationFormEntity.getWeight())
                .build();
    }
}
