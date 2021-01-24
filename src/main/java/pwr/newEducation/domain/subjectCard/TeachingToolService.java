package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class TeachingToolService {
    private TeachingToolRepository teachingToolRepository;

    @Inject
    TeachingToolService(TeachingToolRepository teachingToolRepository) {
        this.teachingToolRepository = teachingToolRepository;
    }

    List<TeachingToolEntity> getAllTeachingTools() {
        return teachingToolRepository.getAllDisciplines();
    }
}
