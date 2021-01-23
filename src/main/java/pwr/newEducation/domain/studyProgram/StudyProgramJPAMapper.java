package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyJPAMapper;
import pwr.newEducation.domain.studyPlan.StudyPlanJPAMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class StudyProgramJPAMapper {
    @Inject
    ExamRangeJPAMapper examRangeJPAMapper;

    @Inject
    ModuleJPAMapper moduleJPAMapper;

    @Inject
    FieldOfStudyJPAMapper fieldOfStudyJPAMapper;

    @Inject
    StudyPlanJPAMapper studyPlanJPAMapper;

    public StudyProgramJPA toJPA(StudyProgramEntity studyProgramEntity) {
        return StudyProgramJPA.builder(studyProgramEntity.getCreatedDate(), studyProgramEntity.getValidFromDate(),
                studyProgramEntity.getIsCurrent())
                .withExamRange(studyProgramEntity.getExamRange().stream().map(examRangeJPAMapper::toJPA).collect(Collectors.toSet()))
                .withFieldOfStudy(fieldOfStudyJPAMapper.toJPA(studyProgramEntity.getFieldOfStudy()))
                .withIdStudyProgram(studyProgramEntity.getIdStudyProgram())
                .withModules(studyProgramEntity.getModules().stream().map(moduleJPAMapper::toJPA).collect(Collectors.toSet()))
                .withStudyPlan(studyPlanJPAMapper.toJPA(studyProgramEntity.getStudyPlan()))
                .withUpdatedDate(studyProgramEntity.getUpdatedDate())
                .withVersion(studyProgramEntity.getVersion())
                .build();
    }

    public StudyProgramEntity toEntity(StudyProgramJPA studyProgramJPA) {
        return StudyProgramEntity.builder(studyProgramJPA.getCreatedDate(), studyProgramJPA.getValidFromDate(),
                studyProgramJPA.getIsCurrent())
                .withExamRange(studyProgramJPA.getExamRange().stream().map(examRangeJPAMapper::toEntity).collect(Collectors.toSet()))
                .withFieldOfStudy(fieldOfStudyJPAMapper.toEntity(studyProgramJPA.getFieldOfStudy()))
                .withIdStudyProgram(studyProgramJPA.getIdStudyProgram())
                .withVersion(studyProgramJPA.getVersion())
                .withModules(studyProgramJPA.getModules().stream().map(moduleJPAMapper::toEntity).collect(Collectors.toSet()))
                .withUpdatedDate(studyProgramJPA.getUpdatedDate())
                .withStudyPlan(studyPlanJPAMapper.toEntity(studyProgramJPA.getStudyPlan()))
                .build();
    }
}
