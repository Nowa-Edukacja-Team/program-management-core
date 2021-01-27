package pwr.newEducation.domain.studyProgram;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/studyProgram")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class StudyProgramController {

    @Inject
    StudyProgramService studyProgramService;

    @Inject
    StudyProgramDTOMapper studyProgramDTOMapper;


    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public List<StudyProgramDTO> getAllStudyProgram(@QueryParam("page") @DefaultValue("0") int pageIndex,
                                                    @QueryParam("size") @DefaultValue("20") int pageSize) {
        return studyProgramService.getAllStudyPrograms(pageIndex, pageSize).stream().map(studyProgramDTOMapper::toDTO).collect(Collectors.toList());
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertStudyProgram(StudyProgramDTO studyProgramDTO) {
        studyProgramService.insertStudyProgram(studyProgramDTO);
    }
}
