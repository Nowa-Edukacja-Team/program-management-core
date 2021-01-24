package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class SubjectObjectiveDTOMapper {

    public SubjectObjectiveEntity toEntity(SubjectObjectiveDTO subjectObjectiveDTO) {
        return SubjectObjectiveEntity.builder(subjectObjectiveDTO.getIdSubjectObjective(),
                subjectObjectiveDTO.getContent())
                .build();
    }

    public SubjectObjectiveDTO toDTO(SubjectObjectiveEntity subjectObjectiveEntity) {
        return SubjectObjectiveDTO.builder(subjectObjectiveEntity.getIdSubjectObjective(),
                subjectObjectiveEntity.getContent())
                .build();
    }
}
