package com.wyattb413;

public class Vehicle {

    private String make;
    private String model;
    private String motor;
    private int currentGear;
    private String fuelType;
    private int speed;
    private boolean isMoving;
    private boolean steeringLeft;
    private boolean steeringRight;

    public Vehicle() {
        this("Unknown", "Unknown", "Unknown",
                0, "Unknown", 0, false, false, false);
    }

    public Vehicle(String make, String model, String motor, int currentGear,
                   String fuelType, int speed, boolean isMoving, boolean steeringLeft, boolean steeringRight) {
        this.make = make;
        this.model = model;
        this.motor = motor;
        this.currentGear = currentGear;
        this.fuelType = fuelType;
        this.isMoving = isMoving;
        this.steeringLeft = steeringLeft;
        this.steeringRight = steeringRight;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    private int getCurrentGear() {
        return this.currentGear;
    }

    private void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    private int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private boolean isMoving() {
        return isMoving;
    }

    private void setMoving(boolean moving) {
        isMoving = moving;
    }

    private boolean isSteeringLeft() {
        return steeringLeft;
    }

    private void setSteeringLeft(boolean steeringLeft) {
        this.steeringLeft = steeringLeft;
    }

    private boolean isSteeringRight() {
        return steeringRight;
    }

    private void setSteeringRight(boolean steeringRight) {
        this.steeringRight = steeringRight;
    }

    public void accelerate(int speed) {
        setSpeed(getSpeed() + speed);

        if (getSpeed() > 0) {
            setMoving(true);
        }

        System.out.println("You accelerated " + speed + "mph");
    }

    public void decelerate(int speed) {
        if (getSpeed() == 0) {
            setMoving(false);

            System.out.println("You cannot slow down any more! " + checkSpeed());

            return;
        }

        setSpeed(getSpeed() - speed);

        if (getSpeed() == 0) {
            setMoving(false);
        }

        System.out.println("You decelerated " + speed + "mph");
    }

    public void changeGears(int gearToShiftTo) {
        if (getCurrentGear() == gearToShiftTo) {
            System.out.println("You're already in " + getCurrentGear() + " gear!");

            return;
        }

        setCurrentGear(gearToShiftTo);

        if (getCurrentGear() == 0) {
            System.out.println("Shifted to neutral");
        } else {
            System.out.println("Shifted to " + getCurrentGear() + " gear");
        }

    }

    public void turnLeft() {
        if (isSteeringLeft()) {
            System.out.println("You're already turning left!");

            return;
        }

        setSteeringRight(false);
        setSteeringLeft(true);

        System.out.println("You're now turning left");
    }

    public void turnRight() {
        if (isSteeringRight()) {
            System.out.println("You're already turning Right!");

            return;
        }

        setSteeringLeft(false);
        setSteeringRight(true);

        System.out.println("You're now turning right");
    }

    public String makeAndModel() {
        System.out.println("You're currently driving a " + getMake() + " " + getModel());

        return getModel() + " " + getMake();
    }

    public String checkSpeed() {
        System.out.println("You're currently going " + getSpeed() + "mph");

        return "You're currently going " + getSpeed() + "mph";
    }
}
