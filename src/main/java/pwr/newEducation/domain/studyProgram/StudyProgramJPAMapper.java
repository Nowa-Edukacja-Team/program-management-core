package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyEntity;
import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyJPAMapper;
import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyRepository;
import pwr.newEducation.domain.studyPlan.StudyPlanEntity;
import pwr.newEducation.domain.studyPlan.StudyPlanJPAMapper;
import pwr.newEducation.domain.studyPlan.StudyPlanRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Set;
import java.util.stream.Collectors;

@ApplicationScoped
public class StudyProgramJPAMapper {
    @Inject
    ExamRangeJPAMapper examRangeJPAMapper;

    @Inject
    FieldOfStudyJPAMapper fieldOfStudyJPAMapper;

    @Inject
    StudyPlanJPAMapper studyPlanJPAMapper;

    @Inject
    StudyPlanRepository studyPlanRepository;

    @Inject
    FieldOfStudyRepository fieldOfStudyRepository;

    public StudyProgramJPA toJPA(StudyProgramEntity studyProgramEntity) {
        return StudyProgramJPA.builder(studyProgramEntity.getCreatedDate(), studyProgramEntity.getValid(),
                studyProgramEntity.getIsCurrent())
                .withExamRange(studyProgramEntity.getExamRange().stream()
                        .map(examRangeJPAMapper::toJPA).collect(Collectors.toSet()))
                .withFieldOfStudy(studyProgramEntity.getFieldOfStudy()
                        .map(FieldOfStudyEntity::getIdFieldOFStudy)
                        .map(fieldOfStudyRepository::findById)
                        .orElseThrow(() -> new RuntimeException("Field of study is required!")))
                .withIdStudyProgram(studyProgramEntity.getIdStudyProgram())
                .withStudyPlan(studyProgramEntity.getStudyPlan()
                        .map(StudyPlanEntity::getIdStudyPlan)
                        .map(studyPlanRepository::getById)
                        .orElse(null))
                .withUpdatedDate(studyProgramEntity.getUpdatedDate())
                .withVersion(studyProgramEntity.getVersion())
                .build();
    }

    public StudyProgramEntity toEntity(StudyProgramJPA studyProgramJPA, Set<StudyProgramToModuleEntity> modules) {
        return StudyProgramEntity.builder(studyProgramJPA.getCreatedDate(), studyProgramJPA.getValid(),
                studyProgramJPA.getIsCurrent())
                .withExamRange(studyProgramJPA.getExamRange().stream().map(examRangeJPAMapper::toEntity).collect(Collectors.toSet()))
                .withFieldOfStudy(studyProgramJPA.getFieldOfStudy().map(fieldOfStudyJPAMapper::toEntity).orElse(null))
                .withIdStudyProgram(studyProgramJPA.getId())
                .withVersion(studyProgramJPA.getVersion())
                .withModules(modules)
                .withUpdatedDate(studyProgramJPA.getUpdatedDate())
                .withStudyPlan(studyProgramJPA.getStudyPlan().map(studyPlanJPAMapper::toEntity).orElse(null))
                .build();
    }
}
