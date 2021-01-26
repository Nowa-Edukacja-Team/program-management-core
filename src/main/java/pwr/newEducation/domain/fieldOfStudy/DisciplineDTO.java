package pwr.newEducation.domain.fieldOfStudy;

public class DisciplineDTO {
    private long id;
    private String name;

    private DisciplineDTO() {

    }

    private DisciplineDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdDiscipline() {
        return id;
    }

    public static Builder builder(DisciplineDTO disciplineDTO) {
        return new Builder(disciplineDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(DisciplineDTO disciplineDTO) {
            id = disciplineDTO.id;
            name = disciplineDTO.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public DisciplineDTO build() {
            return new DisciplineDTO(this);
        }
    }
}
