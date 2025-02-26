package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.LoanMinProjection;

public class LoanMinDTO {

    private String name;
    private Integer day;


    public LoanMinDTO() {

    }

    public LoanMinDTO(String name, Integer day) {
        this.name = name;
        this.day = day;
    }

    public LoanMinDTO(LoanMinProjection projection) {
        this.name = projection.getName();
        this.day = projection.getDay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return name + " | " + day;
    }
}
