package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.StudyProgramJPAMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class StudyPlanJPAMapper {
    @Inject
    DeficitJPAMapper deficitJPAMapper;

    @Inject
    StudyProgramJPAMapper studyProgramJPAMapper;

    public StudyPlanJPA toJPA(StudyPlanEntity studyPlanEntity) {
        return StudyPlanJPA.builder(studyPlanEntity.getCreatedDate(), studyPlanEntity.getValid(),
                studyPlanEntity.getIsCurrent())
                .withDeficits(studyPlanEntity.getDeficits().stream().map(deficitJPAMapper::toJPA).collect(Collectors.toSet()))
                .withIdStudyPlan(studyPlanEntity.getIdStudyPlan())
                .withStudyProgram(studyProgramJPAMapper.toJPA(studyPlanEntity.getStudyProgram()))
                .withUpdatedDate(studyPlanEntity.getUpdatedDate())
                .withVersion(studyPlanEntity.getVersion())
                .build();
    }

    public StudyPlanEntity toEntity(StudyPlanJPA studyPlanJPA) {
        return StudyPlanEntity.builder(studyPlanJPA.getCreatedDate(), studyPlanJPA.getValid(),
                studyPlanJPA.getIsCurrent())
                .withDeficits(studyPlanJPA.getDeficits().stream().map(deficitJPAMapper::toEntity).collect(Collectors.toSet()))
                .withIdStudyPlan(studyPlanJPA.getIdStudyPlan())
                .withStudyProgram(studyProgramJPAMapper.toEntity(studyPlanJPA.getStudyProgram()))
                .withUpdatedDate(studyPlanJPA.getUpdatedDate())
                .withVersion(studyPlanJPA.getVersion())
                .build();
    }
}
