package com.wyattb413;

public class Main {

    public static void main(String[] args) {
        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.

        Car datsun240z = new Car("Datsun", "240z", "8-cylinder", 0,
                "gas", 0, false, 2, false, false);

        datsun240z.makeAndModel();

        datsun240z.checkSpeed();

        datsun240z.changeGears(1);
        datsun240z.accelerate(10);
        datsun240z.checkSpeed();
        datsun240z.changeGears(2);
        datsun240z.turnLeft();
        datsun240z.accelerate(15);
        datsun240z.checkSpeed();
        datsun240z.changeGears(3);
        datsun240z.turnRight();
        datsun240z.accelerate(15);
        datsun240z.checkSpeed();

        datsun240z.decelerate(15);
        datsun240z.checkSpeed();
        datsun240z.changeGears(2);
        datsun240z.turnLeft();
        datsun240z.decelerate(15);
        datsun240z.checkSpeed();
        datsun240z.changeGears(1);
        datsun240z.turnRight();
        datsun240z.decelerate(10);
        datsun240z.checkSpeed();
        datsun240z.changeGears(0);

        datsun240z.decelerate(10);
    }
}
