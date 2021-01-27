package pwr.newEducation.domain.searchRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Page;
import pwr.newEducation.domain.learningEffect.LearningEffectJPA;
import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

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

    public List<ItemDataEntity> getListOfIds(int pageIndex, int pageSize) {
        PanacheQuery<LearningEffectJPA> query = findAll();
        query.page(Page.ofSize(pageSize));
        return query.page(pageIndex, pageSize).stream()
                .map(learningEffectToItemDataMapper::toEntity).collect(Collectors.toList());
    }
}
