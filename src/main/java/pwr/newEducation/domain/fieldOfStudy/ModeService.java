package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class ModeService {
    private ModeRepository modeRepository;

    @Inject
    ModeService(ModeRepository modeRepository) {
        this.modeRepository = modeRepository;
    }

    List<ModeEntity> getAllModes() {
        return modeRepository.getAllModes();
    }
}
