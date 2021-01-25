package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LiteratureDTOMapper {
    public LiteratureEntity toEntity(LiteratureDTO literatureDTO) {
        return LiteratureEntity.builder(literatureDTO.getIdLiterature(), literatureDTO.getType(),
                literatureDTO.getContent()).build();
    }

    public LiteratureDTO toDTO(LiteratureEntity literatureEntity) {
        return LiteratureDTO.builder(literatureEntity.getIdLiterature(), literatureEntity.getType(),
                literatureEntity.getContent()).build();
    }
}
