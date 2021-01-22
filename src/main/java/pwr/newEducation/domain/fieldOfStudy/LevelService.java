package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class LevelService {
    private LevelRepository levelRepository;

    @Inject
    LevelService(LevelRepository levelRepository) {
        this.levelRepository = levelRepository;
    }

    List<LevelEntity> getAllLevels() {
        return levelRepository.getAllLevels();
    }
}