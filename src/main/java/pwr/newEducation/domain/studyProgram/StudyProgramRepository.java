package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyJPA;

import javax.enterprise.context.Dependent;
import java.util.List;

@Dependent
public class StudyProgramRepository implements PanacheRepository<StudyProgramJPA> {
    List<StudyProgramJPA> getAll(int pageIndex, int pageSize) {
        return findAll().page(pageIndex, pageSize).list();
    }

    long getAllSize() { return findAll().count(); }

    List<StudyProgramJPA> getAllLatestVersions(int pageIndex, int pageSize) {
        return find("SELECT s.* " +
                "FROM StudyProgramJPA s " +
                "WHERE (s.version, s.id) IN " +
                    "(SELECT MAX(sp.version), sp.id " +
                    "FROM StudyProgramJPA sp " +
                    "GROUP BY sp.fieldOfStudy)").page(pageIndex, pageSize).list();
    }

   long getAllLatestVersionsSize() {
        return find("SELECT s.* " +
                "FROM StudyProgramJPA s " +
                "WHERE (s.version, s.id) IN " +
                "(SELECT MAX(sp.version), sp.id " +
                "FROM StudyProgramJPA sp " +
                "GROUP BY sp.fieldOfStudy)").count();
    }

    StudyProgramJPA getById(long id) {
        return findById(id);
    }

    List<StudyProgramJPA> getAllProgramVersions(FieldOfStudyJPA fieldOfStudyJPA, int pageIndex, int pageSize) {
        return find("fieldOfStudy", fieldOfStudyJPA).page(pageIndex, pageSize).list();
    }

    long getAllProgramVersionsSize(FieldOfStudyJPA fieldOfStudyJPA) {
        return find("fieldOfStudy", fieldOfStudyJPA).count();
    }

    StudyProgramJPA getLatestVersion(FieldOfStudyJPA fieldOfStudyJPA) {
        return list("fieldOfStudy", Sort.by("version").descending(), fieldOfStudyJPA).get(0);
    }

    void insertStudyProgram(StudyProgramJPA studyProgramJPA) {
        persist(studyProgramJPA);
    }
}