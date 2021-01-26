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

@Path("/learningEffects")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class LearningEffectController {
    @Inject
    LearningEffectService learningEffectService;

    @Inject
    LearningEffectDTOMapper learningEffectDTOMapper;

    @GET
    public List<LearningEffectDTO> getAllLearningEffects(){
        return learningEffectService.getAllLearningEffects().stream()
                .map(learningEffectDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
