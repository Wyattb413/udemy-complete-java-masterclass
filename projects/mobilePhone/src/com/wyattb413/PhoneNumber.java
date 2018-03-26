package com.wyattb413;

import java.util.Scanner;

public class PhoneNumber {
    private String type;
    private String number;

    public PhoneNumber() {
        this.type = askForType();
        this.number = askForNumber();
    }

    // GETTERS
        public String getNumber() {
            return number;
        }

        public String getType() {
            return type;
        }

        public String getPhoneNumberDetails() {
            return getType() + " Phone: " + getNumber();
        }
    //

    // SETTERS
        private void setType(String type) {
            this.type = type;
        }

        private void setNumber(String number) {
            this.number = number;
        }
    //

    // VALIDATION
        private String validateType(String type) {
            if (!type.equalsIgnoreCase("Mobile") && !type.equalsIgnoreCase("Home") && !type.equalsIgnoreCase("Work")) {
                System.out.println("That was an invalid Phone Number Type, please try again.\n");

                askForType();
            }

            return type;
        }

        private void validateEditPhoneNumberMenuItem(int menuItem) {
            switch (menuItem) {
                case 1:
                    // Edit Phone Number Type
                    setType(askForType("The current type is: " + getType() + ". What would you like to update it to? (Mobile, Home, or Work)\n"));
                    break;
                case 2:
                    // Edit Phone Number
                    setNumber(askForNumber("The current number is: " + getNumber() + ". What would you like to update it to?\n"));
                    break;
                default:
                    System.out.println("Your selection didn't match any of the menu items.\n");
                    displayEditPhoneNumberMenu();
            }
        }
    //

    // USER PROMPTS
        private String askForType() {
            System.out.println("What Type of Phone Number is this? Mobile, Home, or Work\n");

            return validateType(getNewScanner().next());
        }

        private String askForType(String customMessage) {
            System.out.println(customMessage);

            return validateType(getNewScanner().next());
        }

        private String askForNumber() {
            System.out.println("Please provide the Phone Number:\n");

            return getNewScanner().next();
        }

        private String askForNumber(String customMessage) {
            System.out.println(customMessage);

            return getNewScanner().next();
        }
    //

    // MENUS
        private void displayEditPhoneNumberMenu() {
            Scanner menuInput = getNewScanner();

            System.out.println("Editing " + getPhoneNumberDetails() + ". Please Select from the following:\n" +
                    "1. Edit Phone Type\n" +
                    "2. Edit Phone Number\n");

            if (menuInput.hasNextInt()) {
                validateEditPhoneNumberMenuItem(menuInput.nextInt());
            } else {
                // Catches user inputs that are NOT ints
                System.out.println("Your selection didn't match any of the menu items.\n");
                displayEditPhoneNumberMenu();
            }
        }
    //

    // GENERAL METHODS
        public void editPhoneNumber() {
            displayEditPhoneNumberMenu();
        }
    //

    // MISCELLANEOUS METHODS
        private Scanner getNewScanner() {
            return new Scanner(System.in);
        }
    //
}
