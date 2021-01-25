package pwr.newEducation.domain.learningEffect;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/knowledgeVerificationForms")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class KnowledgeVerificationFormController {
    @Inject
    KnowledgeVerificationFormService knowledgeVerificationFormService;

    @Inject
    KnowledgeVerificationFormDTOMapper knowledgeVerificationFormDTOMapper;

    @GET
    public List<KnowledgeVerificationFormDTO> getAllKnowledgeVerificationForms() {
        return knowledgeVerificationFormService.getAllKnowledgeVerificationForms().stream()
                .map(knowledgeVerificationFormDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
