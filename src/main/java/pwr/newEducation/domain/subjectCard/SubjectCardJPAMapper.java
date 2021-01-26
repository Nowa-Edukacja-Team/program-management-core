package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.learningEffect.SubjectLearningEffectJPAMapper;
import pwr.newEducation.domain.studyProgram.ModuleJPAMapper;

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
    SubjectObjectiveJPAMapper subjectObjectiveJPAMapper;

    @Inject
    SubjectPrerequisiteJPAMapper subjectPrerequisiteJPAMapper;

    @Inject
    LiteratureJPAMapper literatureJPAMapper;

    @Inject
    TeachingToolJPAMapper teachingToolJPAMapper;

    @Inject
    SubjectLearningEffectJPAMapper subjectLearningEffectJPAMapper;

    public SubjectCardEntity toEntity(SubjectCardJPA subjectCardJPA) {
        return SubjectCardEntity.builder(subjectCardJPA.getIdSubjectCards(),
                subjectCardJPA.getVersion(),
                subjectCardJPA.getCreatedDate(),
                subjectCardJPA.getUpdatedDate(),
                subjectCardJPA.getValid(),
                subjectCardJPA.isCurrent(),
                subjectCardJPA.getSubjectCode(),
                subjectCardJPA.getName(),
                subjectCardJPA.isGroup(),
                subjectCardJPA.getZzuHours(),
                subjectCardJPA.getCnpsHours(),
                subjectCardJPA.getSubjectECTS(),
                subjectCardJPA.getSemester(),
                subjectCardJPA.getLastSemester(),
                moduleJPAMapper.toEntity(subjectCardJPA.getModule()),
                subjectCardJPA.getIdSupervisor(),
                subjectKindJPAMapper.toEntity(subjectCardJPA.getSubjectKind()),
                creditingFormJPAMapper.toEntity(subjectCardJPA.getCreditingForm()),
                subjectCardJPA.getIdStudyProgram(),
                subjectCardJPA.getSubjectObjective().stream().map(subjectObjectiveJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectCardJPA.getSubjectPrerequisites().stream().map(subjectPrerequisiteJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectCardJPA.getLiterature().stream().map(literatureJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectCardJPA.getTeachingTools().stream().map(teachingToolJPAMapper::toEntity).collect(Collectors.toSet()),
                subjectCardJPA.getSubjectLearningEffects().stream().map(subjectLearningEffectJPAMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public SubjectCardJPA toJPA(SubjectCardEntity subjectCardEntity) {
        return SubjectCardJPA.builder(subjectCardEntity.getIdSubjectCards(),
                subjectCardEntity.getVersion(),
                subjectCardEntity.getCreatedDate(),
                subjectCardEntity.getUpdatedDate(),
                subjectCardEntity.getValid(),
                subjectCardEntity.isCurrent(),
                subjectCardEntity.getSubjectCode(),
                subjectCardEntity.getName(),
                subjectCardEntity.isGroup(),
                subjectCardEntity.getZzuHours(),
                subjectCardEntity.getCnpsHours(),
                subjectCardEntity.getSubjectECTS(),
                subjectCardEntity.getSemester(),
                subjectCardEntity.getLastSemester(),
                moduleJPAMapper.toJPA(subjectCardEntity.getModule()),
                subjectCardEntity.getIdSupervisor(),
                subjectKindJPAMapper.toJPA(subjectCardEntity.getSubjectKind()),
                creditingFormJPAMapper.toJPA(subjectCardEntity.getCreditingForm()),
                subjectCardEntity.getIdStudyProgram(),
                subjectCardEntity.getSubjectObjective().stream().map(subjectObjectiveJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectCardEntity.getSubjectPrerequisites().stream().map(subjectPrerequisiteJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectCardEntity.getLiterature().stream().map(literatureJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectCardEntity.getTeachingTools().stream().map(teachingToolJPAMapper::toJPA).collect(Collectors.toSet()),
                subjectCardEntity.getSubjectLearningEffects().stream().map(subjectLearningEffectJPAMapper::toJPA).collect(Collectors.toSet()))
                .build();
    }
}
