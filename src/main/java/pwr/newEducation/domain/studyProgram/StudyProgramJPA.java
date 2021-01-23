package pwr.newEducation.domain.studyProgram;

import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class StudyProgramJPA {
    @Id
    @GeneratedValue
    private long idStudyProgram;
    @Id
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime validFormDate;
    private boolean isCurrent;

    @Transient
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_study_plan", referencedColumnName = "id_study_plan"),
            @JoinColumn(name = "version", referencedColumnName = "version")
    })
    private StudyPlanJPA studyPlanJPA;

    @OneToMany
    private Set<ExamRangeJPA> examRangeJPAS;

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

    public StudyPlanJPA getStudyPlanJPA() {
        return studyPlanJPA;
    }

    public Set<ExamRangeJPA> getExamRangeJPAS() {
        return examRangeJPAS;
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
        studyPlanJPA = builder.studyPlanJPA;
        examRangeJPAS = builder.examRangeJPAS;
    }

    public static class Builder {
        private long idStudyProgram;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime validFormDate;
        private boolean isCurrent;
        private StudyPlanJPA studyPlanJPA;
        private Set<ExamRangeJPA> examRangeJPAS;

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

        public Builder withStudyPlanJPA(StudyPlanJPA studyPlanJPA) {
            this.studyPlanJPA = studyPlanJPA;
            return this;
        }

        public Builder withExamRangeJPAS(Set<ExamRangeJPA> examRangeJPAS) {
            this.examRangeJPAS = examRangeJPAS;
            return this;
        }

        public StudyProgramJPA build() {
            return new StudyProgramJPA(this);
        }
    }
}
