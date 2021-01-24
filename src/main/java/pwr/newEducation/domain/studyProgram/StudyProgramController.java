package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/studyProgram")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class StudyProgramController {

    //@Inject
    StudyProgramService studyProgramService;

    //@Inject
    StudyProgramDTOMapper studyProgramDTOMapper;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public List<StudyProgramDTO> getAllStudyProgram() {
        return new ArrayList<StudyProgramDTO>();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertStudyProgram(StudyProgramDTO studyProgramDTO) {
        
    }
}
