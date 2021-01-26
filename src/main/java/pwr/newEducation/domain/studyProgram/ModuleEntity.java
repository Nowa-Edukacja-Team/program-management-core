package pwr.newEducation.domain.studyProgram;

import javax.persistence.OneToMany;
import java.util.Set;

public class ModuleEntity {
    private long id;
    private String name;

    private BlockEntity block;

    public ModuleEntity() {}

    ModuleEntity(Builder builder) {
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

    public BlockEntity getBlock() {
        return block;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long id;
        private String name;
        private BlockEntity block;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdModule(long id) {
            this.id = id;
            return this;
        }

        public Builder withBlock(BlockEntity block) {
            this.block = block;
            return this;
        }

        public ModuleEntity build() {
            return new ModuleEntity(this);
        }
    }
}
