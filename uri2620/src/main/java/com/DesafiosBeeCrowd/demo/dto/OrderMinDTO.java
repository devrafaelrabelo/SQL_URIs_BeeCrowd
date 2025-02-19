package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.OrderMinProjection;

public class OrderMinDTO {

    private String customerName;
    private Long id;

    public OrderMinDTO() {

    }

    public OrderMinDTO(String customerName, Long id) {
        this.customerName = customerName;
        this.id = id;
    }

    public OrderMinDTO(OrderMinProjection projection) {
        this.customerName = projection.getCustomerName();
        this.id = projection.getId();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return customerName + " | " + id;
    }
}
