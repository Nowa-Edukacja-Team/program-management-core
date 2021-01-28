package pwr.newEducation.domain.learningEffect;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import pwr.newEducation.domain.pagination.PaginationDTO;
import pwr.newEducation.domain.pagination.PaginationDTOMapper;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
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

    @Inject
    PaginationDTOMapper paginationDTOMapper;

    @GET
    public PaginationDTO<LearningEffectDTO> getAllLearningEffects(@QueryParam("page") @DefaultValue("0") int pageIndex,
                                                                  @QueryParam("size") @DefaultValue("20") int pageSize){
        return paginationDTOMapper.toDTO(learningEffectService.getAllLearningEffects(pageIndex, pageSize));
    }
}
