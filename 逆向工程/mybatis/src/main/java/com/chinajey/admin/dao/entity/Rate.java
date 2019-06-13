package com.chinajey.admin.dao.entity;

public class Rate extends RateKey {
    private String rate;

    private String datadource;

    private String usersign;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDatadource() {
        return datadource;
    }

    public void setDatadource(String datadource) {
        this.datadource = datadource;
    }

    public String getUsersign() {
        return usersign;
    }

    public void setUsersign(String usersign) {
        this.usersign = usersign;
    }
}