package com.wyattb413;

public class Main {

    public static void main(String[] args) {
        Car datsun = new Car();
        Car volkswagon = new Car();

        datsun.setModel("240z");

        System.out.println("The Datsun is a " + datsun.getModel());
    }
}
