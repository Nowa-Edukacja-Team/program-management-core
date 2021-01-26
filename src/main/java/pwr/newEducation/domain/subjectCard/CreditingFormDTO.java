package pwr.newEducation.domain.subjectCard;

public class CreditingFormDTO {
	private long id;
    private String name;

    private CreditingFormDTO() {}

    private CreditingFormDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdCreditingForm() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdCreditingForm(long id) {
        this.id = id;
    }

    public static Builder builder(CreditingFormDTO creditingFormDTO) {
        return new Builder(creditingFormDTO);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder () {}

        Builder(CreditingFormDTO creditingFormDTO) {
            id = creditingFormDTO.id;
            name = creditingFormDTO.name;
        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public CreditingFormDTO build() {
            return new CreditingFormDTO(this);
        }
    }
}
