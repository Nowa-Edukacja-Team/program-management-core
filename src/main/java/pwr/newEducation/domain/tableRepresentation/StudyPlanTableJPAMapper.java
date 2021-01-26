package pwr.newEducation.domain.tableRepresentation;

import pwr.newEducation.domain.studyPlan.StudyPlanJPA;
import pwr.newEducation.domain.studyProgram.StudyProgramJPA;
import pwr.newEducation.domain.studyProgram.StudyProgramRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class StudyPlanTableJPAMapper {
    @Inject
    StudyProgramRepository studyProgramRepository;

    public StudyPlanTableEntity toEntity(StudyPlanJPA studyPlanJPA){
        StudyProgramJPA studyProgramJPA = studyProgramRepository.find("studyPlan", studyPlanJPA).firstResult();
        if (studyProgramJPA.getFieldOfStudy().isPresent()){
            return StudyPlanTableEntity.builder(studyPlanJPA.getIdStudyPlan(),
                    studyProgramJPA.getFieldOfStudy().get().getName(),
                    studyProgramJPA.getFieldOfStudy().get().getFacultyJPA().getName(),
                    studyProgramJPA.getFieldOfStudy().get().getLanguageJPA().getName(),
                    studyPlanJPA.getIsCurrent(),
                    studyProgramJPA.getFieldOfStudy().get().getModeJPA().getName(),
                    studyProgramJPA.getFieldOfStudy().get().getLevelJPA().getName(),
                    studyProgramJPA.getFieldOfStudy().get().getLearningCycleJPA().getName(),
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
