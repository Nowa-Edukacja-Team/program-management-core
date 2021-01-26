package pwr.newEducation.domain.studyProgram;

import javax.persistence.OneToMany;
import java.util.Set;

public class ModuleDTO {
    private long id;
    private String name;

    @OneToMany
    private Set<BlockDTO> blocks;

    public ModuleDTO() {}

    ModuleDTO(Builder builder) {
        this.name = builder.name;
        this.blocks = builder.blocks;
        this.id = builder.id;
    }

    public String getName() {
        return name;
    }

    public long getIdModule() {
        return id;
    }

    public Set<BlockDTO> getBlocks() {
        return blocks;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long id;
        private String name;
        private Set<BlockDTO> blocks;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdModule(long id) {
            this.id = id;
            return this;
        }

        public Builder withBlocks(Set<BlockDTO> blocks) {
            this.blocks = blocks;
            return this;
        }

        public ModuleDTO build() {
            return new ModuleDTO(this);
        }
    }
}
