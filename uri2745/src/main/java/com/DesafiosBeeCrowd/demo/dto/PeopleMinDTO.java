package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.PeopleMinProjection;

public class PeopleMinDTO {

    private String name;
    private Double tax;

    public PeopleMinDTO() {

    }

    public PeopleMinDTO(String name, Double tax) {
        this.name = name;
        this.tax = tax;
    }

    public PeopleMinDTO(PeopleMinProjection projection) {
        this.name = projection.getName();
        this.tax = projection.getTax();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return name + " | " + tax;
    }
}
