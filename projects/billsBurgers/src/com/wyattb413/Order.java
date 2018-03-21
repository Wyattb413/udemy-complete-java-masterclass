package com.wyattb413;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {
    public static int orderNumber;
    private String orderName;
    private ArrayList<OrderItem> orderItems;

    public Order(String orderName) {
        this.orderName = orderName;
        this.orderItems = new ArrayList<OrderItem>();
        this.orderNumber++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    private void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void changeOrderName(String newName) {
        setOrderName(newName);
    }

    public void addToOrder(OrderItem orderItem) {
        getOrderItems().add(orderItem);
    }

    public void removeFromOrder(OrderItem orderItem) {
        getOrderItems().remove(orderItem);
    }

    public void listOrderItems() {
        System.out.println("Order #" + getOrderNumber() + " for " + getOrderName() + " contains:");

        for (int i = 0; i < getOrderItems().size(); i++) {
            System.out.println(
                    getOrderItems().get(i).getItemName() + " - " + getOrderItems().get(i).getItemPrice()
            );

            if (getOrderItems().get(i).getNumberOfAdditions() > 0) {
                System.out.println("With additions:");

                for (int x = 0; x < getOrderItems().get(i).getAdditions().size(); x++) {
                    System.out.println(
                            getOrderItems().get(i).getAdditions().get(x).getAdditionName() + " - " + getOrderItems().get(i).getAdditions().get(x).getAdditionPrice()
                    );
                }
            }
        }
    }

    public void grandTotal() {
        BigDecimal grandTotal = new BigDecimal("0.00");

        for (int i = 0; i < getOrderItems().size(); i++) {
            grandTotal = grandTotal.add(getOrderItems().get(i).getItemPrice());

            if (getOrderItems().get(i).getNumberOfAdditions() > 0) {
                for (int x = 0; x < getOrderItems().get(i).getAdditions().size(); x++) {
                    grandTotal = grandTotal.add(getOrderItems().get(i).getAdditions().get(x).getAdditionPrice());
                }
            }
        }

        System.out.println("Order #" + getOrderNumber() + " for " + getOrderName() + " has a Grand Total of $" + grandTotal);
    }
}
