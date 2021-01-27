package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectPrerequisiteDTOMapper {
    public SubjectPrerequisiteEntity toEntity(String content) {
        return SubjectPrerequisiteEntity.builder(content)
                .build();
    }

    public String toDTO(SubjectPrerequisiteEntity subjectPrerequisiteEntity) {
        return subjectPrerequisiteEntity.getContent();
    }
}
