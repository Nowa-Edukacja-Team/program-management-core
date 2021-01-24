package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TeachingToolDTOMapper {

    public TeachingToolEntity toEntity(TeachingToolDTO teachingToolDTO) {
        return TeachingToolEntity.builder(teachingToolDTO.getIdTeachingTool(),
                teachingToolDTO.getName())
                .build();
    }

    public TeachingToolDTO toDTO(TeachingToolEntity teachingToolEntity) {
        return TeachingToolDTO.builder(teachingToolEntity.getIdTeachingTool(),
                teachingToolEntity.getName())
                .build();
    }
}
