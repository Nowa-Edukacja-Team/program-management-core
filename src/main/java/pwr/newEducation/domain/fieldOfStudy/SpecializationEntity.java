package pwr.newEducation.domain.fieldOfStudy;


import java.util.HashSet;
import java.util.Set;

public class SpecializationEntity {
    private long idSpecializationEntity;
    private String name;
    private Set<FieldOfStudyEntity> fieldOfStudyEntities = new HashSet<>();

    private SpecializationEntity(Builder builder){
        idSpecializationEntity = builder.idSpecializationEntity;
        name = builder.name;
        fieldOfStudyEntities = builder.fieldOfStudyEntities;
    }

    public SpecializationEntity() {

    }

    public long getIdSpecializationEntity() {
        return idSpecializationEntity;
    }

    public String getName() {
        return name;
    }

    public Set<FieldOfStudyEntity> getFieldOfStudyEntities() {
        return fieldOfStudyEntities;
    }

    public static Builder builder (long idSpecializationEntity, String name) {
        return new Builder(idSpecializationEntity, name);
    }

    public static class Builder {
        private long idSpecializationEntity;
        private String name;
        private Set<FieldOfStudyEntity> fieldOfStudyEntities;

        Builder() {

        }

        Builder(long idSpecializationEntity, String name) {
            this.idSpecializationEntity = idSpecializationEntity;
            this.name = name;;
        }

        public SpecializationEntity build() {
            return new SpecializationEntity(this);
        }
    }
}
