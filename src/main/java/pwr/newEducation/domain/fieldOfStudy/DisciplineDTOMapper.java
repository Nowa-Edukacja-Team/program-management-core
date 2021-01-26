package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class DisciplineDTOMapper {
    public DisciplineEntity toEntity(DisciplineDTO disciplineDTO) {
        if(disciplineDTO == null)
            return null;
        else
            return DisciplineEntity.builder(disciplineDTO.getIdDiscipline(), disciplineDTO.getName())
                    .build();
    }

    public DisciplineDTO toDTO(DisciplineEntity disciplineEntity) {
        if(disciplineEntity == null)
            return null;
        else
            return DisciplineDTO.builder(disciplineEntity.getIdDiscipline(), disciplineEntity.getName())
                    .build();
    }
}
