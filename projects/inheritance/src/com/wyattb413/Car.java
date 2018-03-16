package com.wyattb413;

public class Car extends Vehicle {

    private int numberOfDoors;

    private Car() {
        this(0);
    }

    private Car(int numberOfDoors) {
        this("Unkown", "Unknown", "Unknown", 0,
                "Unknown", 0, false, numberOfDoors, false, false);
    }

    public Car(String make, String model, String motor, int currentGear, String fuelType, int speed,
               boolean isMoving, int numberOfDoors, boolean steeringLeft, boolean steeringRight) {
        super(make, model, motor, currentGear, fuelType, speed, isMoving, steeringLeft, steeringRight);
        this.numberOfDoors = numberOfDoors;
    }
}
