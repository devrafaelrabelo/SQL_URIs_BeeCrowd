package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProviderMinProjection;

public class ProviderMinDTO {

    private String city;

    public ProviderMinDTO() {

    }

    public ProviderMinDTO(String city) {
        this.city = city;
    }

    public ProviderMinDTO(ProviderMinProjection projection) {
        this.city = projection.getCity();
    }

    public String getName() {
        return city;
    }

    public void setName(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  city;
    }
}
