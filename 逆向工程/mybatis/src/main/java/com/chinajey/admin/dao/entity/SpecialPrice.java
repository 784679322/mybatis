package com.chinajey.admin.dao.entity;

import java.math.BigDecimal;

public class SpecialPrice extends SpecialPriceKey {
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}