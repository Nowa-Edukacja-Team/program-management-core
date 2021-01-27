package pwr.newEducation.domain.searchRepresentation;

public class ItemDataDTO {
    private String id;
    private String name;

    private ItemDataDTO() {}

    private ItemDataDTO(Builder builder) {
        id = builder.id;
        name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static ItemDataDTO.Builder builder(ItemDataDTO creditingFormDTO) {
        return new ItemDataDTO.Builder(creditingFormDTO);
    }

    public static ItemDataDTO.Builder builder(String id, String name) {
        return new ItemDataDTO.Builder(id, name);
    }

    public static class Builder {
        private String id;
        private String name;

        Builder () {}

        Builder(ItemDataDTO creditingFormDTO) {
            id = creditingFormDTO.id;
            name = creditingFormDTO.name;
        }

        Builder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public ItemDataDTO build() {
            return new ItemDataDTO(this);
        }
    }
}
