package pwr.newEducation.domain.studyProgram;

import javax.persistence.OneToMany;
import java.util.Set;

public class ModuleEntity {
    private long id;
    private String name;

    @OneToMany
    private Set<BlockEntity> blocks;

    public ModuleEntity() {}

    ModuleEntity(Builder builder) {
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

    public Set<BlockEntity> getBlocks() {
        return blocks;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long id;
        private String name;
        private Set<BlockEntity> blocks;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdModule(long id) {
            this.id = id;
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
