package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    private Long id;
    private Date locationsDate;

    @ManyToOne
    @JoinColumn(name = "id_customers")
    private Customer customer;

    public Location() {

    }

    public Location(Long id, Date locationsDate, Customer customer) {
        this.id = id;
        this.locationsDate = locationsDate;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLocationsDate() {
        return locationsDate;
    }

    public void setLocationsDate(Date locationsDate) {
        this.locationsDate = locationsDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
