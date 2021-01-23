package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class LearningCycleJPA {
    @Id
    @GeneratedValue
    public long idLearningCycle;
    public String name;

    //@OneToMany(mappedBy = "learningCycleJPA")
    //public Set<FieldOfStudyJPA> fieldOfStudyJPAS;
}
