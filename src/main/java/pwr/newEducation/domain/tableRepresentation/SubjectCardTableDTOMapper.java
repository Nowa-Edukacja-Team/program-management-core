package pwr.newEducation.domain.tableRepresentation;

import pwr.newEducation.domain.subjectCard.SubjectCardEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectCardTableDTOMapper {
    public SubjectCardTableDTO toDTO(SubjectCardTableEntity subjectCardTableEntity) {
        return SubjectCardTableDTO.builder(subjectCardTableEntity.getId(),
                subjectCardTableEntity.getSubjectCode(),
                subjectCardTableEntity.getName(),
                subjectCardTableEntity.getSupervisor(),
                subjectCardTableEntity.isActive(),
                subjectCardTableEntity.getCreateDate(),
                subjectCardTableEntity.getUpdatedDate()).build();
    }
}
