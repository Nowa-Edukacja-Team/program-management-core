package pwr.newEducation.domain.fieldOfStudy;

public class FacultyDTO {
    private long id;
    private String name;

    private FacultyDTO() {

    }

    private FacultyDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdFacultyDTO() {
        return id;
    }

    public static Builder builder(FacultyDTO facultyDTO) {
        return new Builder(facultyDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(FacultyDTO facultyDTO) {
            id = facultyDTO.id;
            name = facultyDTO.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public FacultyDTO build() {
            return new FacultyDTO(this);
        }
    }
}
