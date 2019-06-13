package com.chinajey.admin.dao.entity;

public class Cgyfpb {
    private String code;

    private String uSsgcu;

    private String uItmsgrp;

    private String uCode;

    private String uCgy;

    public Cgyfpb(String code, String uSsgcu, String uItmsgrp, String uCode, String uCgy) {
        this.code = code;
        this.uSsgcu = uSsgcu;
        this.uItmsgrp = uItmsgrp;
        this.uCode = uCode;
        this.uCgy = uCgy;
    }

    public Cgyfpb() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getuSsgcu() {
        return uSsgcu;
    }

    public void setuSsgcu(String uSsgcu) {
        this.uSsgcu = uSsgcu == null ? null : uSsgcu.trim();
    }

    public String getuItmsgrp() {
        return uItmsgrp;
    }

    public void setuItmsgrp(String uItmsgrp) {
        this.uItmsgrp = uItmsgrp == null ? null : uItmsgrp.trim();
    }

    public String getuCode() {
        return uCode;
    }

    public void setuCode(String uCode) {
        this.uCode = uCode == null ? null : uCode.trim();
    }

    public String getuCgy() {
        return uCgy;
    }

    public void setuCgy(String uCgy) {
        this.uCgy = uCgy == null ? null : uCgy.trim();
    }
}