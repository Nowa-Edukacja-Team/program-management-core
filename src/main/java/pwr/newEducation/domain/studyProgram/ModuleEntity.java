package pwr.newEducation.domain.studyProgram;

import javax.persistence.OneToMany;
import java.util.Set;

public class ModuleEntity {
    private long idModule;
    private String name;

    @OneToMany
    private Set<BlockEntity> blocks;

    public ModuleEntity() {}

    ModuleEntity(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdModule() {
        return idModule;
    }

    public Set<BlockEntity> getBlocks() {
        return blocks;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long idModule;
        private String name;
        private Set<BlockEntity> blocks;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdModule(long idModule) {
            this.idModule = idModule;
            return this;
        }

        public Builder withBlocks(Set<BlockEntity> blocks) {
            this.blocks = blocks;
            return this;
        }

        public ModuleEntity build() {
            return new ModuleEntity(this);
        }
    }
}
