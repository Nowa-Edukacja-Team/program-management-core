package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LevelJPAMapper {
    public LevelEntity toEntity(LevelJPA levelJPA) {
        return LevelEntity.builder(levelJPA.getIdLevelJPA(), levelJPA.getName())
                .build();
    }

    public LevelJPA toJPA(LevelEntity levelEntity) {
        return LevelJPA.builder(levelEntity.getIdLevelEntity(), levelEntity.getName())
                .build();
    }
}
