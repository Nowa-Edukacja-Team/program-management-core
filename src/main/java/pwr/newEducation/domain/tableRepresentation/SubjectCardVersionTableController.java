package pwr.newEducation.domain.tableRepresentation;

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

@Path("/subjectCardVersions/table")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class SubjectCardVersionTableController {
    @Inject
    SubjectCardVersionTableService subjectCardVersionTableService;

    @Inject
    SubjectCardVersionTableDTOMapper subjectCardVersionTableDTOMapper;

    @GET
    public List<SubjectCardVersionTableDTO> getAllSubjectCardVersionTables(){
        return subjectCardVersionTableService.getAllSubjectCardVersionTables().stream()
                .map(subjectCardVersionTableDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
