package pwr.newEducation.domain.subjectCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CreditingFormJPA {
    @Id
    @GeneratedValue
    private long idCreditingForm;
    private String name;

    public CreditingFormJPA(){}

    public String getName() {
        return name;
    }

    public long getIdCreditingForm() {
        return idCreditingForm;
    }

    public CreditingFormJPA(Builder builder) {
        this.idCreditingForm = builder.idCreditingForm;
        this.name = builder.name;
    }

    public static Builder builder (long idCreditingForm, String name) {
        return new Builder(idCreditingForm, name);
    }

    public static class Builder {
        private long idCreditingForm;
        private String name;

        Builder(){}

        Builder(long idCreditingForm, String name) {
            this.idCreditingForm = idCreditingForm;
            this.name = name;
        }

        public CreditingFormJPA build() {
            return new CreditingFormJPA(this);
        }
    }
}
