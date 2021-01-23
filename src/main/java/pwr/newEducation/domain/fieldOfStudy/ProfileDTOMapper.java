package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProfileDTOMapper {
    public ProfileEntity toEntity(ProfileDTO profileDTO) {
        return ProfileEntity.builder(profileDTO.getIdProfileDTO(), profileDTO.getName())
                .build();
    }

    public ProfileDTO toDTO(ProfileEntity profileEntity) {
        return ProfileDTO.builder(profileEntity.getIdProfileEntity(), profileEntity.getName())
                .build();
    }
}
