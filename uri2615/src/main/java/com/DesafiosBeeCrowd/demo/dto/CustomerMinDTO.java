package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;

public class CustomerMinDTO {

    private String city;

    public CustomerMinDTO() {

    }

    public CustomerMinDTO(String city) {
        this.city = city;
    }

    public  CustomerMinDTO(CustomerMinProjection projection) {
        this.city = projection.getCity();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "city | " + city;
    }
}
