package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SpecializationJPAMapper {
    public SpecializationEntity toEntity(SpecializationJPA specializationJPA) {
        return SpecializationEntity.builder(specializationJPA.getIdSpecializationJPA(), specializationJPA.getName())
                .build();
    }

    public SpecializationJPA toJPA(SpecializationEntity specializationEntity) {
        return SpecializationJPA.builder(specializationEntity.getIdSpecializationEntity(), specializationEntity.getName())
                .build();
    }
}

