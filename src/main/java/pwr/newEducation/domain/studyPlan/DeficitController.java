package pwr.newEducation.domain.studyPlan;

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

@Path("/deficits")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class DeficitController {
    @Inject
    DeficitService deficitService;

    @Inject
    DeficitDTOMapper deficitDTOMapper;

    @GET
    public List<DeficitDTO> getAllDeficits(){
        return deficitService.getAllDeficits().stream()
                .map(deficitDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
