package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class LevelRepository implements PanacheRepository<LevelJPA> {
    LevelJPAMapper levelJPAMapper;

    @Inject
    public LevelRepository(LevelJPAMapper levelJPAMapper) {
        this.levelJPAMapper = levelJPAMapper;
    }

    public List<LevelEntity> getAllLevels() {
        return streamAll().map(levelJPAMapper::toEntity).collect(Collectors.toList());
    }
}