package pwr.newEducation.domain.searchRepresentation;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SubjectCardItemDataService {
    private SubjectCardItemDataRepository itemDataRepository;

    @Inject
    public SubjectCardItemDataService(SubjectCardItemDataRepository itemDataRepository) {
        this.itemDataRepository = itemDataRepository;
    }

    List<ItemDataEntity> getListOfIds(int pageIndex, int pageSize) {
        return itemDataRepository.getListOfIds(pageIndex, pageSize);
    }
}
