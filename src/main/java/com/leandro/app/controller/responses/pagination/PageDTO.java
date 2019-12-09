package com.leandro.app.controller.responses.pagination;

import java.util.List;

public class PageDTO<T> {

    private List<T> items;
    private PagingDTO paging;

    public PageDTO() {
    }

    public PageDTO(List<T> items, PagingDTO paging) {
        this.items = items;
        this.paging = paging;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public PagingDTO getPaging() {
        return paging;
    }

    public void setPaging(PagingDTO paging) {
        this.paging = paging;
    }
}
