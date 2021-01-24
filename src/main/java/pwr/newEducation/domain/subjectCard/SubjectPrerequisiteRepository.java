package pwr.newEducation.domain.subjectCard;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectPrerequisiteRepository implements PanacheRepository<SubjectPrerequisiteJPA> {
    SubjectPrerequisiteJPAMapper subjectPrerequisiteJPAMapper;

    @Inject
    public SubjectPrerequisiteRepository(SubjectPrerequisiteJPAMapper subjectPrerequisiteJPAMapper) {
        this.subjectPrerequisiteJPAMapper = subjectPrerequisiteJPAMapper;
    }

    public List<SubjectPrerequisiteEntity> getAllDisciplines() {
        return streamAll().map(subjectPrerequisiteJPAMapper::toEntity).collect(Collectors.toList());
    }
}
