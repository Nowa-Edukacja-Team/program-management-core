package pwr.newEducation.domain.tableRepresentation;

import java.time.LocalDateTime;

public class SubjectCardTableDTO {
    private String id;
    private String subjectCode;
    private String name;
    private String supervisor;
    private boolean isActive;
    private LocalDateTime createDate;
    private LocalDateTime updatedDate;


    private SubjectCardTableDTO() {}

    private SubjectCardTableDTO(Builder builder) {
        id = builder.id;
        subjectCode = builder.subjectCode;
        name = builder.name;
        supervisor = builder.supervisor;
        isActive = builder.isActive;
        createDate = builder.createDate;
        updatedDate = builder.updatedDate;
    }

    public String getId() {
        return id;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getName() {
        return name;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public boolean isActive() {
        return isActive;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public static SubjectCardTableDTO.Builder builder(SubjectCardTableDTO creditingFormDTO) {
        return new SubjectCardTableDTO.Builder(creditingFormDTO);
    }

    public static SubjectCardTableDTO.Builder builder(String id, String subjectCode, String name, String supervisor,
                                                      boolean isActive, LocalDateTime createDate,
                                                      LocalDateTime updatedDate) {
        return new SubjectCardTableDTO.Builder(id, subjectCode, name, supervisor, isActive, createDate, updatedDate);
    }

    public static class Builder {
        private String id;
        private String subjectCode;
        private String name;
        private String supervisor;
        private boolean isActive;
        private LocalDateTime createDate;
        private LocalDateTime updatedDate;

        Builder () {}

        Builder(SubjectCardTableDTO creditingFormDTO) {

        }

        public Builder(String id, String subjectCode, String name, String supervisor, boolean isActive,
                       LocalDateTime createDate, LocalDateTime updatedDate) {
            this.id = id;
            this.subjectCode = subjectCode;
            this.name = name;
            this.supervisor = supervisor;
            this.isActive = isActive;
            this.createDate = createDate;
            this.updatedDate = updatedDate;
        }

        public SubjectCardTableDTO build() {
            return new SubjectCardTableDTO(this);
        }
    }
}
