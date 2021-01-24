package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.studyProgram.ModuleJPAMapper;
import pwr.newEducation.domain.studyProgram.StudyProgramJPAMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class SubjectCardJPAMapper {
    @Inject
    SubjectKindJPAMapper subjectKindJPAMapper;

    @Inject
    ModuleJPAMapper moduleJPAMapper;

    @Inject
    CreditingFormJPAMapper creditingFormJPAMapper;

    @Inject
    StudyProgramJPAMapper studyProgramJPAMapper;

    @Inject
    SubjectObjectiveJPAMapper subjectObjectiveJPAMapper;

    public SubjectCardEntity toEntity(SubjectCardJPA subjectCardJPA) {
        return SubjectCardEntity.builder(subjectCardJPA.getIdSubjectCards(),
                subjectCardJPA.getVersion(),
                subjectCardJPA.getCreatedDate(),
                subjectCardJPA.getUpdatedDate(),
                subjectCardJPA.getValidFromDate(),
                subjectCardJPA.isCurrent(),
                subjectCardJPA.getSubjectCode(),
                subjectCardJPA.getName(),
                subjectCardJPA.isGroup(),
                subjectCardJPA.getZzuHours(),
                subjectCardJPA.getCnpsHours(),
                subjectCardJPA.getSubjectECTS(),
                subjectCardJPA.getSemester(),
                subjectCardJPA.getLastSemester(),
                subjectCardJPA.getModule().stream().map(moduleJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectCardJPA.getIdSupervisor(),
                subjectCardJPA.getSubjectKind().stream().map(subjectKindJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectCardJPA.getCreditingForm().stream().map(creditingFormJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectCardJPA.getStudyProgram().stream().map(studyProgramJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectCardJPA.getSubjectObjectiveJPA().stream().map(subjectObjectiveJPAMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public SubjectCardJPA toJPA(SubjectCardEntity subjectCardEntity) {
        return SubjectCardJPA.builder(subjectCardEntity.getIdSubjectCards(),
                subjectCardEntity.getVersion(),
                subjectCardEntity.getCreatedDate(),
                subjectCardEntity.getUpdatedDate(),
                subjectCardEntity.getValidFromDate(),
                subjectCardEntity.isCurrent(),
                subjectCardEntity.getSubjectCode(),
                subjectCardEntity.getName(),
                subjectCardEntity.isGroup(),
                subjectCardEntity.getZzuHours(),
                subjectCardEntity.getCnpsHours(),
                subjectCardEntity.getSubjectECTS(),
                subjectCardEntity.getSemester(),
                subjectCardEntity.getLastSemester(),
                subjectCardEntity.getModule().stream().map(moduleJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectCardEntity.getIdSupervisor(),
                subjectCardEntity.getSubjectKind().stream().map(subjectKindJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectCardEntity.getCreditingForm().stream().map(creditingFormJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectCardEntity.getStudyProgram().stream().map(studyProgramJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectCardEntity.getSubjectObjective().stream().map(subjectObjectiveJPAMapper::toJPA).collect(Collectors.toSet()))
                .build();
    }
}
