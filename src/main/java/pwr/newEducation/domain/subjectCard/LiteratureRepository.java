package pwr.newEducation.domain.subjectCard;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class LiteratureRepository implements PanacheRepository<LiteratureJPA> {
    LiteratureJPAMapper literatureJPAMapper;

    @Inject
    public LiteratureRepository(LiteratureJPAMapper literatureJPAMapper) {
        this.literatureJPAMapper = literatureJPAMapper;
    }

    public List<LiteratureEntity> getAllLiteratures() {
        return streamAll().map(literatureJPAMapper::toEntity).collect(Collectors.toList());
    }
}
