package pwr.newEducation.domain.fieldOfStudy;

public class DisciplineDTO {
    private long idDiscipline;
    private String name;

    private DisciplineDTO() {

    }

    private DisciplineDTO(Builder builder) {
        this.idDiscipline = builder.idDiscipline;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdDiscipline() {
        return idDiscipline;
    }

    public static Builder builder(DisciplineDTO disciplineDTO) {
        return new Builder(disciplineDTO);
    }

    public static Builder builder(long idDiscipline, String name) {
        return new Builder(idDiscipline, name);
    }

    public static class Builder {
        private long idDiscipline;
        private String name;

        Builder() {

        }

        Builder(DisciplineDTO disciplineDTO) {
            idDiscipline = disciplineDTO.idDiscipline;
            name = disciplineDTO.name;
        }

        private Builder(long idDiscipline, String name) {
            this.idDiscipline = idDiscipline;
            this.name = name;
        }

        public DisciplineDTO build() {
            return new DisciplineDTO(this);
        }
    }
}
