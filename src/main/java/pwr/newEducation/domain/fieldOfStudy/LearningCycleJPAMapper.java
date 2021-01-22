package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LearningCycleJPAMapper {
    public LearningCycleEntity toEntity(LearningCycleJPA learningCycleJPA) {
        return LearningCycleEntity.builder(learningCycleJPA.getIdLearningCycleJPA(), learningCycleJPA.getName())
                .build();
    }

    public LearningCycleJPA toJPA(LearningCycleEntity learningCycleEntity) {
        return LearningCycleJPA.builder(learningCycleEntity.getIdLearningCycleEntity(), learningCycleEntity.getName())
                .build();
    }
}
