package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class ModuleRepository implements PanacheRepository<ModuleJPA> {
    ModuleJPAMapper moduleJPAMapper;

    @Inject
    public ModuleRepository(ModuleJPAMapper moduleJPAMapper) {
        this.moduleJPAMapper = moduleJPAMapper;
    }

    public List<ModuleEntity> getAllModules() {
        return streamAll().map(moduleJPAMapper::toEntity)
                .collect(Collectors.toList());
    }

    ModuleJPA getById(long id) {
        return findById(id);
    }

}
