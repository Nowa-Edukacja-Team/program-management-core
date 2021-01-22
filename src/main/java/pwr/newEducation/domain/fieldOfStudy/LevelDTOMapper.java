package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LevelDTOMapper {
    public LevelEntity toEntity(LevelDTO levelDTO) {
        return LevelEntity.builder(levelDTO.getIdLevelDTO(), levelDTO.getName())
                .build();
    }

    public LevelDTO toDTO(LevelEntity levelEntity) {
        return LevelDTO.builder(levelEntity.getIdLevelEntity(), levelEntity.getName())
                .build();
    }
}
