package pwr.newEducation.domain.studyPlan;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/studyPlans")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class StudyPlanController {
    @Inject
    StudyPlanService studyPlanService;

    @Inject
    StudyPlanDTOMapper studyPlanDTOMapper;

    @GET
    public List<StudyPlanDTO> getAllStudyPlans(){
        return studyPlanService.getAllStudyPlans().stream()
                .map(studyPlanDTOMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public List<StudyPlanDTO> getAllStudyPlansForStudyProgramId(@PathParam("id") long id,
                                                                @QueryParam("page") @DefaultValue("0") int pageIndex,
                                                                @QueryParam("size") @DefaultValue("20") int pageSize){
        return studyPlanService.getAllStudyPlansForStudyProgramId(id, pageIndex, pageSize).stream()
                .map(studyPlanDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}