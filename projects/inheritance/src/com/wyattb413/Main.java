package com.wyattb413;

public class Main {

    public static void main(String[] args) {
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
