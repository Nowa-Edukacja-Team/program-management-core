package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class CreditingFormService {
    private CreditingFormRepository creditingFormRepository;

    @Inject
    CreditingFormService(CreditingFormRepository creditingFormRepository) {
        this.creditingFormRepository = creditingFormRepository;
    }

    List<CreditingFormEntity> getAllCreditingForms() {
        return creditingFormRepository.getAllCreditinForms();
    }
}
