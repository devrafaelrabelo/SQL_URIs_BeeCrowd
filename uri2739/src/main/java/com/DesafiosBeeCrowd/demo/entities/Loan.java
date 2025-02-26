package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "loan")
public class Loan {

    @Id
    private Long id;
    private String name;
    private Double value;
    private Date payday;

    public Loan() {

    }

    public Loan(Long id, String name, Double value, Date payday) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.payday = payday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getPayday() {
        return payday;
    }

    public void setPayday(Date payday) {
        this.payday = payday;
    }
}
