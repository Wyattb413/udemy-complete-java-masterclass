package com.overloadingMethods;

public class Main {

    public static void main(String[] args) {
        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is > 0
        // You should validate that the 2nd parameter inches is >0
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        double feet = 6d;
        double inches = 0d;

        System.out.println("The number of centimeters in " + feet + "ft and " + inches + "in is: " +
                calcFeetAndInchesToCentimeters(feet, inches)
        );

        inches = 157d;

        System.out.println("The number of centimeters in " + inches + "in is: " +
                calcFeetAndInchesToCentimeters(inches)
        );
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double numberOfCentimetersInInch = 2.54d;

        if (feet < 0 || inches < 0) {
            System.out.println("Please provide whole numbers for feet, a number less than " + 12
                    + " for inches, and a number greater than 0 for both feet and inches");

            return -1;
        }

        return ((feet * 12) * numberOfCentimetersInInch) +
                (inches * numberOfCentimetersInInch);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double calculatedFeet = (int) (inches / 12);
        double calculatedInches = (int) (inches % 12);

        if (inches <= 0) {
            System.out.println("Please provide a number greater than 0 for inches");

            return -1;
        }

        return calcFeetAndInchesToCentimeters(calculatedFeet, calculatedInches);
    }
}
