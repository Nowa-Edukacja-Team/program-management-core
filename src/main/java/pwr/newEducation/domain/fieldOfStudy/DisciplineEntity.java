package pwr.newEducation.domain.fieldOfStudy;

public class DisciplineEntity {
    private long id;
    private String name;

    private DisciplineEntity() {

    }

    private DisciplineEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdDiscipline() {
        return id;
    }

    public static Builder builder(DisciplineEntity disciplineEntity) {
        return new Builder(disciplineEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(DisciplineEntity disciplineEntity) {
            id = disciplineEntity.id;
            name = disciplineEntity.name;
        }

        private Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public DisciplineEntity build() {
            return new DisciplineEntity(this);
        }
    }
}
