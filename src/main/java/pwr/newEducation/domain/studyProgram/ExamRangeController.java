package pwr.newEducation.domain.studyProgram;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Path("/examRanges")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class ExamRangeController {
    @Inject
    ExamRangeService examRangeService;

    @GET
    public List<String> getAllExamRanges(){
        return new ArrayList<>(examRangeService.getAllExamRanges());
    }
}
