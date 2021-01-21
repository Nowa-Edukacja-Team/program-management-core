package pwr.newEducation.domain.fieldOfStudy;

public class FacultyEntity {
    private long idFacultyEntity;
    private String name;

    private FacultyEntity() {

    }

    private FacultyEntity(Builder builder) {
        this.idFacultyEntity = builder.idFacultyEntity;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdFacultyEntity() {
        return idFacultyEntity;
    }

    public static Builder builder(FacultyEntity facultyEntity) {
        return new Builder(facultyEntity);
    }

    public static Builder builder(long idFacultyEntity, String name) {
        return new Builder(idFacultyEntity, name);
    }

    public static class Builder {
        private long idFacultyEntity;
        private String name;

        Builder() {

        }

        Builder(FacultyEntity facultyEntity) {
            idFacultyEntity = facultyEntity.idFacultyEntity;
            name = facultyEntity.name;
        }

        private Builder(long idFacultyEntity, String name) {
            this.idFacultyEntity = idFacultyEntity;
            this.name = name;
        }

        public FacultyEntity build() {
            return new FacultyEntity(this);
        }
    }
}
