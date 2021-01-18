package pwr.newEducation.domain.studyPlan;

public class DeficitEntity {
    private int semester;
    private int limit;

    DeficitEntity(Builder builder) {
        semester = builder.semester;
        limit = builder.limit;
    }

    public static class Builder {
        private int semester;
        private int limit;

        Builder(DeficitEntity deficitEntity) {
            semester = deficitEntity.semester;
            limit = deficitEntity.limit;
        }

        public Builder withSemester(int semester) {
            this.semester = semester;
            return this;
        }

        public Builder withLimit(int limit) {
            this.limit = limit;
            return this;
        }
    }
}
