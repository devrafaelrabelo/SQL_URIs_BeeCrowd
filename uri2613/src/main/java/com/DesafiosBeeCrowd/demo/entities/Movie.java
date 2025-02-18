package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_prices")
    private Price price;

    public Movie() {

    }

    public Movie(Long id, String name, Price price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
