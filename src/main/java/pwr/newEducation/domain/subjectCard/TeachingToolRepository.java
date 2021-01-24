package pwr.newEducation.domain.subjectCard;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class TeachingToolRepository implements PanacheRepository<TeachingToolJPA> {
    TeachingToolJPAMapper teachingToolJPAMapper;

    @Inject
    public TeachingToolRepository(TeachingToolJPAMapper teachingToolJPAMapper) {
        this.teachingToolJPAMapper = teachingToolJPAMapper;
    }

    public List<TeachingToolEntity> getAllDisciplines() {
        return streamAll().map(teachingToolJPAMapper::toEntity).collect(Collectors.toList());
    }
}
