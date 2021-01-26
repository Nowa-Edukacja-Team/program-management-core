package pwr.newEducation.domain.studyProgram;

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

@Path("/modules")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class ModuleController {
    @Inject
    ModuleService moduleService;

    @Inject
    ModuleDTOMapper moduleDTOMapper;

    @GET
    public List<ModuleDTO> getAllModules(){
        return moduleService.getAllModules().stream()
                .map(moduleDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
