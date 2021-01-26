package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.Dependent;
import java.util.List;

@Dependent
public class ModuleService {
    ModuleRepository moduleRepository;

    public ModuleService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    List<ModuleEntity> getAllModules(){
        return moduleRepository.getAllModules();
    }
}
