package pwr.newEducation.domain.searchRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class StudyProgramItemDataRepository implements PanacheRepository<StudyProgramJPA> {
    StudyProgramToItemDataMapper studyProgramToItemDataMapper;

    @Inject
    public StudyProgramItemDataRepository(StudyProgramToItemDataMapper studyProgramToItemDataMapper) {
        this.studyProgramToItemDataMapper = studyProgramToItemDataMapper;
    }

    public List<ItemDataEntity> getListOfIds() {
        return streamAll().map(studyProgramToItemDataMapper::toEntity).collect(Collectors.toList());
    }
}
