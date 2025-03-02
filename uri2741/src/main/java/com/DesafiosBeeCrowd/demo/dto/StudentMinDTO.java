package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.StudentMinProjection;

public class StudentMinDTO {

    private String name;
    private Double grade;

    public StudentMinDTO() {

    }

    public StudentMinDTO(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public StudentMinDTO(StudentMinProjection projection) {
        this.name = projection.getName();
        this.grade = projection.getGrade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " | " + grade;
    }
}
