package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.AccountMinProjection;

public class AccountMinDTO {

    private Long id;
    private String password;
    private String md5;

    public AccountMinDTO() {

    }

    public AccountMinDTO(Long id, String password, String md5) {
        this.id = id;
        this.password = password;
        this.md5 = md5;
    }

    public AccountMinDTO(AccountMinProjection projection) {
        this.id = projection.getId();
        this.password = projection.getPassword();
        this.md5 = projection.getMd5();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Override
    public String toString() {
        return id + " | " + password + " | " + md5;
    }
}
