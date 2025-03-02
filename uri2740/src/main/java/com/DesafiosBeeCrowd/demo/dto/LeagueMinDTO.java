package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.LeagueMinProjection;

public class LeagueMinDTO {

    private String name;

    public LeagueMinDTO() {

    }

    public LeagueMinDTO(String name) {
        this.name = name;
    }

    public LeagueMinDTO(LeagueMinProjection projection) {
        this.name = projection.getName();
    }


    public String getTeam() {
        return name;
    }

    public void setTeam(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
