package pwr.newEducation.domain.searchRepresentation;

import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectCardToItemDataMapper {
    public ItemDataEntity toEntity(SubjectCardJPA subjectCardJPA) {
        return ItemDataEntity.builder(subjectCardJPA.getIdSubjectCards(), subjectCardJPA.getName())
                .build();
    }
}
