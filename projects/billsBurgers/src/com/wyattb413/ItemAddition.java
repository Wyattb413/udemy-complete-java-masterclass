package com.wyattb413;

import java.math.BigDecimal;

public class ItemAddition implements ItemAdditionable {
    private String additionName;
    private BigDecimal additionPrice;

    public ItemAddition(String additionName, BigDecimal additionPrice) {
        this.additionName = additionName;
        this.additionPrice = additionPrice;
    }

    @Override
    public String getAdditionName() {
        return additionName;
    }

    @Override
    public BigDecimal getAdditionPrice() {
        return additionPrice;
    }
}
