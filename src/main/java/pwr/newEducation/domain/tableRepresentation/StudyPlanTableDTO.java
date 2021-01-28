package pwr.newEducation.domain.tableRepresentation;

import java.time.LocalDateTime;

public class StudyPlanTableDTO {
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


    private StudyPlanTableDTO() {}

    private StudyPlanTableDTO(Builder builder) {
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

    public static StudyPlanTableDTO.Builder builder(StudyPlanTableDTO creditingFormDTO) {
        return new StudyPlanTableDTO.Builder(creditingFormDTO);
    }

    public static StudyPlanTableDTO.Builder builder(long id, String fieldOfStudy, String faculty, String language,
                                                    boolean isActive, String mode, String level, String learningCycle,
                                                    LocalDateTime createDate, LocalDateTime updatedDate) {
        return new StudyPlanTableDTO.Builder(id, fieldOfStudy, faculty, language, isActive, mode, level,
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

        Builder(StudyPlanTableDTO creditingFormDTO) {
            id = creditingFormDTO.id;
            fieldOfStudy = creditingFormDTO.fieldOfStudy;
            faculty = creditingFormDTO.faculty;
            language = creditingFormDTO.language;
            isActive = creditingFormDTO.isActive;
            mode = creditingFormDTO.mode;
            level = creditingFormDTO.level;
            learningCycle = creditingFormDTO.learningCycle;
            createDate = creditingFormDTO.createDate;
            updatedDate = creditingFormDTO.updatedDate;
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

        public StudyPlanTableDTO build() {
            return new StudyPlanTableDTO(this);
        }
    }
}
