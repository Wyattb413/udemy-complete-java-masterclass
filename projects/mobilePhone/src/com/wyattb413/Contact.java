package com.wyattb413;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    private String firstName;
    private String lastName;
    private ArrayList<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

    public Contact() {
        this.firstName = askForFirstName();
        this.lastName = askForLastName();

        addPhoneNumber(createPhoneNumber());
    }

    // GETTERS
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public ArrayList<PhoneNumber> getPhoneNumbers() {
            return phoneNumbers;
        }

        private PhoneNumber getPhoneNumberByIndex(int index) {
            return getPhoneNumbers().get(index);
        }

        private ArrayList<String> getContactDetails() {
            ArrayList<String> contactDetails = new ArrayList<String>();

            // Adding First and Last Name to contactDetails
            contactDetails.add("First Name: " + getFirstName());
            contactDetails.add("Last Name: " + getLastName());

            // Adding each Phone Number to contactDetails
            for (int i=0; i < getPhoneNumbers().size(); i++) {
                PhoneNumber phoneNumber = getPhoneNumberByIndex(i);

                contactDetails.add(phoneNumber.getPhoneNumberDetails());
            }

            return contactDetails;
        }
    //

    // SETTERS
        private void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        private void setLastName(String lastName) {
            this.lastName = lastName;
        }
    //

    // VALIDATION
        private void validateEditContactMenuItem(int menuItem) {
            switch (menuItem) {
                case 1:
                    // Edit Contact's First Name
                    editContactsFirstName();
                    break;
                case 2:
                    // Edit Contact's Last Name
                    editContactsLastName();
                    break;
                case 3:
                    // Edit Contact's Phone Numbers
                    displayEditContactsPhoneNumbersMenu();
                    break;
                default:
                    System.out.println("Your selection didn't match any of the menu items.\n");
                    displayEditContactMenu();
            }
        }

        private void validateEditContactsPhoneNumberMenuItem(int menuItem) {
            // Checking if selected menuItem actually correlates to a Contact's Phone Number
            if (getPhoneNumbers().size() >= menuItem && menuItem >= 0) {
                getPhoneNumberByIndex(menuItem).editPhoneNumber();
            } else {
                System.out.println("Your selection didn't match any of the menu items.\n");
                displayEditContactsPhoneNumbersMenu();
            }
        }
    //

    // USER PROMPTS
        private String askForFirstName() {
            System.out.println("What is the First Name of the Contact?\n");

            setFirstName(getNewScanner().next());

            return getFirstName();
        }

        private String askForLastName() {
            System.out.println("What is the Last Name of the Contact?\n");

            setLastName(getNewScanner().next());

            return getLastName();
        }
    //

    // MENUS
        private void displayEditContactMenu() {
            Scanner menuInput = getNewScanner();

            System.out.println("What Contact Detail would you like to edit?\n" +
                    "1. Contact First Name\n" +
                    "2. Contact Last Name\n" +
                    "3. Contact's Phone Numbers\n" +
                    "\nPlease provide your selection...\n");

            if (menuInput.hasNextInt()) {
                validateEditContactMenuItem(menuInput.nextInt());
            } else {
                // Catches user inputs that are NOT ints
                System.out.println("Your selection didn't match any of the menu items.\n");
                displayEditContactMenu();
            }
        }

        private void displayEditContactsPhoneNumbersMenu() {
            Scanner menuInput = getNewScanner();

            System.out.println("Please select which Phone Number to edit:\n");

            listContactsPhoneNumbers();

            if (menuInput.hasNextInt()) {
                // menuInput.nextInt()-1 removes number formatting (starting at 1 instead of 0)
                validateEditContactsPhoneNumberMenuItem(menuInput.nextInt()-1);
            } else {
                // Catches user inputs that are NOT ints
                System.out.println("Your selection didn't match any of the menu items.\n");
                displayEditContactsPhoneNumbersMenu();
            }
        }
    //

    // GENERAL METHODS
        public void editContact() {
            System.out.println("You've selected " + contactsFullName() + " to edit. Here are their current details:\n");

            listContactDetails();

            displayEditContactMenu();
        }
    //

    // NAME
        public String contactsFullName() {
            return getFirstName() + " " + getLastName();
        }

        private void editContactsFirstName() {
            System.out.println("The Contact's First Name is currently: " + getFirstName() +
                    "\nWhat would you like to change it to?\n");

            setFirstName(getNewScanner().next());
        }

        private void editContactsLastName() {
            System.out.println("The Contact's Last Name is currently: " + getLastName() +
                    "\nWhat would you like to change it to?\n");

            setLastName(getNewScanner().next());
        }
    //

    // PHONE NUMBERS
        public PhoneNumber createPhoneNumber() {
            return new PhoneNumber();
        }

        private void addPhoneNumber(PhoneNumber phoneNumber) {
            phoneNumbers.add(phoneNumber);
        }

        public void listContactsPhoneNumbers() {
            System.out.println("Contact " + contactsFullName() + " has " +
                    getPhoneNumbers().size() + " phone numbers:\n");

            for (int i=0; i < getPhoneNumbers().size(); i++) {
                PhoneNumber phoneNumber = getPhoneNumberByIndex(i);

                System.out.println(i+1 + ". " + phoneNumber.getType() + " " + phoneNumber.getNumber());
            }
        }
    //

    // DETAILS
        public void listContactDetails() {
            for (int i=0; i < getContactDetails().size(); i++) {
                System.out.println(getContactDetails().get(i));
            }

            System.out.println("\n");
        }
    //

    // MISCELLANEOUS METHODS
        private Scanner getNewScanner() {
            return new Scanner(System.in);
        }
    //
}
