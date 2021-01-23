package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class ModuleDTOMapper {
    @Inject
    BlockDTOMapper blockDTOMapper;

    public ModuleEntity toEntity(ModuleDTO moduleDTO) {
        return ModuleEntity.builder(moduleDTO.getName())
                .withIdModule(moduleDTO.getIdModule())
                .withBlocks(moduleDTO.getBlocks().stream().map(blockDTOMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public ModuleDTO toDTO(ModuleEntity moduleEntity) {
        return ModuleDTO.builder(moduleEntity.getName())
                .withIdModule(moduleEntity.getIdModule())
                .withBlocks(moduleEntity.getBlocks().stream().map(blockDTOMapper::toDTO).collect(Collectors.toSet()))
                .build();
    }
}