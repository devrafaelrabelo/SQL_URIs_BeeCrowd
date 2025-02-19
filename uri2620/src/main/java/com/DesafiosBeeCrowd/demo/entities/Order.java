package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long id;
    private Date ordersDate;

    @ManyToOne
    @JoinColumn(name = "id_customers")
    private Customer customer;

    public Order() {

    }

    public Order(Long id, Date ordersDate, Customer customer) {
        this.id = id;
        this.ordersDate = ordersDate;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(Date ordersDate) {
        this.ordersDate = ordersDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
