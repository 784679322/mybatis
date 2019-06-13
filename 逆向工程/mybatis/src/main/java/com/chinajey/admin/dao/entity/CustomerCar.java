package com.chinajey.admin.dao.entity;

import java.util.Date;

public class CustomerCar {
    private Integer id;

    private Integer customerId;

    private Integer carId;

    private String belong;

    private String state;

    private Date expiretime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }
}