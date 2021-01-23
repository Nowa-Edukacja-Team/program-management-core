package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LanguageJPAMapper {
    public LanguageEntity toEntity(LanguageJPA languageJPA) {
        return LanguageEntity.builder(languageJPA.getIdLanguageJPA(), languageJPA.getName())
                .build();
    }

    public LanguageJPA toJPA(LanguageEntity languageEntity) {
        return LanguageJPA.builder(languageEntity.getIdLanguageEntity(), languageEntity.getName())
                .build();
    }
}