package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectObjectiveDTOMapper {

    public SubjectObjectiveEntity toEntity(String content) {
        return SubjectObjectiveEntity.builder(content)
                .build();
    }

    public String toDTO(SubjectObjectiveEntity subjectObjectiveEntity) {
        return subjectObjectiveEntity.getContent();
    }
}
