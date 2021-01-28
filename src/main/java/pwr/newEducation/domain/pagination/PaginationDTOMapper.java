package pwr.newEducation.domain.pagination;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaginationDTOMapper {
    public PaginationDTO toDTO(PaginationEntity paginationEntity){
        return new PaginationDTO().builder(paginationEntity.getPage(), paginationEntity.getPageCount(),
                paginationEntity.getCount(), paginationEntity.getData())
                .build();
    }
}
