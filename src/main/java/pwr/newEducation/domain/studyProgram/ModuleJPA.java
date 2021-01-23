package pwr.newEducation.domain.studyProgram;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ModuleJPA {
    @Id
    @GeneratedValue
    private long idModule;
    private String name;

    @OneToMany
    private Set<BlockJPA> blocks;

    public ModuleJPA() {}

    ModuleJPA(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public long getIdModule() {
        return idModule;
    }

    public Set<BlockJPA> getBlocks() {
        return blocks;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long idModule;
        private String name;
        private Set<BlockJPA> blocks;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdModule(long idModule) {
            this.idModule = idModule;
            return this;
        }

        public Builder withBlocks(Set<BlockJPA> blocks) {
            this.blocks = blocks;
            return this;
        }

        public ModuleJPA build() {
            return new ModuleJPA(this);
        }
    }
}
