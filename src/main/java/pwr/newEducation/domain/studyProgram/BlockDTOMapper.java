package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BlockDTOMapper {
    public BlockEntity toEntity(BlockDTO blockDTO) {
        return BlockEntity.builder(blockDTO.getName())
                .withIdBlock(blockDTO.getIdBlock())
                .build();
    }

    public BlockDTO toDTO(BlockEntity blockEntity) {
        return BlockDTO.builder(blockEntity.getName())
                .withIdBlock(blockEntity.getIdBlock())
                .build();
    }
}