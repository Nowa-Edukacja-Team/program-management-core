package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Page;
import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Dependent
public class StudyProgramRepository implements PanacheRepository<StudyProgramJPA> {
    List<StudyProgramJPA> getAll() {
        return findAll().list();
    }

    List<StudyProgramJPA> getAllLatestVersions() {
        return findAll().firstResult();
    }

    StudyProgramJPA getById(long id) {
        return findById(id);
    }

    StudyProgramJPA getLatestVersion(FieldOfStudyJPA fieldOfStudyJPA) {
        return find("fieldOfStudy", fieldOfStudyJPA).firstResult();
    }

    void insertStudyProgram(StudyProgramJPA studyProgramJPA) {
        persist(studyProgramJPA);
    }

    void deleteStudyProgram(StudyProgramJPA studyProgramJPA) {
        delete(studyProgramJPA);
    }
}