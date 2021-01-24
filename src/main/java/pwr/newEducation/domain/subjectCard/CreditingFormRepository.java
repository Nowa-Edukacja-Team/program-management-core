package pwr.newEducation.domain.subjectCard;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class CreditingFormRepository implements PanacheRepository<CreditingFormJPA> {
    CreditingFormJPAMapper creditingFormJPAMapper;

    @Inject
    public CreditingFormRepository(CreditingFormJPAMapper creditingFormJPAMapper) {
        this.creditingFormJPAMapper = creditingFormJPAMapper;
    }

    public List<CreditingFormEntity> getAllCreditinForms() {
        return streamAll().map(creditingFormJPAMapper::toEntity).collect(Collectors.toList());
    }
}
