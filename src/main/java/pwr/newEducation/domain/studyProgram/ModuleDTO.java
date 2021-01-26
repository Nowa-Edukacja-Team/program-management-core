package pwr.newEducation.domain.studyProgram;

import javax.persistence.OneToMany;

public class ModuleDTO {
    private long id;
    private String name;

    @OneToMany
    private BlockDTO block;

    public ModuleDTO() {}

    ModuleDTO(Builder builder) {
        this.name = builder.name;
        this.block = builder.block;
        this.id = builder.id;
    }

    public String getName() {
        return name;
    }

    public long getIdModule() {
        return id;
    }

    public BlockDTO getBlock() {
        return block;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long id;
        private String name;
        private BlockDTO block;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdModule(long id) {
            this.id = id;
            return this;
        }

        public Builder withBlock(BlockDTO block) {
            this.block = block;
            return this;
        }

        public ModuleDTO build() {
            return new ModuleDTO(this);
        }
    }
}
