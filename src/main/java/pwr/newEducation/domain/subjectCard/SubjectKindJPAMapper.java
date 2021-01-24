package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectKindJPAMapper {
    public SubjectKindEntity toEntity(SubjectKindJPA subjectKindJPA){
        return SubjectKindEntity.builder(subjectKindJPA.getIdSubjectKind(), subjectKindJPA.getName())
                .build();
    }
    public SubjectKindJPA toJPA(SubjectKindEntity subjectKindEntity){
        return SubjectKindJPA.builder(subjectKindEntity.getIdSubjectKind(), subjectKindEntity.getName())
                .build();
    }
}
