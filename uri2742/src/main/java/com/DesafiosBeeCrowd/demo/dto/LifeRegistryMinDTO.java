package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.LifeRegistryMinProjection;

public class LifeRegistryMinDTO {

    private String name;
    private Double fatorN;

    public LifeRegistryMinDTO() {

    }

    public LifeRegistryMinDTO(String name, Double fatorN) {
        this.name = name;
        this.fatorN = fatorN;
    }

    public LifeRegistryMinDTO(LifeRegistryMinProjection projection) {
        this.name = projection.getName();
        this.fatorN = projection.getFatorN();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFatorN() {
        return fatorN;
    }

    public void setFatorN(Double fatorN) {
        this.fatorN = fatorN;
    }

    @Override
    public String toString() {
        return name + " | " + fatorN;
    }
}
