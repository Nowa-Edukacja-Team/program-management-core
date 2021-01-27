package pwr.newEducation.domain.tableRepresentation;

import java.time.LocalDateTime;

public class SubjectCardVersionTableDTO {
    private String id;
    private long version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isActive;

    private SubjectCardVersionTableDTO() {}

    private SubjectCardVersionTableDTO(Builder builder) {
        id = builder.id;
        version = builder.version;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        isActive = builder.isActive;
    }

    public String getId() {
        return id;
    }

    public long getVersion() {
        return version;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public static SubjectCardVersionTableDTO.Builder builder(SubjectCardVersionTableDTO creditingFormDTO) {
        return new SubjectCardVersionTableDTO.Builder(creditingFormDTO);
    }

    public static SubjectCardVersionTableDTO.Builder builder(String id, long version, LocalDateTime createdDate,
                                                             LocalDateTime updatedDate, boolean isActive) {
        return new SubjectCardVersionTableDTO.Builder(id, version, createdDate, updatedDate, isActive);
    }

    public static class Builder {
        private String id;
        private long version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private boolean isActive;

        Builder () {}

        Builder(SubjectCardVersionTableDTO creditingFormDTO) {
            id = creditingFormDTO.id;
            version = creditingFormDTO.version;
            createdDate = creditingFormDTO.createdDate;
            updatedDate = creditingFormDTO.updatedDate;
            isActive = creditingFormDTO.isActive;
        }

        public Builder(String id, long version, LocalDateTime createdDate, LocalDateTime updatedDate, boolean isActive) {
            this.id = id;
            this.version = version;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
            this.isActive = isActive;
        }

        public SubjectCardVersionTableDTO build() {
            return new SubjectCardVersionTableDTO(this);
        }
    }
}
