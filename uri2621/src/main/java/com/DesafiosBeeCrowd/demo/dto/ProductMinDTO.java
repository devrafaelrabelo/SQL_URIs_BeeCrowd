package com.DesafiosBeeCrowd.demo.dto;


import com.DesafiosBeeCrowd.demo.projection.ProductMinProjection;

public class ProductMinDTO {
    private String name;

    public ProductMinDTO() {

    }

    public ProductMinDTO(String name) {
        this.name = name;
    }

    public ProductMinDTO(ProductMinProjection projection) {
        this.name = projection.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return" " + name;
    }
}
