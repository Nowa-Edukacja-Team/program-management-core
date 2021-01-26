package pwr.newEducation.domain.searchRepresentation;

import java.util.List;

public class ListRepresentationDTO {
    private List<ItemDataDTO> data;
    private int count;

    private ListRepresentationDTO() {}

    private ListRepresentationDTO(Builder builder) {
        data = builder.data;
        count = builder.count;
    }

    public ListRepresentationDTO(List<ItemDataDTO> data) {
        this.data = data;
        this.count = data.size();
    }

    public List<ItemDataDTO> getData() {
        return data;
    }

    public int getCount() {
        return count;
    }

    public static ListRepresentationDTO.Builder builder(ListRepresentationDTO creditingFormDTO) {
        return new ListRepresentationDTO.Builder(creditingFormDTO);
    }

    public static ListRepresentationDTO.Builder builder(List<ItemDataDTO> data, int count) {
        return new ListRepresentationDTO.Builder(data, count);
    }

    public static class Builder {
        private List<ItemDataDTO> data;
        private int count;

        Builder () {}

        Builder(ListRepresentationDTO creditingFormDTO) {
            data = creditingFormDTO.data;
            count = creditingFormDTO.count;
        }

        Builder(List<ItemDataDTO> data, int count) {
            this.data = data;
            this.count = count;
        }

        public ListRepresentationDTO build() {
            return new ListRepresentationDTO(this);
        }
    }
}
