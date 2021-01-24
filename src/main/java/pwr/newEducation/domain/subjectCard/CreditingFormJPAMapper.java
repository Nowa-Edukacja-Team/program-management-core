package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreditingFormJPAMapper {
    public CreditingFormEntity toEntity(CreditingFormJPA creditingFormJPA) {
        return CreditingFormEntity.builder(creditingFormJPA.getIdCreditingForm(), creditingFormJPA.getName())
                .build();
    }

    public CreditingFormJPA toJPA(CreditingFormEntity creditingFormEntity) {
        return CreditingFormJPA.builder(creditingFormEntity.getIdCreditingForm(), creditingFormEntity.getName())
                .build();
    }
}
