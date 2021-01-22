package pwr.newEducation.domain.fieldOfStudy;

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

@Path("/languages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class LanguageController {
    @Inject
    LanguageService languageService;

    @Inject
    LanguageDTOMapper languageDTOMapper;

    @GET
    public List<LanguageDTO> getAllFaculties() {
        return languageService.getAllLanguages().stream().map(languageDTOMapper::toDTO).collect(Collectors.toList());
    }
}
