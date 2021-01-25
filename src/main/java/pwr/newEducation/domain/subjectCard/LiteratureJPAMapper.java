package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LiteratureJPAMapper {
    public LiteratureEntity toEntity(LiteratureJPA literatureJPA) {
        return LiteratureEntity.builder(literatureJPA.getIdLiterature(), literatureJPA.getType(),
                literatureJPA.getContent())
                .build();
    }

    public LiteratureJPA toJPA(LiteratureEntity literatureEntity) {
        return LiteratureJPA.builder(literatureEntity.getIdLiterature(), literatureEntity.getType(),
                literatureEntity.getContent())
                .build();
    }
}
