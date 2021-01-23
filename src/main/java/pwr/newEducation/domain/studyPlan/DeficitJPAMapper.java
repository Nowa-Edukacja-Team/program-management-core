package pwr.newEducation.domain.studyPlan;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DeficitJPAMapper {
    public DeficitEntity toEntity(DeficitJPA deficitJPA) {
        return DeficitEntity.builder(deficitJPA.getSemester(), deficitJPA.getLimit())
                .withIdDeficit(deficitJPA.getIdDeficit())
                .build();
    }

    public DeficitJPA toJPA(DeficitEntity deficitEntity) {
        return DeficitJPA.builder(deficitEntity.getSemester(), deficitEntity.getLimitECTS())
                .withIdDeficit(deficitEntity.getIdDeficit())
                .build();
    }
}
