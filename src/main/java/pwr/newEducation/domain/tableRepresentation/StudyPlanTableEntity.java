package pwr.newEducation.domain.tableRepresentation;

import java.time.LocalDateTime;

public class StudyPlanTableEntity {
    private long id;
    private String fieldOfStudy;
    private String faculty;
    private String language;
    private boolean isActive;
    private String mode;
    private String level;
    private String learningCycle;
    private LocalDateTime createDate;
    private LocalDateTime updatedDate;


    private StudyPlanTableEntity() {}

    private StudyPlanTableEntity(Builder builder) {
        id = builder.id;
        fieldOfStudy = builder.fieldOfStudy;
        faculty = builder.faculty;
        language = builder.language;
        isActive = builder.isActive;
        mode = builder.mode;
        level = builder.level;
        learningCycle = builder.learningCycle;
        createDate = builder.createDate;
        updatedDate = builder.updatedDate;
    }

    public long getId() {
        return id;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getMode() {
        return mode;
    }

    public String getLevel() {
        return level;
    }

    public String getLearningCycle() {
        return learningCycle;
    }

    public static StudyPlanTableEntity.Builder builder(StudyPlanTableEntity creditingFormEntity) {
        return new StudyPlanTableEntity.Builder(creditingFormEntity);
    }

    public static StudyPlanTableEntity.Builder builder(long id, String fieldOfStudy, String faculty, String language,
                                                       boolean isActive, String mode, String level, String learningCycle,
                                                       LocalDateTime createDate, LocalDateTime updatedDate) {
        return new StudyPlanTableEntity.Builder(id, fieldOfStudy, faculty, language, isActive, mode, level,
                learningCycle, createDate, updatedDate);
    }

    public static class Builder {
        private long id;
        private String fieldOfStudy;
        private String faculty;
        private String language;
        private boolean isActive;
        private String mode;
        private String level;
        private String learningCycle;
        private LocalDateTime createDate;
        private LocalDateTime updatedDate;

        Builder () {}

        Builder(StudyPlanTableEntity creditingFormEntity) {
            id = creditingFormEntity.id;
            fieldOfStudy = creditingFormEntity.fieldOfStudy;
            faculty = creditingFormEntity.faculty;
            language = creditingFormEntity.language;
            isActive = creditingFormEntity.isActive;
            mode = creditingFormEntity.mode;
            level = creditingFormEntity.level;
            learningCycle = creditingFormEntity.learningCycle;
            createDate = creditingFormEntity.createDate;
            updatedDate = creditingFormEntity.updatedDate;
        }

        public Builder(long id, String fieldOfStudy, String faculty, String language, boolean isActive, String mode,
                       String level, String learningCycle, LocalDateTime createDate, LocalDateTime updatedDate) {
            this.id = id;
            this.fieldOfStudy = fieldOfStudy;
            this.faculty = faculty;
            this.language = language;
            this.isActive = isActive;
            this.mode = mode;
            this.level = level;
            this.learningCycle = learningCycle;
            this.createDate = createDate;
            this.updatedDate = updatedDate;
        }

        public StudyPlanTableEntity build() {
            return new StudyPlanTableEntity(this);
        }
    }
}
