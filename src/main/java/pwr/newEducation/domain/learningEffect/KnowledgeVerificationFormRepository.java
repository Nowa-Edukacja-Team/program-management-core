package pwr.newEducation.domain.learningEffect;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class KnowledgeVerificationFormRepository implements PanacheRepository<KnowledgeVerificationFormJPA> {
    KnowledgeVerificationFormJPAMapper knowledgeVerificationFormJPAMapper;

    @Inject
    public KnowledgeVerificationFormRepository(KnowledgeVerificationFormJPAMapper knowledgeVerificationFormJPAMapper) {
        this.knowledgeVerificationFormJPAMapper = knowledgeVerificationFormJPAMapper;
    }

    public List<KnowledgeVerificationFormEntity> getAllKnowledgeVerificationForms() {
        return streamAll().map(knowledgeVerificationFormJPAMapper::toEntity).collect(Collectors.toList());
    }
}
