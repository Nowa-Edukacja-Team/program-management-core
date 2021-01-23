package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LearningCycleDTOMapper {
    public LearningCycleEntity toEntity(LearningCycleDTO learningCycleDTO) {
        return LearningCycleEntity.builder(learningCycleDTO.getIdLearningCycleDTO(), learningCycleDTO.getName())
                .build();
    }

    public LearningCycleDTO toDTO(LearningCycleEntity learningCycleEntity) {
        return LearningCycleDTO.builder(learningCycleEntity.getIdLearningCycleEntity(), learningCycleEntity.getName())
                .build();
    }
}
