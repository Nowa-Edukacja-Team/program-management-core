package pwr.newEducation.domain.pagination;

import pwr.newEducation.domain.learningEffect.KnowledgeVerificationFormDTO;

import java.io.Serializable;
import java.util.List;

public class PaginationDTO<T> implements Serializable {
    private int page;
    private int pageCount;
    private int count;
    private List<T> data;

    public PaginationDTO(Builder builder) {
        page = builder.page;
        pageCount = builder.pageCount;
        count = builder.count;
        data = builder.data;
    }

    public PaginationDTO(int page, int pageCount, int count, List<T> data) {
        this.page = page;
        this.pageCount = pageCount;
        this.count = count;
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getCount() {
        return count;
    }

    public List<T> getData() {
        return data;
    }

    public PaginationDTO() {
    }

    public static Builder builder(PaginationDTO paginationDTO) {
        return new Builder(paginationDTO);
    }

    public Builder builder(int page, int pageCount, int count, List<T> data) {
        return new Builder(page, pageCount, count, data);
    }

    public static class Builder<T> {
        private int page;
        private int pageCount;
        private int count;
        private List<T> data;

        Builder () {}

        Builder(PaginationDTO paginationDTO) {
            page = paginationDTO.page;
            pageCount = paginationDTO.pageCount;
            count = paginationDTO.count;
            data = paginationDTO.data;
        }

        Builder(int page, int pageCount, int count, List<T> data) {
            this.page = page;
            this.pageCount = pageCount;
            this.count = count;
            this.data = data;
        }

        public PaginationDTO build() {
            return new PaginationDTO(this);
        }
    }
}
