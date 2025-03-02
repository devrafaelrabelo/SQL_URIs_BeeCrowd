package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lawyers")
public class Lawyer {

    @Id
    private Integer register;
    private String name;
    private Integer customersNumber;

    public Lawyer() {

    }

    public Lawyer(Integer register, String name, Integer customersNumber) {
        this.register = register;
        this.name = name;
        this.customersNumber = customersNumber;
    }

    public Integer getRegister() {
        return register;
    }

    public void setRegister(Integer register) {
        this.register = register;
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
}
