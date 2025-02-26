package com.DesafiosBeeCrowd.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "score")
public class Score {

    @Id
    private int id;

    @MapsId("id")
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    private Double math;
    private Double specific;
    private Double project_plan;

    public Score() {

    }

    public Score(Candidate candidate, Double math, Double specific, Double project_plan) {
        this.candidate = candidate;
        this.math = math;
        this.specific = specific;
        this.project_plan = project_plan;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidateId(Candidate candidateId) {
        this.candidate = candidateId;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getSpecific() {
        return specific;
    }

    public void setSpecific(Double specific) {
        this.specific = specific;
    }

    public Double getProject_plan() {
        return project_plan;
    }

    public void setProject_plan(Double project_plan) {
        this.project_plan = project_plan;
    }
}
