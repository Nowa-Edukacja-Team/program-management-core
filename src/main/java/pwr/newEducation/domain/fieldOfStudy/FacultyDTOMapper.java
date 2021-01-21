package pwr.newEducation.domain.fieldOfStudy;

public class FacultyDTOMapper {
    public FacultyEntity toEntity(FacultyDTO facultyDTO) {
        return FacultyEntity.builder(facultyDTO.getIdFacultyDTO(), facultyDTO.getName())
                .build();
    }

    public FacultyDTO toDTO(FacultyEntity facultyEntity) {
        return FacultyDTO.builder(facultyEntity.getIdFacultyEntity(), facultyEntity.getName())
                .build();
    }
}
