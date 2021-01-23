package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DisciplineJPAMapper {
    public DisciplineEntity toEntity(DisciplineJPA disciplineJPA) {
        return DisciplineEntity.builder(disciplineJPA.getIdDiscipline(), disciplineJPA.getName())
                .build();
    }

    public DisciplineJPA toJPA(DisciplineEntity disciplineEntity) {
        return DisciplineJPA.builder(disciplineEntity.getIdDiscipline(), disciplineEntity.getName())
                .build();
    }
}
