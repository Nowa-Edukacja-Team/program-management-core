package pwr.newEducation.domain.studyPlan;


public class DeficitEntity {
    private long idDeficit;
    private int semester;
    private int limitECTS;

    public long getIdDeficit() {
        return idDeficit;
    }

    public int getSemester() {
        return semester;
    }

    public int getLimitECTS() {
        return limitECTS;
    }

    DeficitEntity(Builder builder) {
        idDeficit = builder.idDeficit;
        semester = builder.semester;
        limitECTS = builder.limitECTS;
    }

    public static Builder builder(int semester, int limitECTS) {
        return new Builder(semester, limitECTS);
    }

    public static class Builder {
        private long idDeficit;
        private int semester;
        private int limitECTS;

        Builder(int semester, int limitECTS) {
            this.semester = semester;
            this.limitECTS = limitECTS;
        }

        Builder() {}

        public Builder withIdDeficit(long idDeficit) {
            this.idDeficit = idDeficit;
            return this;
        }

        public DeficitEntity build() {
            return new DeficitEntity(this);
        }
    }
}
