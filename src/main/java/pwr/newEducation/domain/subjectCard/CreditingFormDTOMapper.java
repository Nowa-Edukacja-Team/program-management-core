package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreditingFormDTOMapper {
    public CreditingFormEntity toEntity(CreditingFormDTO creditingFormDTO) {
        return CreditingFormEntity.builder(creditingFormDTO.getIdCreditingForm(), creditingFormDTO.getName())
                .build();
    }

    public CreditingFormDTO toDTO(CreditingFormEntity creditingFormEntity) {
        return CreditingFormDTO.builder(creditingFormEntity.getIdCreditingForm(), creditingFormEntity.getName())
                .build();
    }
}
