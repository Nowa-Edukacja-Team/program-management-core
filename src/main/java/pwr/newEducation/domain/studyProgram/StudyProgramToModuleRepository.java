package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.stream.Stream;

public class StudyProgramToModuleRepository implements PanacheRepository<StudyProgramToModuleJPA> {

    Stream<StudyProgramToModuleJPA> getModules(StudyProgramJPA studyProgramJPA) {
        return find("studyProgram", studyProgramJPA).stream();
    }

    void insertModule(StudyProgramToModuleJPA studyProgramToModuleJPA) {
        persist(studyProgramToModuleJPA);
    }
}
