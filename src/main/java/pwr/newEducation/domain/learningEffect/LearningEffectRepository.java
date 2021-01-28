package pwr.newEducation.domain.learningEffect;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.pagination.PaginationEntity;
import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class LearningEffectRepository implements PanacheRepository<LearningEffectJPA> {
    private LearningEffectJPAMapper learningEffectJPAMapper;

    @Inject
    public LearningEffectRepository(LearningEffectJPAMapper learningEffectJPAMapper) {
        this.learningEffectJPAMapper = learningEffectJPAMapper;
    }

    public PaginationEntity<LearningEffectEntity> getAllLearningEffect(int pageIndex, int pageSize){
        PanacheQuery<LearningEffectJPA> query = findAll().page(pageIndex, pageSize);
        int querySize = (int) streamAll().count();
        return new PaginationEntity<>(pageIndex,
                query.pageCount(),
                querySize,
                query.stream().map(learningEffectJPAMapper::toEntity).collect(Collectors.toList()));
    }
}
