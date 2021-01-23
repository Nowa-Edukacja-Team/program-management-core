package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LanguageDTOMapper {
    public LanguageEntity toEntity(LanguageDTO languageDTO) {
        return LanguageEntity.builder(languageDTO.getIdLanguageDTO(), languageDTO.getName())
                .build();
    }

    public LanguageDTO toDTO(LanguageEntity languageEntity) {
        return LanguageDTO.builder(languageEntity.getIdLanguageEntity(), languageEntity.getName())
                .build();
    }
}
