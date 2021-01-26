package pwr.newEducation.domain.tableRepresentation;

import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectCardTableJPAMapper {
    public SubjectCardTableEntity toEntity(SubjectCardJPA subjectCardJPA) {
        return SubjectCardTableEntity.builder(subjectCardJPA.getIdSubjectCards(),
                subjectCardJPA.getSubjectCode(),
                subjectCardJPA.getName(),
                subjectCardJPA.getIdSupervisor(),
                subjectCardJPA.isCurrent(),
                subjectCardJPA.getCreatedDate(),
                subjectCardJPA.getUpdatedDate())
                .build();
    }
}
