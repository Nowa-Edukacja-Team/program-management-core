package pwr.newEducation.domain.tableRepresentation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectCardVersionTableDTOMapper {
    public SubjectCardVersionTableDTO toDTO(SubjectCardVersionTableEntity subjectCardVersionTableEntity) {
        return SubjectCardVersionTableDTO.builder(subjectCardVersionTableEntity.getId(),
                subjectCardVersionTableEntity.getVersion(),
                subjectCardVersionTableEntity.getCreatedDate(),
                subjectCardVersionTableEntity.getUpdatedDate(),
                subjectCardVersionTableEntity.isActive())
                .build();
    }
}
