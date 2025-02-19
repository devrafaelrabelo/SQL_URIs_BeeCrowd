package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.Projections.NaturalPersonMinProjection;

public class NaturalPersonMinDTO {

    private String cpf;

    public NaturalPersonMinDTO() {

    }

    public NaturalPersonMinDTO(String cpf) {
        this.cpf = cpf;
    }

    public NaturalPersonMinDTO(NaturalPersonMinProjection projection) {
        this.cpf = projection.getCPF();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "" + cpf;
    }
}
