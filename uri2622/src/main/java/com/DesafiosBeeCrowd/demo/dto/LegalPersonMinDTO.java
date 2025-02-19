package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.LegalPersonMinProjection;

public class LegalPersonMinDTO {

    private String customerName;

    public LegalPersonMinDTO() {

    }

    public LegalPersonMinDTO(String customerName) {
        this.customerName = customerName;
    }

    public LegalPersonMinDTO(LegalPersonMinProjection projection) {
        this.customerName = projection.getCustomerName();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "" + customerName;
    }
}
