package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LiteratureDTOMapper {
    public LiteratureEntity toEntity(LiteratureDTO literatureDTO) {
        return LiteratureEntity.builder(literatureDTO.getType(), literatureDTO.getContent()).build();
    }

    public LiteratureDTO toDTO(LiteratureEntity literatureEntity) {
        return LiteratureDTO.builder(literatureEntity.getType(), literatureEntity.getContent()).build();
    }
}
