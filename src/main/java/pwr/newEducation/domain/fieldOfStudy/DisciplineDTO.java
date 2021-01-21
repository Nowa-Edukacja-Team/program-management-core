package pwr.newEducation.domain.fieldOfStudy;

public class DisciplineDTO {
    private long idDisciplineDTO;
    private String name;

    private DisciplineDTO() {

    }

    private DisciplineDTO(Builder builder) {
        this.idDisciplineDTO = builder.idDisciplineDTO;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdDisciplineDTO() {
        return idDisciplineDTO;
    }

    public static Builder builder(DisciplineDTO disciplineDTO) {
        return new Builder(disciplineDTO);
    }

    public static Builder builder(long idDisciplineDTO, String name) {
        return new Builder(idDisciplineDTO, name);
    }

    public static class Builder {
        private long idDisciplineDTO;
        private String name;

        Builder() {

        }

        Builder(DisciplineDTO disciplineDTO) {
            idDisciplineDTO = disciplineDTO.idDisciplineDTO;
            name = disciplineDTO.name;
        }

        private Builder(long idDisciplineDTO, String name) {
            this.idDisciplineDTO = idDisciplineDTO;
            this.name = name;
        }

        public DisciplineDTO build() {
            return new DisciplineDTO(this);
        }
    }
}
