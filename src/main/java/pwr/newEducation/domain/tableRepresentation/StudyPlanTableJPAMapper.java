package pwr.newEducation.domain.tableRepresentation;

import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudyPlanTableJPAMapper {
    public StudyPlanTableEntity toEntity(StudyPlanJPA studyPlanJPA){
        return StudyPlanTableEntity.builder(studyPlanJPA.getIdStudyPlan(),
                studyPlanJPA.getStudyProgram().getFieldOfStudy().getName(),
                studyPlanJPA.getStudyProgram().getFieldOfStudy().getFacultyJPA().getName(),
                studyPlanJPA.getStudyProgram().getFieldOfStudy().getLanguageJPA().getName(),
                studyPlanJPA.getIsCurrent(),
                studyPlanJPA.getStudyProgram().getFieldOfStudy().getModeJPA().getName(),
                studyPlanJPA.getStudyProgram().getFieldOfStudy().getLevelJPA().getName(),
                studyPlanJPA.getStudyProgram().getFieldOfStudy().getLearningCycleJPA().getName(),
                studyPlanJPA.getCreatedDate(),
                studyPlanJPA.getUpdatedDate())
                .build();
    }
}
