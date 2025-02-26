package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ScoreMinProjections;

public class ScoreMinDTO {

    private String name;
    private Double avg;

    public ScoreMinDTO() {

    }

    public ScoreMinDTO(String name, Double avg) {
        this.name = name;
        this.avg = avg;
    }

    public ScoreMinDTO(ScoreMinProjections projections) {
        this.name = projections.getName();
        this.avg = projections.getAVG();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return name + " | " + avg;
    }
}
