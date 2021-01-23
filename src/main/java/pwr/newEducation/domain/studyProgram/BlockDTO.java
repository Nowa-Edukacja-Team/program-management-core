package pwr.newEducation.domain.studyProgram;

public class BlockDTO {
    private long idBlock;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdBlock() {
        return idBlock;
    }

    public BlockDTO() {}

    BlockDTO(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long idBlock;
        private String name;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdBlock(long idBlock) {
            this.idBlock = idBlock;
            return this;
        }

        public BlockDTO build() {
            return new BlockDTO(this);
        }
    }
}
