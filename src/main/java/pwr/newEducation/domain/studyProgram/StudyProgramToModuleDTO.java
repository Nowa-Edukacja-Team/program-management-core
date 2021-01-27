package pwr.newEducation.domain.studyProgram;

public class StudyProgramToModuleDTO {
    private ModuleDTO module;
    private int limitECTS;

    public ModuleDTO getModule() {
        return module;
    }

    public int getLimitECTS() {
        return limitECTS;
    }

    public static Builder builder(ModuleDTO module, int limitECTS) {
        return new Builder(module, limitECTS);
    }

    public StudyProgramToModuleDTO() {}

    public StudyProgramToModuleDTO(Builder builder) {
        this.module = builder.module;
        this.limitECTS = builder.limitECTS;
    }

    public static class Builder {
        private ModuleDTO module;
        private int limitECTS;

        Builder() {}

        Builder(ModuleDTO module, int limitECTS) {
            this.module = module;
            this.limitECTS = limitECTS;
        }

        public StudyProgramToModuleDTO build() {
            return new StudyProgramToModuleDTO(this);
        }
    }
}
