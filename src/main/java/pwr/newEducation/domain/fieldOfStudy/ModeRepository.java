package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class ModeRepository implements PanacheRepository<ModeJPA> {
    ModeJPAMapper modeJPAMapper;

    @Inject
    public ModeRepository(ModeJPAMapper modeJPAMapper) {
        this.modeJPAMapper = modeJPAMapper;
    }

    public List<ModeEntity> getAllModes() {
        return streamAll().map(modeJPAMapper::toEntity).collect(Collectors.toList());
    }
}
