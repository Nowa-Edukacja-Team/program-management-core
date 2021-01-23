package pwr.newEducation.domain.studyPlan;

import javax.persistence.*;

@Entity
public class DeficitJPA {
    @Id
    @GeneratedValue
    private long idDeficit;
    private int semester;
    private int limitECTS;

    public long getIdDeficit() {
        return idDeficit;
    }

    public int getSemester() {
        return semester;
    }

    public int getLimit() {
        return limitECTS;
    }

    public DeficitJPA() {}

    public static Builder builder(int semester, int limitECTS) {
        return new Builder(semester, limitECTS);
    }

    DeficitJPA(Builder builder) {
        idDeficit = builder.idDeficit;
        semester = builder.semester;
        limitECTS = builder.limitECTS;
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

        public DeficitJPA build() {
            return new DeficitJPA(this);
        }
    }
}