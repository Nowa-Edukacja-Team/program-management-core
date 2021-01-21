package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ModeJPA {
    @Id
    @GeneratedValue
    private long idModeJPA;
    private String name;
}
