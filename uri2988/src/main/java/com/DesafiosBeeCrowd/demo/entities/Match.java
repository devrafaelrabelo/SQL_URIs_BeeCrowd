package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team_1")
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team_2")
    private Team team2;

    private Integer team1Goals;
    private Integer team2Goals;

    public Match() {

    }

    public Match(Long id, Team team1, Team team2, Integer team1Goals, Integer team2Goals) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.team1Goals = team1Goals;
        this.team2Goals = team2Goals;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Integer getTeam1Goals() {
        return team1Goals;
    }

    public void setTeam1Goals(Integer team1Goals) {
        this.team1Goals = team1Goals;
    }

    public Integer getTeam2Goals() {
        return team2Goals;
    }

    public void setTeam2Goals(Integer team2Goals) {
        this.team2Goals = team2Goals;
    }
}
