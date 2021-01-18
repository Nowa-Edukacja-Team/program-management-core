package pwr.newEducation.domain.fieldOfStudy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FieldOfStudyJPA {
    private String idFieldOFStudy;

    public void setIdFieldOFStudy(String idFieldOFStudy) {
        this.idFieldOFStudy = idFieldOFStudy;
    }

    @Id
    public String getIdFieldOFStudy() {
        return idFieldOFStudy;
    }
}
