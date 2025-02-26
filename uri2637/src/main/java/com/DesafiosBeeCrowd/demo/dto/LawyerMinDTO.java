package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.LawyerMinProjections;

public class LawyerMinDTO {

    private String name;
    private Integer customersNumber;

    public LawyerMinDTO() {

    }

    public LawyerMinDTO(String name, Integer customersNumber) {
        this.name = name;
        this.customersNumber = customersNumber;
    }

    public LawyerMinDTO(LawyerMinProjections projections) {
        this.name = projections.getName();
        this.customersNumber = projections.getCustomersNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCustomersNumber() {
        return customersNumber;
    }

    public void setCustomersNumber(Integer customersNumber) {
        this.customersNumber = customersNumber;
    }

    @Override
    public String toString() {
        return name + " | " + customersNumber;
    }
}
