package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.VirusMinProjection;

public class VirusMinDTO {

    private String name;

    public VirusMinDTO() {

    }

    public VirusMinDTO(String name) {
        this.name = name;
    }

    public VirusMinDTO(VirusMinProjection projection) {
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
        return name;
    }
}
