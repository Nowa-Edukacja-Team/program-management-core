package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Singleton;
import java.util.List;

@Dependent
public class StudyProgramRepository implements PanacheRepository<StudyProgramJPA> {
    public List<StudyProgramJPA> getAll() {
        return findAll().list();
    }

    public StudyProgramJPA getById(Long id) {
        return findById(id);
    }

    public void insertStudyProgram(StudyProgramEntity studyProgramEntity) {
    }

    public void updateStudyProgram(StudyProgramEntity studyProgramEntity) {
        StudyProgramJPA studyProgramJPA = findById(studyProgramEntity.getIdStudyProgram());

    }

    public void deleteStudyProgram(long id) {

    }


}
