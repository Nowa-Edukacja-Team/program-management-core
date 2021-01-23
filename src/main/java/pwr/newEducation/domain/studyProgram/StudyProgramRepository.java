package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Dependent
public class StudyProgramRepository implements PanacheRepository<StudyProgramJPA> {
    @Inject
    StudyProgramJPAMapper studyProgramJPAMapper;

    public List<StudyProgramJPA> getAll() {
        return findAll().list();
    }

    public StudyProgramJPA getById(Long id, int version) {
        return findById(id);
    }

    public void insertStudyProgram(StudyProgramEntity studyProgramEntity) {
        //persist(studyProgramJPAMapper.toJPA(studyProgramEntity));
    }

    public void deleteStudyProgram(long id) {

    }
}