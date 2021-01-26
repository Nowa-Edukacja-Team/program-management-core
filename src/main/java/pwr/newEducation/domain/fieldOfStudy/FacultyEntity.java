package pwr.newEducation.domain.fieldOfStudy;

public class FacultyEntity {
    private long id;
    private String name;

    private FacultyEntity() {

    }

    private FacultyEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdFacultyEntity() {
        return id;
    }

    public static Builder builder(FacultyEntity facultyEntity) {
        return new Builder(facultyEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(FacultyEntity facultyEntity) {
            id = facultyEntity.id;
            name = facultyEntity.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public FacultyEntity build() {
            return new FacultyEntity(this);
        }
    }
}
