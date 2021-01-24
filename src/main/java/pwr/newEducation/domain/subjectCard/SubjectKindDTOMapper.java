package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectKindDTOMapper {
    public SubjectKindEntity toEntity(SubjectKindDTO subjectKindDTO) {
        return SubjectKindEntity.builder(subjectKindDTO.getIdSubjectKind(), subjectKindDTO.getName())
                .build();
    }

    public SubjectKindDTO toDTO(SubjectKindEntity subjectKindEntity) {
        return SubjectKindDTO.builder(subjectKindEntity.getIdSubjectKind(), subjectKindEntity.getName())
                .build();
    }
}
