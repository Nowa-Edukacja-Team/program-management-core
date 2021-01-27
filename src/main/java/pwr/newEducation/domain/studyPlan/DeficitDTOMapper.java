package pwr.newEducation.domain.studyPlan;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DeficitDTOMapper {
    public DeficitEntity toEntity(DeficitDTO deficitDTO) {
        return DeficitEntity.builder(deficitDTO.getSemester(), deficitDTO.getLimitECTS())
                .build();
    }

    public DeficitDTO toDTO(DeficitEntity deficitEntity) {
        return DeficitDTO.builder(deficitEntity.getSemester(), deficitEntity.getLimitECTS())
                .build();
    }
}
