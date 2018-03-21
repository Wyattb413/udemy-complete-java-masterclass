package com.wyattb413;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Burger extends OrderItem {
    private String breadType;
    private String pattyType;

    public Burger(String itemName, BigDecimal itemPrice, int numberOfAdditions, String breadType, String pattyType) {
        super(itemName, itemPrice, numberOfAdditions);
        this.breadType = breadType;
        this.pattyType = pattyType;
    }

    @Override
    public ArrayList<ItemAddition> getAdditions() {
        return null;
    }
}
