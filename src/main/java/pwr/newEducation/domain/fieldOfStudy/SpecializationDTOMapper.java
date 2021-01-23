package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SpecializationDTOMapper {
    public SpecializationEntity toEntity(SpecializationDTO specializationDTO) {
        return SpecializationEntity.builder(specializationDTO.getIdSpecializationDTO(), specializationDTO.getName())
                .build();
    }

    public SpecializationDTO toDTO(SpecializationEntity specializationEntity) {
        return SpecializationDTO.builder(specializationEntity.getIdSpecializationEntity(), specializationEntity.getName())
                .build();
    }
}
