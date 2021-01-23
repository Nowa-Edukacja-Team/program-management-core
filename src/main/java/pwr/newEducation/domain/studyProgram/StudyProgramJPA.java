package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class StudyProgramJPA implements Serializable {
    @Id
    @GeneratedValue
    private long idStudyProgram;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime validFormDate;
    private boolean isCurrent;

    @OneToOne
    private StudyPlanJPA studyPlan;

    @OneToMany
    private Set<ExamRangeJPA> examRange;

    public int getVersion() {
        return version;
    }

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public LocalDateTime getValidFormDate() {
        return validFormDate;
    }

    public long getIdStudyProgram() {
        return idStudyProgram;
    }

    public StudyPlanJPA getStudyPlan() {
        return studyPlan;
    }

    public Set<ExamRangeJPA> getExamRange() {
        return examRange;
    }

    public static Builder builder(long idStudyProgram, int version, LocalDateTime createdDate,
                                  LocalDateTime validFormDate, boolean isCurrent) {
        return new Builder(idStudyProgram, version, createdDate, validFormDate, isCurrent);
    }

    public StudyProgramJPA(){ }

    StudyProgramJPA(Builder builder) {
        idStudyProgram = builder.idStudyProgram;;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        validFormDate = builder.validFormDate;
        isCurrent = builder.isCurrent;
        studyPlan = builder.studyPlan;
        examRange = builder.examRange;
    }

    public static class Builder {
        private long idStudyProgram;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFormDate;
        private boolean isCurrent;
        private StudyPlanJPA studyPlan;
        private Set<ExamRangeJPA> examRange;

        Builder() {}

        Builder(long idStudyProgram, int version, LocalDateTime createdDate, LocalDateTime validFormDate,
                boolean isCurrent) {
            this.idStudyProgram = idStudyProgram;
            this.version = version;
            this.createdDate = createdDate;
            this.validFormDate = validFormDate;
            this.isCurrent = isCurrent;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyPlan(StudyPlanJPA studyPlan) {
            this.studyPlan = studyPlan;
            return this;
        }

        public Builder withExamRange(Set<ExamRangeJPA> examRange) {
            this.examRange = examRange;
            return this;
        }

        public StudyProgramJPA build() {
            return new StudyProgramJPA(this);
        }
    }
}
