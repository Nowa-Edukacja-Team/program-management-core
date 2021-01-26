package pwr.newEducation.domain.searchRepresentation;

import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudyPlanToItemDataMapper {
    public ItemDataEntity toEntity(StudyPlanJPA studyPlanJPA) {
        return ItemDataEntity.builder(studyPlanJPA.getIdStudyPlan(), studyPlanJPA.getCreatedDate().toString())
                .build();
    }
}
