package com.wyattb413;

import java.math.BigDecimal;
import java.util.ArrayList;

public class OrderItem implements Orderable {
    private String itemName;
    private BigDecimal itemPrice;
    private int numberOfAdditions;

    public OrderItem(String itemName, BigDecimal itemPrice, int numberOfAdditions) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.numberOfAdditions = numberOfAdditions;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    @Override
    public int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    @Override
    public ArrayList<ItemAddition> getAdditions() {
        System.out.println(getItemName() + " does not come with additions");

        return null;
    }
}
