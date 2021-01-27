package pwr.newEducation.domain.searchRepresentation;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class StudyProgramItemDataService {
    private StudyProgramItemDataRepository studyProgramItemDataRepository;

    @Inject
    public StudyProgramItemDataService(StudyProgramItemDataRepository studyProgramItemDataRepository) {
        this.studyProgramItemDataRepository = studyProgramItemDataRepository;
    }

    List<ItemDataEntity> getListOfIds(int pageIndex, int pageSize) {
        return studyProgramItemDataRepository.getListOfIds(pageIndex, pageSize);
    }
}
