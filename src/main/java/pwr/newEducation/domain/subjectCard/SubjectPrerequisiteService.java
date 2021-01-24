package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SubjectPrerequisiteService {
    private SubjectPrerequisiteRepository subjectPrerequisiteRepository;

    @Inject
    SubjectPrerequisiteService(SubjectPrerequisiteRepository subjectPrerequisiteRepository) {
        this.subjectPrerequisiteRepository = subjectPrerequisiteRepository;
    }

    List<SubjectPrerequisiteEntity> getAllSubjectPrerequisites() {
        return subjectPrerequisiteRepository.getAllDisciplines();
    }
}
