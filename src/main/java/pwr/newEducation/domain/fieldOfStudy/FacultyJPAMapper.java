package pwr.newEducation.domain.fieldOfStudy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacultyJPAMapper {
    public FacultyEntity toEntity(FacultyJPA facultyJPA) {
        return FacultyEntity.builder(facultyJPA.getIdFacultyJPA(), facultyJPA.getName())
                .build();
    }

    public FacultyJPA toJPA(FacultyEntity facultyEntity) {
        return FacultyJPA.builder(facultyEntity.getIdFacultyEntity(), facultyEntity.getName())
                .build();
    }
}
