package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "life_registry")
public class LifeRegistry {

    @Id
    private Long id;
    private String name;
    private Double omega;

    @ManyToOne
    @JoinColumn(name = "dimensions_id")
    private Dimension dimension;

    public LifeRegistry() {

    }

    public LifeRegistry(Long id, String name, Double omega, Dimension dimension) {
        this.id = id;
        this.name = name;
        this.omega = omega;
        this.dimension = dimension;
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

    public Double getOmega() {
        return omega;
    }

    public void setOmega(Double omega) {
        this.omega = omega;
    }

    public Dimension getDimensionsId() {
        return dimension;
    }

    public void setDimensionsId(Dimension dimension) {
        this.dimension = dimension;
    }
}
