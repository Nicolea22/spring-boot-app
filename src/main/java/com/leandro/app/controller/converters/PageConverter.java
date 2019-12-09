package com.leandro.app.controller.converters;

import com.leandro.app.controller.responses.pagination.PagingDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class PageConverter {

    public PagingDTO convertToPagingDTO(Page page) {
        return new PagingDTO(page.getNumber(), page.getSize(), page.getTotalElements());
    }

}
