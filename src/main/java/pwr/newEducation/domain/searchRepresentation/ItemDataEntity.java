package pwr.newEducation.domain.searchRepresentation;

public class ItemDataEntity {
    private String id;
    private String name;

    private ItemDataEntity() {}

    private ItemDataEntity(Builder builder) {
        id = builder.id;
        name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static ItemDataEntity.Builder builder(ItemDataEntity creditingFormEntity) {
        return new ItemDataEntity.Builder(creditingFormEntity);
    }

    public static ItemDataEntity.Builder builder(String id, String name) {
        return new ItemDataEntity.Builder(id, name);
    }

    public static class Builder {
        private String id;
        private String name;

        Builder () {}

        Builder(ItemDataEntity creditingFormEntity) {
            id = creditingFormEntity.id;
            name = creditingFormEntity.name;
        }

        Builder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public ItemDataEntity build() {
            return new ItemDataEntity(this);
        }
    }
}
