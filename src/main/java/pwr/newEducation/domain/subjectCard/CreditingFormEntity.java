package pwr.newEducation.domain.subjectCard;

public class CreditingFormEntity {
	private long idCreditingForm;
    private String name;

    private CreditingFormEntity() {}

    private CreditingFormEntity(Builder builder) {
        this.idCreditingForm = builder.idCreditingForm;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdCreditingForm() {
        return idCreditingForm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdCreditingForm(long idCreditingForm) {
        this.idCreditingForm = idCreditingForm;
    }

    public static Builder builder(CreditingFormEntity creditingFormEntity) {
        return new Builder(creditingFormEntity);
    }

    public static Builder builder(long idCreditingForm, String name) {
        return new Builder(idCreditingForm, name);
    }

    public static class Builder {
        private long idCreditingForm;
        private String name;

        Builder () {}

        Builder(CreditingFormEntity creditingFormEntity) {
            idCreditingForm = creditingFormEntity.idCreditingForm;
            name = creditingFormEntity.name;
        }

        Builder(long idCreditingForm, String name) {
            this.idCreditingForm = idCreditingForm;
            this.name = name;
        }

        public CreditingFormEntity build() {
            return new CreditingFormEntity(this);
        }
    }
}
