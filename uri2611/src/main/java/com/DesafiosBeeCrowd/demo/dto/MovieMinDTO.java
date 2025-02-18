package com.DesafiosBeeCrowd.demo.dto;


import com.DesafiosBeeCrowd.demo.projection.MovieMinProjection;

public class MovieMinDTO {

    Long id;
    String name;

    public MovieMinDTO() {

    }

    public MovieMinDTO(MovieMinProjection projection) {
        this.name = projection.getName();
        this.id = projection.getId();
    }

    public MovieMinDTO(Long id, String name) {
        this.name = name;
        this.id = id;
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

    @Override
    public String toString() {
        return id + " | " + name;
    }
}
