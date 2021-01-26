package pwr.newEducation.domain.searchRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class StudyPlanItemDataRepository implements PanacheRepository<StudyPlanJPA> {
    StudyPlanToItemDataMapper studyPlanToItemDataMapper;

    @Inject
    public StudyPlanItemDataRepository(StudyPlanToItemDataMapper studyPlanToItemDataMapper) {
        this.studyPlanToItemDataMapper = studyPlanToItemDataMapper;
    }

    public List<ItemDataEntity> getListOfIds() {
        return streamAll().map(studyPlanToItemDataMapper::toEntity).collect(Collectors.toList());
    }
}
