package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class SubjectObjectiveJPAMapper {

    public SubjectObjectiveEntity toEntity(SubjectObjectiveJPA subjectObjectiveJPA) {
        return SubjectObjectiveEntity.builder(subjectObjectiveJPA.getIdSubjectObjective(),
                subjectObjectiveJPA.getContent())
                .build();
    }

    public SubjectObjectiveJPA toJPA(SubjectObjectiveEntity subjectObjectiveEntity) {
        return SubjectObjectiveJPA.builder(subjectObjectiveEntity.getIdSubjectObjective(),
                subjectObjectiveEntity.getContent())
                .build();
    }
}
