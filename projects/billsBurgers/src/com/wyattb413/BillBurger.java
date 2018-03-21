package com.wyattb413;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BillBurger extends Burger {
    private ArrayList<ItemAddition> itemAdditions = new ArrayList<ItemAddition>();

    public BillBurger() {
        this("White", "Beef");
    }

    public BillBurger(String breadType, String pattyType) {
        this("The Bill Burger", new BigDecimal("9.50"), 4, breadType, pattyType);
    }

    private BillBurger(String burgerName, BigDecimal burgerPrice, int numberOfAdditions, String breadType, String pattyType) {
        super(burgerName, burgerPrice, numberOfAdditions, breadType, pattyType);
    }

    private ArrayList<ItemAddition> getItemAdditions() {
        return itemAdditions;
    }

    public void addItemAddition(ItemAddition itemAddition) {
        getItemAdditions().add(itemAddition);
    }

    public void removeItemAddition(ItemAddition itemAddition) {
        getItemAdditions().remove(itemAddition);
    }

    public void listAdditions() {
        System.out.println("Additions:");

        for (int i = 0; i < getItemAdditions().size(); i++) {
            System.out.println(
                    getItemAdditions().get(i).getAdditionName() + " - " + getItemAdditions().get(i).getAdditionPrice()
            );
        }
    }

    @Override
    public ArrayList<ItemAddition> getAdditions() {
        return getItemAdditions();
    }
}
