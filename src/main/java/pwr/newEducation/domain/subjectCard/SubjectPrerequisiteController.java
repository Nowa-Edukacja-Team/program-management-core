package pwr.newEducation.domain.subjectCard;

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

@Path("/subjectPrerequisite")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class SubjectPrerequisiteController {
    @Inject
    SubjectPrerequisiteService subjectPrerequisiteService;

    @Inject
    SubjectPrerequisiteDTOMapper subjectPrerequisiteDTOMapper;

    @GET
    public List<SubjectPrerequisiteDTO> getAllSubjectPrerequisites() {
        return subjectPrerequisiteService.getAllSubjectPrerequisites().stream()
                .map(subjectPrerequisiteDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
