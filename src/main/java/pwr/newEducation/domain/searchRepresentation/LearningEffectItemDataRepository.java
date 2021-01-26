package pwr.newEducation.domain.searchRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.learningEffect.LearningEffectJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class LearningEffectItemDataRepository implements PanacheRepository<LearningEffectJPA> {
    LearningEffectToItemDataMapper learningEffectToItemDataMapper;

    @Inject
    public LearningEffectItemDataRepository(LearningEffectToItemDataMapper learningEffectToItemDataMapper) {
        this.learningEffectToItemDataMapper = learningEffectToItemDataMapper;
    }

    public List<ItemDataEntity> getListOfIds() {
        return streamAll().map(learningEffectToItemDataMapper::toEntity).collect(Collectors.toList());
    }
}
