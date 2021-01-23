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
    private long idSpecializationJPA;
    private String name;

    @ManyToMany(mappedBy = "specializationJPAS")
    private Set<FieldOfStudyJPA> fieldOfStudyJPAS = new HashSet<>();

    private SpecializationJPA(Builder builder){
        idSpecializationJPA = builder.idSpecializationJPA;
        name = builder.name;
    }

    public SpecializationJPA() {

    }

    public long getIdSpecializationJPA() {
        return idSpecializationJPA;
    }

    public String getName() {
        return name;
    }

    public Set<FieldOfStudyJPA> getFieldOfStudyJPAS() {
        return fieldOfStudyJPAS;
    }

    public static Builder builder (long idSpecializationJPA, String name) {
        return new Builder(idSpecializationJPA, name);
    }

    public static class Builder {
        private long idSpecializationJPA;
        private String name;

        Builder() {

        }

        Builder(long idSpecializationJPA, String name) {
            this.idSpecializationJPA = idSpecializationJPA;
            this.name = name;
        }

        public SpecializationJPA build() {
            return new SpecializationJPA(this);
        }
    }
}
