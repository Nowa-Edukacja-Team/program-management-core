package pwr.newEducation.domain.subjectCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CreditingFormJPA {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    public CreditingFormJPA(){}

    public String getName() {
        return name;
    }

    public long getIdCreditingForm() {
        return id;
    }

    public CreditingFormJPA(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder (long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder(){}

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public CreditingFormJPA build() {
            return new CreditingFormJPA(this);
        }
    }
}
