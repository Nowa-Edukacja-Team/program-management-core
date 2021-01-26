package pwr.newEducation.domain.tableRepresentation;

import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectCardVersionTableJPAMapper {
    public SubjectCardVersionTableEntity toEntity(SubjectCardJPA subjectCardJPA) {
        return SubjectCardVersionTableEntity.builder(subjectCardJPA.getIdSubjectCards(),
                subjectCardJPA.getVersion(),
                subjectCardJPA.getCreatedDate(),
                subjectCardJPA.getUpdatedDate(),
                subjectCardJPA.isCurrent())
                .build();
    }
}
