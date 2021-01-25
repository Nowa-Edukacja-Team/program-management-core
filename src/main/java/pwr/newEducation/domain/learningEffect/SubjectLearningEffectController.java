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

@Path("/subjectLearningEffects")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class SubjectLearningEffectController {
    @Inject
    SubjectLearningEffectService subjectLearningEffectService;

    @Inject
    SubjectLearningEffectDTOMapper subjectLearningEffectDTOMapper;

    @GET
    public List<SubjectLearningEffectDTO> getAllSubjectLearningEffects() {
        return subjectLearningEffectService.getAllSubjectLearningEffects().stream()
                .map(subjectLearningEffectDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
