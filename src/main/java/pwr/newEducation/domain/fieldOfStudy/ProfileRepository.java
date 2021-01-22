package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class ProfileRepository implements PanacheRepository<ProfileJPA> {
    ProfileJPAMapper profileJPAMapper;

    @Inject
    public ProfileRepository(ProfileJPAMapper profileJPAMapper) {
        this.profileJPAMapper = profileJPAMapper;
    }

    public List<ProfileEntity> getAllProfiles() {
        return streamAll().map(profileJPAMapper::toEntity).collect(Collectors.toList());
    }
}
