package pwr.newEducation.domain.fieldOfStudy;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/studies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class FieldOfStudyController {
    @Inject
    FieldOfStudyService fieldOfStudyService;

    @Inject
    FieldOfStudyDTOMapper fieldOfStudyDTOMapper;

    @GET
    public List<FieldOfStudyDTO> getAllFieldsOfStudies() {
        return fieldOfStudyService.getAllFieldsOfStudy().stream().map(fieldOfStudyDTOMapper::toDTO).collect(Collectors.toList());
    }
}
