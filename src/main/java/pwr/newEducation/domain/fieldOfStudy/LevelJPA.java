package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class LevelJPA {
    @Id
    @GeneratedValue
    private long idLevelJPA;
    private String name;

    @OneToMany(mappedBy = "levelJPA")
    private Set<FieldOfStudyJPA> fieldOfStudyJPAS;
}
