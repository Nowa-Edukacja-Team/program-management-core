package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FieldOfStudyJPA {
    @Id
    private String idFieldOFStudy;
    @ManyToOne
    private FacultyJPA facultyJPA;

    @ManyToOne
    private LanguagesJPA languagesJPA;

    public void setIdFieldOFStudy(String idFieldOFStudy) {
        this.idFieldOFStudy = idFieldOFStudy;
    }

    public String getIdFieldOFStudy() {
        return idFieldOFStudy;
    }
}
