package pwr.newEducation.domain.studyPlan;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/studyPlan")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class StudyPlanController {

    @Inject
    StudyPlanService studyPlanService;

    @GET
    public List<StudyPlanDTO> getAll() {
        return new ArrayList<>();
    }
}
