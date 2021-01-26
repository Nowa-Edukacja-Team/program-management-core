package pwr.newEducation.domain.studyPlan;

import javax.persistence.*;

@Entity
public class DeficitJPA {
    @Id
    @GeneratedValue
    private long id;
    private int semester;
    private int limitECTS;

    public long getIdDeficit() {
        return id;
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
        id = builder.id;
        semester = builder.semester;
        limitECTS = builder.limitECTS;
    }

    public static class Builder {
        private long id;
        private int semester;
        private int limitECTS;

        Builder(int semester, int limitECTS) {
            this.semester = semester;
            this.limitECTS = limitECTS;
        }

        Builder() {}

        public Builder withIdDeficit(long id) {
            this.id = id;
            return this;
        }

        public DeficitJPA build() {
            return new DeficitJPA(this);
        }
    }
}