package pwr.newEducation.domain.fieldOfStudy;

public class DisciplineEntity {
    private long idDiscipline;
    private String name;

    private DisciplineEntity() {

    }

    private DisciplineEntity(Builder builder) {
        this.idDiscipline = builder.idDiscipline;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdDiscipline() {
        return idDiscipline;
    }

    public static Builder builder(DisciplineEntity disciplineEntity) {
        return new Builder(disciplineEntity);
    }

    public static Builder builder(long idDiscipline, String name) {
        return new Builder(idDiscipline, name);
    }

    public static class Builder {
        private long idDiscipline;
        private String name;

        Builder() {

        }

        Builder(DisciplineEntity disciplineEntity) {
            idDiscipline = disciplineEntity.idDiscipline;
            name = disciplineEntity.name;
        }

        private Builder(long idDiscipline, String name) {
            this.idDiscipline = idDiscipline;
            this.name = name;
        }

        public DisciplineEntity build() {
            return new DisciplineEntity(this);
        }
    }
}
