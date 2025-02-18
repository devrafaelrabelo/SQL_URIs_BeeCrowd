package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projection.ProductMinProjection;

public class ProductMinDTO {

    private Long id;
    private String name;

    public ProductMinDTO() {

    }

    public ProductMinDTO(ProductMinProjection projection) {
        this.id = projection.getId();
        this.name = projection.getName();
    }

    public ProductMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return id + " | " + name;
    }
}
