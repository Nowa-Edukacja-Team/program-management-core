package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class LiteratureService {
    private LiteratureRepository literatureRepository;

    @Inject
    LiteratureService(LiteratureRepository literatureRepository) {
        this.literatureRepository = literatureRepository;
    }

    List<LiteratureEntity> getAllLiteratures() {
        return literatureRepository.getAllLiteratures();
    }
}
