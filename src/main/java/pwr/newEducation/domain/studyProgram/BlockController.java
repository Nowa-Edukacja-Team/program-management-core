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

@Path("/blocks")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class BlockController {
    @Inject
    BlockService blockService;

    @Inject
    BlockDTOMapper blockDTOMapper;

    @GET
    public List<BlockDTO> getAllBlocks(){
        return blockService.getAllBlocks().stream()
                .map(blockDTOMapper::toDTO)
                .collect(Collectors.toList());
    }
}
