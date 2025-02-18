package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.RentalMinProjection;

import java.util.Date;

public class RentalMinDTO {

    private String name;
    private Date rentalsDate;

    public RentalMinDTO() {

    }

    public RentalMinDTO(String name, Date rentalsDate) {
        this.name = name;
        this.rentalsDate = rentalsDate;
    }

    public RentalMinDTO(RentalMinProjection projection) {
        this.name = projection.getName();
        this.rentalsDate = projection.getRentalsDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRentalsDate() {
        return rentalsDate;
    }

    public void setRentalsDate(Date rentalsDate) {
        this.rentalsDate = rentalsDate;
    }

    @Override
    public String toString() {
        return name + " | " + rentalsDate;
    }
}
