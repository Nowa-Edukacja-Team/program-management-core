package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class LanguageService {
    private LanguageRepository languageRepository;

    @Inject
    LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    List<LanguageEntity> getAllLanguages() {
        return languageRepository.getAllLanguages();
    }
}
