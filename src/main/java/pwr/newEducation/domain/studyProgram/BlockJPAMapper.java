package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BlockJPAMapper {
    public BlockEntity toEntity(BlockJPA blockJPA) {
        return BlockEntity.builder(blockJPA.getName())
                .withIdBlock(blockJPA.getIdBlock())
                .build();
    }

    public BlockJPA toJPA(BlockEntity blockEntity) {
        return BlockJPA.builder(blockEntity.getName())
                .withIdBlock(blockEntity.getIdBlock())
                .build();
    }
}
