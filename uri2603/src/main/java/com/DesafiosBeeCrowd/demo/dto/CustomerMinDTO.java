package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;

public class CustomerMinDTO {

    String name;
    String street;

    public CustomerMinDTO() {

    }

    public CustomerMinDTO(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public CustomerMinDTO(CustomerMinProjection projection) {
        this.name = projection.getName();
        this.street = projection.getStreet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "CustomerMinDTO{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
