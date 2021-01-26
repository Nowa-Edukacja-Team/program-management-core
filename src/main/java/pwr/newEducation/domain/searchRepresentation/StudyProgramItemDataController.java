package pwr.newEducation.domain.searchRepresentation;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.stream.Collectors;

@Path("/studyPrograms/search")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class StudyProgramItemDataController {
    @Inject
    StudyProgramItemDataService studyProgramItemDataService;

    @Inject
    ItemDataDTOMapper itemDataDTOMapper;

    @GET
    public ListRepresentationDTO getListOfIds() {
        return new ListRepresentationDTO(
                studyProgramItemDataService.getListOfIds().stream()
                .map(itemDataDTOMapper::toDTO)
                .collect(Collectors.toList())
        );
    }
}