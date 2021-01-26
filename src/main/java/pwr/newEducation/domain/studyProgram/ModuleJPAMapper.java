package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class ModuleJPAMapper {
    @Inject
    BlockJPAMapper blockJPAMapper;

    public ModuleEntity toEntity(ModuleJPA moduleJPA) {
        return ModuleEntity.builder(moduleJPA.getName())
                .withIdModule(moduleJPA.getIdModule())
                .withBlock(blockJPAMapper.toEntity(moduleJPA.getBlock()))
                .build();
    }

    public ModuleJPA toJPA(ModuleEntity moduleEntity) {
        return ModuleJPA.builder(moduleEntity.getName())
                .withIdModule(moduleEntity.getIdModule())
                .withBlock(blockJPAMapper.toJPA(moduleEntity.getBlock()))
                .build();
    }
}

