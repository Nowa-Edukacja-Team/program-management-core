package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class LanguageJPA {
    @Id
    @GeneratedValue
    private long idLanguages;

    private String name;

    @OneToMany(mappedBy = "languagesJPA")
    private Set<FieldOfStudyJPA> fieldOfStudyJPA;
}
