package pwr.newEducation.domain.searchRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.subjectCard.SubjectCardJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class SubjectCardItemDataRepository implements PanacheRepository<SubjectCardJPA> {
    SubjectCardToItemDataMapper itemDataJPAMapper;

    @Inject
    public SubjectCardItemDataRepository(SubjectCardToItemDataMapper itemDataJPAMapper) {
        this.itemDataJPAMapper = itemDataJPAMapper;
    }

    public List<ItemDataEntity> getListOfIds() {
        return streamAll().map(itemDataJPAMapper::toEntity).collect(Collectors.toList());
    }
}
