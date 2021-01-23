package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class DisciplineService {
    private DisciplineRepository disciplineRepository;

    @Inject
    DisciplineService(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    List<DisciplineEntity> getAllDisciplines() {
        return disciplineRepository.getAllDisciplines();
    }
}
