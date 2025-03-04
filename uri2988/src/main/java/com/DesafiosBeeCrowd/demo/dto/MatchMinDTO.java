package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.MatchMinProjection;

public class MatchMinDTO {

    private String name;
    private Long  matches;
    private Long victories;
    private Long defeats;
    private Long draws;
    private Long Score;

    public MatchMinDTO() {

    }

    public MatchMinDTO(String name, Long matches, Long victories, Long defeats, Long draws, Long score) {
        this.name = name;
        this.matches = matches;
        this.victories = victories;
        this.defeats = defeats;
        this.draws = draws;
        Score = score;
    }

    public MatchMinDTO(MatchMinProjection projection) {
        this.name = projection.getName();
        this.matches = projection.getMatches();
        this.victories = projection.getVictories();
        this.defeats = projection.getDefeats();
        this.draws = projection.getDraws();
        Score = projection.getScore();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMatches() {
        return matches;
    }

    public void setMatches(Long matches) {
        this.matches = matches;
    }

    public Long getVictories() {
        return victories;
    }

    public void setVictories(Long victories) {
        this.victories = victories;
    }

    public Long getDefeats() {
        return defeats;
    }

    public void setDefeats(Long defeats) {
        this.defeats = defeats;
    }

    public Long getDraws() {
        return draws;
    }

    public void setDraws(Long draws) {
        this.draws = draws;
    }

    public Long getScore() {
        return Score;
    }

    public void setScore(Long score) {
        Score = score;
    }

    @Override
    public String toString() {
        return name + " | " + matches + " | " + victories + " | " + defeats + " | " + draws + " | " + Score;
    }
}
