package pwr.newEducation.domain.searchRepresentation;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class LearningEffectItemDataService {
    private LearningEffectItemDataRepository learningEffectItemDataRepository;

    @Inject
    public LearningEffectItemDataService(LearningEffectItemDataRepository learningEffectItemDataRepository) {
        this.learningEffectItemDataRepository = learningEffectItemDataRepository;
    }

    List<ItemDataEntity> getListOfIds(int pageIndex, int pageSize) {
        return learningEffectItemDataRepository.getListOfIds(pageIndex, pageSize);
    }
}
