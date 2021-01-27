package pwr.newEducation.domain.subjectCard;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/subjectCards")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class SubjectCardController {
    @Inject
    SubjectCardService subjectCardService;

    @Inject
    SubjectCardDTOMapper subjectCardDTOMapper;

    @GET
    public List<SubjectCardDTO> getAllSubjectCards() {
        return subjectCardService.getAllSubjectCards().stream()
                .map(subjectCardDTOMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{studyProgramId}")
    public List<SubjectCardDTO> getSubjectCardsForStudyPrograms(@PathParam("studyProgramId") long studyProgramId,
                                                                @QueryParam("page") @DefaultValue("0") int pageIndex,
                                                                @QueryParam("size") @DefaultValue("20") int pageSize) {
        return subjectCardService.getSubjectCardsForStudyPrograms(pageIndex, pageSize, studyProgramId).stream()
                .map(subjectCardDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
