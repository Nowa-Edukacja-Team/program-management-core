package pwr.newEducation.domain.fieldOfStudy;

public class DisciplineEntity {
    private long idDisciplineEntity;
    private String name;

    private DisciplineEntity() {

    }

    private DisciplineEntity(Builder builder) {
        this.idDisciplineEntity = builder.idDisciplineEntity;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdDisciplineEntity() {
        return idDisciplineEntity;
    }

    public static Builder builder(DisciplineEntity DisciplineEntity) {
        return new Builder(DisciplineEntity);
    }

    public static Builder builder(long idDisciplineEntity, String name) {
        return new Builder(idDisciplineEntity, name);
    }

    public static class Builder {
        private long idDisciplineEntity;
        private String name;

        Builder() {

        }

        Builder(DisciplineEntity disciplineEntity) {
            idDisciplineEntity = disciplineEntity.idDisciplineEntity;
            name = disciplineEntity.name;
        }

        private Builder(long idDisciplineEntity, String name) {
            this.idDisciplineEntity = idDisciplineEntity;
            this.name = name;
        }

        public DisciplineEntity build() {
            return new DisciplineEntity(this);
        }
    }
}
