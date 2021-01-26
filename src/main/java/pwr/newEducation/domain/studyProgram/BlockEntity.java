package pwr.newEducation.domain.studyProgram;

public class BlockEntity {
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdBlock() {
        return id;
    }

    public BlockEntity() {}

    BlockEntity(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long id;
        private String name;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdBlock(long id) {
            this.id = id;
            return this;
        }

        public BlockEntity build() {
            return new BlockEntity(this);
        }
    }
}
