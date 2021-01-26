package pwr.newEducation.domain.tableRepresentation;

import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudyPlanTableJPAMapper {
    public StudyPlanTableEntity toEntity(StudyPlanJPA studyPlanJPA){
        if (studyPlanJPA.getStudyProgram().getFieldOfStudy().isPresent()){
            return StudyPlanTableEntity.builder(studyPlanJPA.getIdStudyPlan(),
                    studyPlanJPA.getStudyProgram().getFieldOfStudy().get().getName(),
                    studyPlanJPA.getStudyProgram().getFieldOfStudy().get().getFacultyJPA().getName(),
                    studyPlanJPA.getStudyProgram().getFieldOfStudy().get().getLanguageJPA().getName(),
                    studyPlanJPA.getIsCurrent(),
                    studyPlanJPA.getStudyProgram().getFieldOfStudy().get().getModeJPA().getName(),
                    studyPlanJPA.getStudyProgram().getFieldOfStudy().get().getLevelJPA().getName(),
                    studyPlanJPA.getStudyProgram().getFieldOfStudy().get().getLearningCycleJPA().getName(),
                    studyPlanJPA.getCreatedDate(),
                    studyPlanJPA.getUpdatedDate())
                    .build();
        }
        return StudyPlanTableEntity.builder(studyPlanJPA.getIdStudyPlan(), "", "", "",
                studyPlanJPA.getIsCurrent(), "", "", "", studyPlanJPA.getCreatedDate(),
                studyPlanJPA.getUpdatedDate())
                .build();
    }
}
