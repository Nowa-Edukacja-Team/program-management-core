package pwr.newEducation.domain.studyProgram;


public class StudyProgramToModuleEntity {
    private ModuleEntity module;
    private int limitECTS;

    public ModuleEntity getModule() {
        return module;
    }

    public int getLimitECTS() {
        return limitECTS;
    }

    public static Builder builder(ModuleEntity module, int limitECTS) {
        return new Builder(module, limitECTS);
    }

    public StudyProgramToModuleEntity() {}

    public StudyProgramToModuleEntity(Builder builder) {
        this.module = builder.module;
        this.limitECTS = builder.limitECTS;
    }

    public static class Builder {
        private ModuleEntity module;
        private int limitECTS;

        Builder() {}

        Builder(ModuleEntity module, int limitECTS) {
            this.module = module;
            this.limitECTS = limitECTS;
        }

        public StudyProgramToModuleEntity build() {
            return new StudyProgramToModuleEntity(this);
        }
    }
}
