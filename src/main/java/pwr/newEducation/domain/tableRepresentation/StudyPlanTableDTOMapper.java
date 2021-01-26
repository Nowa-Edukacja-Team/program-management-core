package pwr.newEducation.domain.tableRepresentation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudyPlanTableDTOMapper {
    public StudyPlanTableDTO toDTO(StudyPlanTableEntity studyPlanTableEntity) {
        return StudyPlanTableDTO.builder(studyPlanTableEntity.getId(),
                studyPlanTableEntity.getFieldOfStudy(),
                studyPlanTableEntity.getFaculty(),
                studyPlanTableEntity.getLanguage(),
                studyPlanTableEntity.isActive(),
                studyPlanTableEntity.getMode(),
                studyPlanTableEntity.getLevel(),
                studyPlanTableEntity.getLearningCycle(),
                studyPlanTableEntity.getCreateDate(),
                studyPlanTableEntity.getUpdatedDate())
                .build();
    }
}
