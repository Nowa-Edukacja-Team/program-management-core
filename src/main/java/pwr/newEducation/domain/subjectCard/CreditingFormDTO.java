package pwr.newEducation.domain.subjectCard;

public class CreditingFormDTO {
	private long idCreditingForm;
    private String name;

    private CreditingFormDTO() {}

    private CreditingFormDTO(Builder builder) {
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

    public static Builder builder(CreditingFormDTO creditingFormDTO) {
        return new Builder(creditingFormDTO);
    }

    public static Builder builder(long idCreditingForm, String name) {
        return new Builder(idCreditingForm, name);
    }

    public static class Builder {
        private long idCreditingForm;
        private String name;

        Builder () {}

        Builder(CreditingFormDTO creditingFormDTO) {
            idCreditingForm = creditingFormDTO.idCreditingForm;
            name = creditingFormDTO.name;
        }

        Builder(long idCreditingForm, String name) {
            this.idCreditingForm = idCreditingForm;
            this.name = name;
        }

        public CreditingFormDTO build() {
            return new CreditingFormDTO(this);
        }
    }
}
