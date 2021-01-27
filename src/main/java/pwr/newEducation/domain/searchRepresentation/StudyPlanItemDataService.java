package pwr.newEducation.domain.searchRepresentation;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class StudyPlanItemDataService {
    private StudyPlanItemDataRepository studyPlanItemDataRepository;

    @Inject
    public StudyPlanItemDataService(StudyPlanItemDataRepository studyPlanItemDataRepository) {
        this.studyPlanItemDataRepository = studyPlanItemDataRepository;
    }

    public List<ItemDataEntity> getListOfIds(int pageIndex, int pageSize) {
        return studyPlanItemDataRepository.getListOfIds(pageIndex, pageSize);
    }
}
