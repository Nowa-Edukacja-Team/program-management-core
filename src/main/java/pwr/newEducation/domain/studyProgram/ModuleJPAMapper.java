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
                .withBlocks(moduleJPA.getBlocks().stream().map(blockJPAMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public ModuleJPA toJPA(ModuleEntity moduleEntity) {
        return ModuleJPA.builder(moduleEntity.getName())
                .withIdModule(moduleEntity.getIdModule())
                .withBlocks(moduleEntity.getBlocks().stream().map(blockJPAMapper::toJPA).collect(Collectors.toSet()))
                .build();
    }
}

