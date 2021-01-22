package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SpecializationRepository implements PanacheRepository<SpecializationJPA> {
    SpecializationJPAMapper specializationJPAMapper;

    @Inject
    public SpecializationRepository(SpecializationJPAMapper specializationJPAMapper) {
        this.specializationJPAMapper = specializationJPAMapper;
    }

    public List<SpecializationEntity> getAllSpecializations() {
        return streamAll().map(specializationJPAMapper::toEntity).collect(Collectors.toList());
    }
}
