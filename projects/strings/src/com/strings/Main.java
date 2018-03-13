package com.strings;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        // Outputs: myString is equal to This is a string

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        // Outputs: myString is equal to This is a string, and this is more.

        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);
        // Outputs: myString is equal to This is a string, and this is more. © 2015

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);
        // Outputs: The result is 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        // Outputs: LastString is equal to 1050

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
        // Outputs: LastString value: 1050120.47
    }
}