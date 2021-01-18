package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class StudyProgramRepository implements PanacheRepository<StudyProgramJPA> {
    public List<StudyProgramJPA> getAll() {
        return findAll().list();
    }

    public StudyProgramJPA getById(Long id) {
        return findById(id);
    }

    public void insertStudyProgram(StudyProgramEntity studyProgramEntity) {
        persist();

    }

    public void updateStudyProgram(StudyProgramEntity studyProgramEntity) {
        StudyProgramJPA studyProgramJPA = findById(studyProgramEntity.);

    }

    public void deleteStudyProgram(long id) {

    }


}
