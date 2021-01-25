package pwr.newEducation.domain.learningEffect;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectLearningEffectRepository implements PanacheRepository<SubjectLearningEffectJPA> {
    SubjectLearningEffectJPAMapper subjectLearningEffectJPAMapper;

    @Inject
    public SubjectLearningEffectRepository(SubjectLearningEffectJPAMapper subjectLearningEffectJPAMapper) {
        this.subjectLearningEffectJPAMapper = subjectLearningEffectJPAMapper;
    }

    public List<SubjectLearningEffectEntity> getAllSubjectLearningEffects() {
        return streamAll().map(subjectLearningEffectJPAMapper::toEntity).collect(Collectors.toList());
    }
}
