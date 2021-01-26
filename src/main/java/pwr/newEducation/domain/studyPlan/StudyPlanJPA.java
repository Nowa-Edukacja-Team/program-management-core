package pwr.newEducation.domain.studyPlan;

import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class StudyPlanJPA implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime valid;
    private boolean isCurrent;

    @OneToMany
    private Set<DeficitJPA> deficits;

    @OneToOne
    private StudyProgramJPA studyProgram;

    public long getIdStudyPlan() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public LocalDateTime getValid() {
        return valid;
    }

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public Set<DeficitJPA> getDeficits() {
        return deficits;
    }

    public StudyProgramJPA getStudyProgram() {
        return studyProgram;
    }

    public StudyPlanJPA() {}

    StudyPlanJPA(Builder builder) {
        id = builder.id;;
        version = builder.version;;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        valid = builder.valid;
        isCurrent = builder.isCurrent;
        studyProgram = builder.studyProgram;
        deficits = builder.deficits;
    }

    public static Builder builder(LocalDateTime createdDate, LocalDateTime valid, boolean isCurrent) {
        return new Builder(createdDate, valid, isCurrent);
    }

    public static class Builder {
        private long id;
        private int version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private LocalDateTime valid;
        private boolean isCurrent;
        private StudyProgramJPA studyProgram;
        private Set<DeficitJPA> deficits;

        Builder() {}

        Builder(LocalDateTime createdDate, LocalDateTime valid, boolean isCurrent) {
            this.createdDate = createdDate;
            this.valid = valid;
            this.isCurrent = isCurrent;
        }

        public Builder withIdStudyPlan(long id) {
            this.id = id;
            return this;
        }

        public Builder withVersion(int version) {
            this.version = version;
            return this;
        }

        public Builder withUpdatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Builder withStudyProgram(StudyProgramJPA studyProgram) {
            this.studyProgram = studyProgram;
            return this;
        }

        public Builder withDeficits(Set<DeficitJPA> deficits) {
            this.deficits = deficits;
            return this;
        }

        public StudyPlanJPA build() {
            return new StudyPlanJPA(this);
        }
    }
}
