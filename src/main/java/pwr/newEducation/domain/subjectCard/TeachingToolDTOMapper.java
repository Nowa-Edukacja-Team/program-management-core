package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TeachingToolDTOMapper {

    public TeachingToolEntity toEntity(String content) {
        return TeachingToolEntity.builder(content)
                .build();
    }

    public String toDTO(TeachingToolEntity teachingToolEntity) {
        return teachingToolEntity.getName();
    }
}
