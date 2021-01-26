package pwr.newEducation.domain.subjectCard;

public class CreditingFormEntity {
	private long id;
    private String name;

    private CreditingFormEntity() {}

    private CreditingFormEntity(Builder builder) {
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

    public static Builder builder(CreditingFormEntity creditingFormEntity) {
        return new Builder(creditingFormEntity);
    }

    public static Builder builder(long id, String name) {
        return new Builder(id, name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder () {}

        Builder(CreditingFormEntity creditingFormEntity) {
            id = creditingFormEntity.id;
            name = creditingFormEntity.name;
        }

        Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public CreditingFormEntity build() {
            return new CreditingFormEntity(this);
        }
    }
}
