package pwr.newEducation.domain.tableRepresentation;

import java.time.LocalDateTime;

public class SubjectCardVersionTableEntity {
    private long id;
    private long version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isActive;

    private SubjectCardVersionTableEntity() {}

    private SubjectCardVersionTableEntity(Builder builder) {
        id = builder.id;
        version = builder.version;
        createdDate = builder.createdDate;
        updatedDate = builder.updatedDate;
        isActive = builder.isActive;
    }

    public long getId() {
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

    public static SubjectCardVersionTableEntity.Builder builder(SubjectCardVersionTableEntity creditingFormEntity) {
        return new SubjectCardVersionTableEntity.Builder(creditingFormEntity);
    }

    public static SubjectCardVersionTableEntity.Builder builder(long id, long version, LocalDateTime createdDate,
                                                                LocalDateTime updatedDate, boolean isActive) {
        return new SubjectCardVersionTableEntity.Builder(id, version, createdDate, updatedDate, isActive);
    }

    public static class Builder {
        private long id;
        private long version;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
        private boolean isActive;

        Builder () {}

        Builder(SubjectCardVersionTableEntity creditingFormEntity) {
            id = creditingFormEntity.id;
            version = creditingFormEntity.version;
            createdDate = creditingFormEntity.createdDate;
            updatedDate = creditingFormEntity.updatedDate;
            isActive = creditingFormEntity.isActive;
        }

        public Builder(long id, long version, LocalDateTime createdDate, LocalDateTime updatedDate, boolean isActive) {
            this.id = id;
            this.version = version;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
            this.isActive = isActive;
        }

        public SubjectCardVersionTableEntity build() {
            return new SubjectCardVersionTableEntity(this);
        }
    }
}
