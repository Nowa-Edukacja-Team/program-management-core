package pwr.newEducation.domain.fieldOfStudy;


import java.util.HashSet;
import java.util.Set;

public class SpecializationEntity {
    private long id;
    private String name;
    private Set<FieldOfStudyEntity> fieldOfStudyEntities = new HashSet<>();

    private SpecializationEntity(Builder builder){
        id = builder.id;
        name = builder.name;
        fieldOfStudyEntities = builder.fieldOfStudyEntities;
    }

    public SpecializationEntity() {

    }

    public long getIdSpecializationEntity() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<FieldOfStudyEntity> getFieldOfStudyEntities() {
        return fieldOfStudyEntities;
    }

    public static Builder builder (long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;
        private Set<FieldOfStudyEntity> fieldOfStudyEntities;

        Builder() {

        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;;
        }

        public SpecializationEntity build() {
            return new SpecializationEntity(this);
        }
    }
}
