package pwr.newEducation.domain.studyProgram;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ModuleJPA {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToOne
    private BlockJPA block;

    public ModuleJPA() {}

    ModuleJPA(Builder builder) {
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

    public BlockJPA getBlock() {
        return block;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private long id;
        private String name;
        private BlockJPA block;

        Builder() { }

        Builder(String name) {
            this.name = name;
        }

        public Builder withIdModule(long id) {
            this.id = id;
            return this;
        }

        public Builder withBlock(BlockJPA block) {
            this.block = block;
            return this;
        }

        public ModuleJPA build() {
            return new ModuleJPA(this);
        }
    }
}
