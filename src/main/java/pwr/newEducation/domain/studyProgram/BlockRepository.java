package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class BlockRepository implements PanacheRepository<BlockJPA> {
    private BlockJPAMapper blockJPAMapper;

    @Inject
    public BlockRepository(BlockJPAMapper blockJPAMapper) {
        this.blockJPAMapper = blockJPAMapper;
    }

    public List<BlockEntity> getAllBlocks(){
        return streamAll().map(blockJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}
