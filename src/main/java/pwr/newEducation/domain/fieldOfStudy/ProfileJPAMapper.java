package pwr.newEducation.domain.fieldOfStudy;

public class ProfileJPAMapper {
    public ProfileEntity toEntity(ProfileJPA profileJPA) {
        return ProfileEntity.builder(profileJPA.getIdProfileJPA(), profileJPA.getName())
                .build();
    }

    public ProfileJPA toJPA(ProfileEntity profileEntity) {
        return ProfileJPA.builder(profileEntity.getIdProfileEntity(), profileEntity.getName())
                .build();
    }
}
