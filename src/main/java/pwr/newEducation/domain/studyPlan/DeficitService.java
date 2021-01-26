package pwr.newEducation.domain.studyPlan;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class DeficitService {
    private DeficitRepository deficitRepository;

    @Inject
    public DeficitService(DeficitRepository deficitRepository) {
        this.deficitRepository = deficitRepository;
    }

    List<DeficitEntity> getAllDeficits(){
        return deficitRepository.getAllDeficits();
    }
}
