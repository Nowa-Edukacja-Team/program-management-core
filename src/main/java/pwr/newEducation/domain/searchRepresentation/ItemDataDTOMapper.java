package pwr.newEducation.domain.searchRepresentation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ItemDataDTOMapper {
    public ItemDataEntity toEntity(ItemDataDTO itemDataDTO) {
        return ItemDataEntity.builder(itemDataDTO.getId(), itemDataDTO.getName())
                .build();
    }

    public ItemDataDTO toDTO(ItemDataEntity itemDataEntity) {
        return ItemDataDTO.builder(itemDataEntity.getId(), itemDataEntity.getName())
                .build();
    }
}
