package com.chinajey.admin.dao.entity;

import java.util.Date;

public class RateKey {
    private Date ratedate;

    private String currency;

    public Date getRatedate() {
        return ratedate;
    }

    public void setRatedate(Date ratedate) {
        this.ratedate = ratedate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}