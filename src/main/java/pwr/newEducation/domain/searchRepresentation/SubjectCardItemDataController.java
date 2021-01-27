package pwr.newEducation.domain.searchRepresentation;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.stream.Collectors;

@Path("/subjectCards/search")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@RequestScoped
public class SubjectCardItemDataController {
    @Inject
    SubjectCardItemDataService itemDataService;

    @Inject
    ItemDataDTOMapper itemDataDTOMapper;

    @GET
    public ListRepresentationDTO getListOfIds(@QueryParam("page") @DefaultValue("0") int pageIndex,
                                              @QueryParam("size") @DefaultValue("20") int pageSize) {
        return new ListRepresentationDTO(
                itemDataService.getListOfIds(pageIndex, pageSize).stream()
                .map(itemDataDTOMapper::toDTO)
                .collect(Collectors.toList())
        );
    }
}
