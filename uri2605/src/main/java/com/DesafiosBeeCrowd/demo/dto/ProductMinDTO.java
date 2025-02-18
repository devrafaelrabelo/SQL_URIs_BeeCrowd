package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;

public class ProductMinDTO {

    private String name;
    private String providerName;

    public ProductMinDTO() {

    }

    public ProductMinDTO(ProductMinProjection projection) {
        this.name = projection.getName();
        this.providerName = projection.getProviderName();
    }

    public ProductMinDTO(String name, String providerName) {
        this.name = name;
        this.providerName = providerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public String toString() {
        return  name + " | " + providerName;
    }
}
