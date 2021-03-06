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

@Path("/studyPlans/table")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class StudyPlanTableController {
    @Inject
    StudyPlanTableService studyPlanTableService;

    @Inject
    StudyPlanTableDTOMapper studyPlanTableDTOMapper;

    @GET
    public List<StudyPlanTableDTO> getAllStudyPlanTables(){
        return studyPlanTableService.getAllStudyPlanTables().stream()
                .map(studyPlanTableDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
