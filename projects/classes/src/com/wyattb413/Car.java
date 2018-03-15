package com.wyattb413;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String lowerCasedModel = model.toLowerCase();

        if (lowerCasedModel.equals("240z") || lowerCasedModel.equals("gti")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
