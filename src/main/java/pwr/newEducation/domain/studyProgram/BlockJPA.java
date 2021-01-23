package pwr.newEducation.domain.studyProgram;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BlockJPA {
    @Id
    @GeneratedValue
    private long idBlock;
    private String name;

    public String getName() {
        return name;
    }

    public long getIdBlock() {
        return idBlock;
    }

    public BlockJPA() {}

    BlockJPA(Builder builder) {
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

        public BlockJPA build() {
            return new BlockJPA(this);
        }
    }
}
