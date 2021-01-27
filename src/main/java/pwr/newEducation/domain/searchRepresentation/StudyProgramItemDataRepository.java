package pwr.newEducation.domain.searchRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Page;
import pwr.newEducation.domain.studyProgram.StudyProgramJPA;
import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

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

    public List<ItemDataEntity> getListOfIds(int pageIndex, int pageSize) {
        PanacheQuery<StudyProgramJPA> query = findAll();
        query.page(Page.ofSize(pageSize));
        return query.page(pageIndex, pageSize).stream()
                .map(studyProgramToItemDataMapper::toEntity).collect(Collectors.toList());
    }
}
