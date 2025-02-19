package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;

public class CustomerMinDTO {
    private Long count;

    public CustomerMinDTO() {

    }

    public CustomerMinDTO(Long count) {
        this.count = count;
    }

    public CustomerMinDTO(CustomerMinProjection projection) {
        this.count = projection.getCount();
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "count | " + count;
    }
}
