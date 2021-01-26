package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class BlockService {
    private BlockRepository blockRepository;

    @Inject
    public BlockService(BlockRepository blockRepository) {
        this.blockRepository = blockRepository;
    }

    List<BlockEntity> getAllBlocks(){
        return blockRepository.getAllBlocks();
    }
}
