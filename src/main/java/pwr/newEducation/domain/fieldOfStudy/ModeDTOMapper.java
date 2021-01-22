package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ModeDTOMapper {
    public ModeEntity toEntity(ModeDTO modeDTO) {
        return ModeEntity.builder(modeDTO.getIdModeDTO(), modeDTO.getName())
                .build();
    }

    public ModeDTO toDTO(ModeEntity modeEntity) {
        return ModeDTO.builder(modeEntity.getIdModeEntity(), modeEntity.getName())
                .build();
    }
}
