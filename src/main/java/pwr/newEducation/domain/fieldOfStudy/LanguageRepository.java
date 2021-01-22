package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class LanguageRepository implements PanacheRepository<LanguageJPA> {
    LanguageJPAMapper languageJPAMapper;

    @Inject
    public LanguageRepository(LanguageJPAMapper languageJPAMapper) {
        this.languageJPAMapper = languageJPAMapper;
    }

    public List<LanguageEntity> getAllLanguages() {
        return streamAll().map(languageJPAMapper::toEntity).collect(Collectors.toList());
    }
}

