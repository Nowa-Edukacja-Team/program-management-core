package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.learningEffect.SubjectLearningEffectDTOMapper;
import pwr.newEducation.domain.studyProgram.ModuleDTOMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class SubjectCardDTOMapper {
    @Inject
    SubjectKindDTOMapper subjectKindDTOMapper;

    @Inject
    ModuleDTOMapper moduleDTOMapper;

    @Inject
    CreditingFormDTOMapper creditingFormDTOMapper;


    @Inject
    SubjectObjectiveDTOMapper subjectObjectiveDTOMapper;

    @Inject
    SubjectPrerequisiteDTOMapper subjectPrerequisiteDTOMapper;

    @Inject
    LiteratureDTOMapper literatureDTOMapper;

    @Inject
    TeachingToolDTOMapper teachingToolDTOMapper;

    @Inject
    SubjectLearningEffectDTOMapper subjectLearningEffectDTOMapper;

    public SubjectCardEntity toEntity(SubjectCardDTO subjectCardDTO) {
        return SubjectCardEntity.builder(subjectCardDTO.getIdSubjectCards(),
                subjectCardDTO.getVersion(),
                subjectCardDTO.getCreatedDate(),
                subjectCardDTO.getUpdatedDate(),
                subjectCardDTO.getValid(),
                subjectCardDTO.isCurrent(),
                subjectCardDTO.getSubjectCode(),
                subjectCardDTO.getName(),
                subjectCardDTO.isGroup(),
                subjectCardDTO.getZzuHours(),
                subjectCardDTO.getCnpsHours(),
                subjectCardDTO.getSubjectECTS(),
                subjectCardDTO.getSemester(),
                subjectCardDTO.getLastSemester(),
                moduleDTOMapper.toEntity(subjectCardDTO.getModule()),
                subjectCardDTO.getIdSupervisor(),
                subjectKindDTOMapper.toEntity(subjectCardDTO.getSubjectKind()),
                creditingFormDTOMapper.toEntity(subjectCardDTO.getCreditingForm()),
                subjectCardDTO.getIdStudyProgram(),
                subjectCardDTO.getSubjectObjective().stream().map(subjectObjectiveDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectCardDTO.getSubjectPrerequisites().stream().map(subjectPrerequisiteDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectCardDTO.getLiterature().stream().map(literatureDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectCardDTO.getTeachingTools().stream().map(teachingToolDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectCardDTO.getSubjectLearningEffects().stream().map(subjectLearningEffectDTOMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public SubjectCardDTO toDTO(SubjectCardEntity subjectCardEntity) {
        return SubjectCardDTO.builder(subjectCardEntity.getIdSubjectCards(),
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
                moduleDTOMapper.toDTO(subjectCardEntity.getModule()),
                subjectCardEntity.getIdSupervisor(),
                subjectKindDTOMapper.toDTO(subjectCardEntity.getSubjectKind()),
                creditingFormDTOMapper.toDTO(subjectCardEntity.getCreditingForm()),
                subjectCardEntity.getIdStudyProgram(),
                subjectCardEntity.getSubjectObjective().stream().map(subjectObjectiveDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectCardEntity.getSubjectPrerequisites().stream().map(subjectPrerequisiteDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectCardEntity.getLiterature().stream().map(literatureDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectCardEntity.getTeachingTools().stream().map(teachingToolDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectCardEntity.getSubjectLearningEffects().stream().map(subjectLearningEffectDTOMapper::toDTO).collect(Collectors.toSet()))
                .build();
    }
}
