package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;

public class CustomerMinDTO {

    private Long id;
    private String name;

    public CustomerMinDTO() {

    }

    public CustomerMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerMinDTO(CustomerMinProjection projection) {
        this.id = projection.getId();
        this.name = projection.getName();
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
