package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.fieldOfStudy.FieldOfStudyJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;

@Dependent
public class StudyProgramService {
    @Inject
    StudyProgramRepository studyProgramRepository;

    @Inject
    StudyProgramJPAMapper studyProgramJPAMapper;

    @Inject
    StudyProgramDTOMapper studyProgramDTOMapper;

    @Inject
    StudyProgramToModuleRepository studyProgramToModuleRepository;

    @Inject
    StudyProgramToModuleJPAMapper studyProgramToModuleJPAMapper;

    @Inject
    StudyProgramToModuleDTOMapper studyProgramToModuleDTOMapper;

    void insertStudyProgram(StudyProgramDTO studyProgram) {
        StudyProgramJPA studyProgramJPA = studyProgramJPAMapper.toJPA(studyProgramDTOMapper.toEntity(studyProgram));
        studyProgramRepository.persist(studyProgramJPA);
        for(StudyProgramToModuleDTO studyProgramToModule : studyProgram.getModules()) {
            studyProgramToModuleRepository.persist(studyProgramToModuleJPAMapper.toJPA(studyProgramToModuleDTOMapper.toEntity(studyProgramToModule), studyProgramJPA));
        }
    }

    List<StudyProgramEntity> getAllStudyPrograms(int pageIndex, int pageSize) {
        return studyProgramRepository.getAll(pageIndex, pageSize)
                .stream().map(x -> studyProgramJPAMapper.toEntity(x, studyProgramToModuleRepository.getModules(x).map(studyProgramToModuleJPAMapper::toEntity).collect(Collectors.toSet())))
                .collect(Collectors.toList());
    }

    long getAllSize() { return studyProgramRepository.getAllSize(); }

    List<StudyProgramJPA> getAllLatestVersions(int pageIndex, int pageSize) {
        return studyProgramRepository.getAllLatestVersions(pageIndex, pageSize);
    }

    long getAllLatestVersionsSize() {
        return studyProgramRepository.getAllLatestVersionsSize();
    }

    StudyProgramJPA getById(long id) {
        return studyProgramRepository.getById(id);
    }

    List<StudyProgramJPA> getAllProgramVersions(FieldOfStudyJPA fieldOfStudyJPA, int pageIndex, int pageSize) {
        return studyProgramRepository.getAllProgramVersions(fieldOfStudyJPA, pageIndex, pageSize);
    }

    long getAllProgramVersionsSize(FieldOfStudyJPA fieldOfStudyJPA) {
        return studyProgramRepository.getAllProgramVersionsSize(fieldOfStudyJPA);
    }

    StudyProgramJPA getLatestVersion(FieldOfStudyJPA fieldOfStudyJPA) {
        return studyProgramRepository.getLatestVersion(fieldOfStudyJPA);
    }
}
