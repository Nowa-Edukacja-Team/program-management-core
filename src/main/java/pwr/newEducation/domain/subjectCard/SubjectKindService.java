package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SubjectKindService {
    private SubjectKindRepository subjectKindRepository;

    @Inject
    SubjectKindService(SubjectKindRepository subjectKindRepository) {
        this.subjectKindRepository = subjectKindRepository;
    }

    List<SubjectKindEntity> getAllSubjectKinds() {
        return subjectKindRepository.getAllSubjectKinds();
    }
}
