package pwr.newEducation.domain.subjectCard;

import pwr.newEducation.domain.studyProgram.ModuleDTOMapper;
import pwr.newEducation.domain.studyProgram.StudyProgramDTOMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class SubjectCardDTOMapper {

    @Inject
    ModuleDTOMapper moduleDTOMapper;

    @Inject
    CreditingFormDTOMapper creditingFormDTOMapper;

    @Inject
    SubjectKindDTOMapper subjectKindDTOMapper;

    @Inject
    StudyProgramDTOMapper studyProgramDTOMapper;

    @Inject
    SubjectObjectiveDTOMapper subjectObjectiveDTOMapper;

    public SubjectCardEntity toEntity(SubjectCardDTO subjectCardDTO) {
        return SubjectCardEntity.builder(subjectCardDTO.getIdSubjectCards(),
                subjectCardDTO.getVersion(),
                subjectCardDTO.getCreatedDate(),
                subjectCardDTO.getUpdatedDate(),
                subjectCardDTO.getValidFromDate(),
                subjectCardDTO.isCurrent(),
                subjectCardDTO.getSubjectCode(),
                subjectCardDTO.getName(),
                subjectCardDTO.isGroup(),
                subjectCardDTO.getZzuHours(),
                subjectCardDTO.getCnpsHours(),
                subjectCardDTO.getSubjectECTS(),
                subjectCardDTO.getSemester(),
                subjectCardDTO.getLastSemester(),
                subjectCardDTO.getModule().stream().map(moduleDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectCardDTO.getIdSupervisor(),
                subjectCardDTO.getSubjectKind().stream().map(subjectKindDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectCardDTO.getCreditingForm().stream().map(creditingFormDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectCardDTO.getStudyProgram().stream().map(studyProgramDTOMapper::toEntity).collect(Collectors.toSet()),
                subjectCardDTO.getSubjectObjective().stream().map(subjectObjectiveDTOMapper::toEntity).collect(Collectors.toSet()))
                .build();
    }

    public SubjectCardDTO toDTO(SubjectCardEntity subjectCardEntity) {
        return SubjectCardDTO.builder(subjectCardEntity.getIdSubjectCards(),
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
                subjectCardEntity.getModule().stream().map(moduleDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectCardEntity.getIdSupervisor(),
                subjectCardEntity.getSubjectKind().stream().map(subjectKindDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectCardEntity.getCreditingForm().stream().map(creditingFormDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectCardEntity.getStudyProgram().stream().map(studyProgramDTOMapper::toDTO).collect(Collectors.toSet()),
                subjectCardEntity.getSubjectObjective().stream().map(subjectObjectiveDTOMapper::toDTO).collect(Collectors.toSet()))
                .build();
    }
}
