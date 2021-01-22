package pwr.newEducation.domain.fieldOfStudy;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class DisciplineRepository implements PanacheRepository<DisciplineJPA> {
    DisciplineJPAMapper disciplineJPAMapper;

    @Inject
    public DisciplineRepository(DisciplineJPAMapper disciplineJPAMapper) {
        this.disciplineJPAMapper = disciplineJPAMapper;
    }

    public List<DisciplineEntity> getAllDisciplines() {
        return streamAll().map(disciplineJPAMapper::toEntity).collect(Collectors.toList());
    }
}
