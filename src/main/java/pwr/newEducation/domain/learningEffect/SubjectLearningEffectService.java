package pwr.newEducation.domain.learningEffect;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SubjectLearningEffectService {
    private SubjectLearningEffectRepository subjectLearningEffectRepository;

    @Inject
    SubjectLearningEffectService(SubjectLearningEffectRepository subjectLearningEffectRepository) {
        this.subjectLearningEffectRepository = subjectLearningEffectRepository;
    }

    List<SubjectLearningEffectEntity> getAllSubjectLearningEffects() {
        return subjectLearningEffectRepository.getAllSubjectLearningEffects();
    }
}
