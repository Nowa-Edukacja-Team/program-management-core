package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ModeJPAMapper {
    public ModeEntity toEntity(ModeJPA modeJPA) {
        return ModeEntity.builder(modeJPA.getIdModeJPA(), modeJPA.getName())
                .build();
    }

    public ModeJPA toJPA(ModeEntity modeEntity) {
        return ModeJPA.builder(modeEntity.getIdModeEntity(), modeEntity.getName())
                .build();
    }
}