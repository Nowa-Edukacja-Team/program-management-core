package pwr.newEducation.domain.studyProgram;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class StudyProgramToModuleJPA implements Serializable {
    @Id
    @ManyToOne
    private ModuleJPA module;

    @Id
    @ManyToOne
    private StudyProgramJPA studyProgram;

    private int limitECTS;

    public ModuleJPA getModule() {
        return module;
    }

    public int getLimitECTS() {
        return limitECTS;
    }

    public StudyProgramJPA getStudyProgram() {
        return studyProgram;
    }

    public static Builder builder(ModuleJPA module, StudyProgramJPA studyProgram, int limitECTS) {
        return new Builder(module, studyProgram, limitECTS);
    }

    public StudyProgramToModuleJPA() {}

    public StudyProgramToModuleJPA(Builder builder) {
        this.module = builder.module;
        this.studyProgram = builder.studyProgram;
        this.limitECTS = builder.limitECTS;
    }

    public static class Builder {
        private ModuleJPA module;
        private StudyProgramJPA studyProgram;
        private int limitECTS;

        Builder() {}

        Builder(ModuleJPA module, StudyProgramJPA studyProgram, int limitECTS) {
            this.module = module;
            this.studyProgram = studyProgram;
            this.limitECTS = limitECTS;
        }

        public StudyProgramToModuleJPA build() {
            return new StudyProgramToModuleJPA(this);
        }
    }
}
