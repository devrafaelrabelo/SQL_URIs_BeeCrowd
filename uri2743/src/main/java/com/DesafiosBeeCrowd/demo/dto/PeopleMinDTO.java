package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.PeopleMinProjection;

public class PeopleMinDTO {

    private String name;
    private Integer length;

    public PeopleMinDTO() {

    }

    public PeopleMinDTO(String name, Integer length) {
        this.name = name;
        this.length = length;
    }

    public PeopleMinDTO(PeopleMinProjection projection) {
        this.name = projection.getName();
        this.length = projection.getLength();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return name + " | " + length;
    }
}
