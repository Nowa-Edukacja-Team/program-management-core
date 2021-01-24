package pwr.newEducation.domain.subjectCard;

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

@Path("/teachingTools")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class TeachingToolController {
    @Inject
    TeachingToolService teachingToolService;

    @Inject
    TeachingToolDTOMapper teachingToolDTOMapper;

    @GET
    public List<TeachingToolDTO> getAllTeachingTools() {
        return teachingToolService.getAllTeachingTools().stream()
                .map(teachingToolDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
