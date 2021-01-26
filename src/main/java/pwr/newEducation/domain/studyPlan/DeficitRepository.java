package pwr.newEducation.domain.studyPlan;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class DeficitRepository implements PanacheRepository<DeficitJPA> {
    private DeficitJPAMapper deficitJPAMapper;

    @Inject
    public DeficitRepository(DeficitJPAMapper deficitJPAMapper) {
        this.deficitJPAMapper = deficitJPAMapper;
    }

    public List<DeficitEntity> getAllDeficits(){
        return streamAll().map(deficitJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}
