package pwr.newEducation.domain.studyProgram;

import javax.persistence.OneToMany;
import java.util.Set;

public class ModuleDTO {
    private long idModule;
    private String name;

    @OneToMany
    private Set<BlockDTO> blocks;

    public ModuleDTO() {}

    ModuleDTO(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdModule() {
        return idModule;
    }

    public Set<BlockDTO> getBlocks() {
        return blocks;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long idModule;
        private String name;
        private Set<BlockDTO> blocks;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdModule(long idModule) {
            this.idModule = idModule;
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
