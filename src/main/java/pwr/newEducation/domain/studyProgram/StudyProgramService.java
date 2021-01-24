package pwr.newEducation.domain.studyProgram;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class StudyProgramService {
    @Inject
    StudyProgramRepository studyProgramRepository;

    @Inject
    StudyProgramJPAMapper studyProgramJPAMapper;

    void insertStudyProgram(StudyProgramEntity studyProgramEntity) {
        studyProgramRepository.insertStudyProgram(studyProgramJPAMapper.toJPA(studyProgramEntity));
    }

    List<StudyProgramEntity> getAllStudyPrograms() {
        return studyProgramRepository.getAll().stream().map(studyProgramJPAMapper::toEntity).collect(Collectors.toList());
    }
}
