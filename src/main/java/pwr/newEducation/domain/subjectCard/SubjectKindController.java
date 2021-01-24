package pwr.newEducation.domain.subjectCard;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/subjectKinds")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class SubjectKindController {
    @Inject
    SubjectKindService subjectKindService;

    @Inject
    SubjectKindDTOMapper subjectKindDTOMapper;

    public List<SubjectKindDTO> getAllSubjectKinds() {
        return subjectKindService.getAllSubjectKinds().stream()
                .map(subjectKindDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
