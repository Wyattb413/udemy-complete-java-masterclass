package com.floatAndDouble;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        // Exercise

        // Create a variable to store the number of pounds
        // Calculate the number of Kilograms for the pounds variable
        // Print the result

        // NOTE 1 pound is equal to 0.45359237 kilograms

        double pounds = 120d;
        double kilogramsInPound = 0.453_592_37d;

        double kilograms = (pounds * kilogramsInPound);

        System.out.println("This number of kilograms in " + pounds + "lbs is " + kilograms + "kg");
    }
}
