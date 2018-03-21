package com.wyattb413;

public class Main {

    public static void main(String[] args) {
        Datsun240z myNewDatsun = new Datsun240z();

        myNewDatsun.startEngine();
        myNewDatsun.accelerate();
        myNewDatsun.brake();

        VWGti myNewGti = new VWGti();

        myNewGti.startEngine();
        myNewGti.accelerate();
        myNewGti.brake();
    }
}

class Car {
    private Boolean engine;
    private String make;
    private String model;
    private String cylinders;
    private int wheels;

    public Car() {
        this(true, "Unknown", "Unknown", "Unknown", 4);
    }

    public Car(String make, String model, String cylinders) {
        this(true, make, model, cylinders, 4);
    }

    public Car(Boolean engine, String make, String model, String cylinders, int wheels) {
        this.engine = engine;
        this.make = make;
        this.model = model;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public Boolean getEngine() {
        System.out.println("This car has an engine: " + this.engine);

        return engine;
    }

    public String getMake() {
        System.out.println("This car has a make of: " + this.make);

        return make;
    }

    public String getModel() {
        System.out.println("This car is a:" + this.model);

        return model;
    }

    public String getCylinders() {
        System.out.println("The number of cylinders this car has is " + this.cylinders);

        return cylinders;
    }

    public int getWheels() {
        System.out.println("The number of wheels this car has is " + this.wheels);

        return wheels;
    }

    public void startEngine() {
        System.out.println("Started the Engine from the Car class...");
    }

    public void accelerate() {
        System.out.println("You're accelerating from the Car class...");
    }

    public void brake() {
        System.out.println("You're braking from the Car class...");
    }
}

class Datsun240z extends Car {
    public Datsun240z() {
        super(true, "Datsun", "240z", "4-cylinder", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("You attempt to start the Engine, but the car is old and doesn't start");
    }

    @Override
    public void accelerate() {
        System.out.println("You attempt to accelerate, but you failed to start the engine");
    }

    @Override
    public void brake() {
        System.out.println("You brake...but you weren't moving to begin with...because you failed to start the engine");
    }
}

class VWGti extends Car {
    public VWGti() {
        super(true, "Volks Wagon", "GTI", "4-cylinder", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("The engine fires up, and puuuuuuuuuurs");
    }

    @Override
    public void accelerate() {
        System.out.println("You attempt to accelerate, but the turbo kicks in and you blast off towards the moon");
    }

    @Override
    public void brake() {
        System.out.println("You brake...but you're in space now, and friction is meaningless");
    }
}
