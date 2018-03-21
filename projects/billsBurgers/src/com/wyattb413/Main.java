package com.wyattb413;

public class Main {

    public static void main(String[] args) {
        Order orderOne = new Order("Wyatt");

        ItemAddition pickles = new Pickles();
        ItemAddition tomato = new Tomato();
        ItemAddition onions = new Onions();

        BillBurger orderOneBillBurger = new BillBurger();
        orderOneBillBurger.addItemAddition(pickles);
        orderOneBillBurger.addItemAddition(tomato);
        orderOneBillBurger.addItemAddition(onions);
        orderOneBillBurger.removeItemAddition(tomato);

        orderOne.addToOrder(orderOneBillBurger);
        orderOne.listOrderItems();

        orderOne.grandTotal();
    }
}
