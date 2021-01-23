package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class ProfileService {
    private ProfileRepository profileRepository;

    @Inject
    ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    List<ProfileEntity> getAllProfiles() {
        return profileRepository.getAllProfiles();
    }
}
