package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SpecializationJPA {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToMany(mappedBy = "specializationJPAS")
    private Set<FieldOfStudyJPA> fieldOfStudyJPAS = new HashSet<>();

    private SpecializationJPA(Builder builder){
        id = builder.id;
        name = builder.name;
    }

    public SpecializationJPA() {

    }

    public long getIdSpecializationJPA() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<FieldOfStudyJPA> getFieldOfStudyJPAS() {
        return fieldOfStudyJPAS;
    }

    public static Builder builder (long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() {

        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public SpecializationJPA build() {
            return new SpecializationJPA(this);
        }
    }
}
