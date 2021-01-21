package pwr.newEducation.domain.fieldOfStudy;

public class FacultyDTO {
    private long idFacultyDTO;
    private String name;

    private FacultyDTO() {

    }

    private FacultyDTO(Builder builder) {
        this.idFacultyDTO = builder.idFacultyDTO;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdFacultyDTO() {
        return idFacultyDTO;
    }

    public static Builder builder(FacultyDTO facultyDTO) {
        return new Builder(facultyDTO);
    }

    public static Builder builder(long idFacultyDTO, String name) {
        return new Builder(idFacultyDTO, name);
    }

    public static class Builder {
        private long idFacultyDTO;
        private String name;

        Builder() {

        }

        Builder(FacultyDTO facultyDTO) {
            idFacultyDTO = facultyDTO.idFacultyDTO;
            name = facultyDTO.name;
        }

        private Builder(long idFacultyDTO, String name) {
            this.idFacultyDTO = idFacultyDTO;
            this.name = name;
        }

        public FacultyDTO build() {
            return new FacultyDTO(this);
        }
    }
}
