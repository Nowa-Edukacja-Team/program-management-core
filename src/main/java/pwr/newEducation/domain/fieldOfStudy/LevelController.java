package pwr.newEducation.domain.fieldOfStudy;

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

@Path("/levels")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class LevelController {
    @Inject
    LevelService levelService;

    @Inject
    LevelDTOMapper levelDTOMapper;

    @GET
    public List<LevelDTO> getAllLevels() {
        return levelService.getAllLevels().stream().map(levelDTOMapper::toDTO).collect(Collectors.toList());
    }
}
