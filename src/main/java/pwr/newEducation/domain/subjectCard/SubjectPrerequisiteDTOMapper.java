package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectPrerequisiteDTOMapper {
    public SubjectPrerequisiteEntity toEntity(SubjectPrerequisiteDTO subjectPrerequisiteDTO) {
        return SubjectPrerequisiteEntity.builder(subjectPrerequisiteDTO.getIdSubjectPrerequisite(),
                subjectPrerequisiteDTO.getContent())
                .build();
    }

    public SubjectPrerequisiteDTO toDTO(SubjectPrerequisiteEntity subjectPrerequisiteEntity) {
        return SubjectPrerequisiteDTO.builder(subjectPrerequisiteEntity.getIdSubjectPrerequisite(),
                subjectPrerequisiteEntity.getContent())
                .build();
    }
}
