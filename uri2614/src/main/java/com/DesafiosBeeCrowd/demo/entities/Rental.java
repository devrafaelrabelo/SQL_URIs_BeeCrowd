package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rentals")
public class Rental {

    @Id
    private Long id;
    private Date rentals_date;

    @ManyToOne
    @JoinColumn(name = "id_customers")
    private Customer customer;

    public Rental() {

    }

    public Rental(Long id, Date rentals_date, Customer customer) {
        this.id = id;
        this.rentals_date = rentals_date;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRentals_date() {
        return rentals_date;
    }

    public void setRentals_date(Date rentals_date) {
        this.rentals_date = rentals_date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
