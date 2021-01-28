package pwr.newEducation.domain.pagination;

import java.util.List;

public class PaginationEntity<T> {
    private int page;
    private int pageCount;
    private int count;
    private List<T> data;

    public PaginationEntity(int page, int pageCount, int count, List<T> data) {
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
}
