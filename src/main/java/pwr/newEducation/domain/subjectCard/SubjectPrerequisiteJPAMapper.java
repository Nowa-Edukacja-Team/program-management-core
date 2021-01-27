package pwr.newEducation.domain.subjectCard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubjectPrerequisiteJPAMapper {

    public SubjectPrerequisiteEntity toEntity(SubjectPrerequisiteJPA subjectPrerequisiteJPA) {
        return SubjectPrerequisiteEntity.builder(subjectPrerequisiteJPA.getContent())
                .build();
    }

    public SubjectPrerequisiteJPA toJPA(SubjectPrerequisiteEntity subjectPrerequisiteEntity) {
        return SubjectPrerequisiteJPA.builder(subjectPrerequisiteEntity.getIdSubjectPrerequisite(),
                subjectPrerequisiteEntity.getContent())
                .build();
    }
}
