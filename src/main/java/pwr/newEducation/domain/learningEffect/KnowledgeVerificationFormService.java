package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class KnowledgeVerificationFormService {
    private KnowledgeVerificationFormRepository knowledgeVerificationFormRepository;

    @Inject
    KnowledgeVerificationFormService(KnowledgeVerificationFormRepository knowledgeVerificationFormRepository) {
        this.knowledgeVerificationFormRepository = knowledgeVerificationFormRepository;
    }

    List<KnowledgeVerificationFormEntity> getAllKnowledgeVerificationForms() {
        return knowledgeVerificationFormRepository.getAllKnowledgeVerificationForms();
    }
}
