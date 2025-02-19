package com.DesafiosBeeCrowd.demo.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "legal_person")
public class LegalPerson {


    @ManyToOne
    @JoinColumn(name = "id_customers")
    private Customer customer;

    @Id
    private String cnpj;
    private String contact;

    public LegalPerson() {

    }

    public LegalPerson(Customer customer, String cnpj, String contact) {
        this.customer = customer;
        this.cnpj = cnpj;
        this.contact = contact;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
