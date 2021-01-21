package pwr.newEducation.domain.fieldOfStudy;

public class DisciplineDTOMapper {
    public DisciplineEntity toEntity(DisciplineDTO disciplineDTO) {
        return DisciplineEntity.builder(disciplineDTO.getIdDisciplineDTO(), disciplineDTO.getName())
                .build();
    }

    public DisciplineDTO toDTO(DisciplineEntity disciplineEntity) {
        return DisciplineDTO.builder(disciplineEntity.getIdDisciplineEntity(), disciplineEntity.getName())
                .build();
    }
}
