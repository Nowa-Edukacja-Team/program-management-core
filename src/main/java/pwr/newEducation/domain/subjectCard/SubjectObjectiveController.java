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

@Path("/subjectObjectives")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class SubjectObjectiveController {
    @Inject
    SubjectObjectiveService subjectObjectiveService;

    @Inject
    SubjectObjectiveDTOMapper subjectObjectiveDTOMapper;

    @GET
    public List<SubjectObjectiveDTO> getAllSubjectObjectives() {
        return subjectObjectiveService.getAllSubjectObjectives().stream()
                .map(subjectObjectiveDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
