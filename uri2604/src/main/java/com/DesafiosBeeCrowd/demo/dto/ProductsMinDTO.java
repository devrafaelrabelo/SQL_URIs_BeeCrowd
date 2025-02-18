package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProductsMinProjection;

public class ProductsMinDTO {

    Long id;
    String name;

    public ProductsMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductsMinDTO(ProductsMinProjection projection) {
        this.id = projection.getId();
        this.name = projection.getName();
    }

    @Override
    public String toString() {
        return id + " | " + name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
