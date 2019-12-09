package com.leandro.app.controller.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanDTO {

    private Long id;
    private Integer total;
    private Long userId;

    public LoanDTO() {
    }

    public LoanDTO(Long id, Integer total, Long userId) {
        this.id = id;
        this.total = total;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
