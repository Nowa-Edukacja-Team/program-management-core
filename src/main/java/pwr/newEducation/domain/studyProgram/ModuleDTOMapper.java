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
                .withBlock(blockDTOMapper.toEntity(moduleDTO.getBlock()))
                .build();
    }

    public ModuleDTO toDTO(ModuleEntity moduleEntity) {
        return ModuleDTO.builder(moduleEntity.getName())
                .withIdModule(moduleEntity.getIdModule())
                .withBlock(blockDTOMapper.toDTO(moduleEntity.getBlock()))
                .build();
    }
}