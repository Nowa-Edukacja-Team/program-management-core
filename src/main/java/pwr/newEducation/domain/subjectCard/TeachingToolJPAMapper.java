package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TeachingToolJPAMapper {
    public TeachingToolEntity toEntity(TeachingToolJPA teachingToolJPA) {
        return TeachingToolEntity.builder(teachingToolJPA.getName())
                .build();
    }

    public TeachingToolJPA toJPA(TeachingToolEntity teachingToolEntity) {
        return TeachingToolJPA.builder(teachingToolEntity.getIdTeachingTool(),
                teachingToolEntity.getName())
                .build();
    }
}
