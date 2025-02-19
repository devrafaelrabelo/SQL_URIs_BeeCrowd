package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "natural_person")
public class NaturalPerson {


    @ManyToOne
    @JoinColumn(name = "id_customers")
    private Customer customer;

    @Id
    private String cpf;

    public NaturalPerson() {

    }

    public NaturalPerson(Customer customer, String cpf) {
        this.customer = customer;
        this.cpf = cpf;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
