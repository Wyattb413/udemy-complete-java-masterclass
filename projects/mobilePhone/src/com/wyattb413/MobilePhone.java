package com.wyattb413;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String userFirstName;
    private String userLastName;
    private ArrayList<Contact> phoneBook = new ArrayList<Contact>();

    private Boolean hasSeenWelcomeMessage = false;

    public MobilePhone() {
        System.out.println("Hello there! Welcome to your new Mobile Phone. " +
                "Please enter your First and Last Name before we can get started...\n");

        this.userFirstName = askForUserFirstName();
        this.userLastName = askForUserLastName();

        displayMainMenu();
    }

    // GETTERS
        private String getUserFirstName() {
            return userFirstName;
        }

        private String getUserLastName() {
            return userLastName;
        }

        private String getUserFullName() {
            return getUserFirstName() + " " + getUserLastName();
        }

        private ArrayList<Contact> getPhoneBook() {
            return phoneBook;
        }

        private Contact getContactByIndex(int index) {
            return getPhoneBook().get(index);
        }
    //

    // SETTERS
        public void setHasSeenWelcomeMessage(Boolean hasSeenWelcomeMessage) {
            this.hasSeenWelcomeMessage = hasSeenWelcomeMessage;
        }
    //

    // VALIDATION
        private void validateMainMenuItem(int menuItem) {
            Boolean powerOn = true;

            switch (menuItem) {
                case 1:
                    // Display Phone Book
                    displayPhoneBook();
                    break;
                case 2:
                    // View Contact Details
                    getContactByIndex(askUserForContact()).listContactDetails();
                    break;
                case 3:
                    // Add New Contact
                    getPhoneBook().add(new Contact());
                    break;
                case 4:
                    // Edit A Contact
                    String editMessage = "Select a Contact to Edit from your Phone Book";

                    getContactByIndex(askUserForContact(editMessage)).editContact();
                    break;
                case 5:
                    // Delete A Contact
                    getPhoneBook().remove(getContactByIndex(askUserForContact()));
                    break;
                case 6:
                    // Search for a Contact
                    displaySearchContactMenu();
                    break;
                case 7:
                    // Power Off
                    powerOn = false;
                    System.out.println("Powering off your phone, Good Bye " + getUserFirstName() + "!");
                    break;
                default:
                    System.out.println("Your selection didn't match any of the menu items.\n");
                    displayMainMenu();
            }

            if (powerOn) {
                displayMainMenu();
            }
        }

        private void validateSearchContactMenuItem(int menuItem) {
            switch (menuItem) {
                case 1:
                    // Search for Contact by First Name
                    displaySearchContactResultsMenu(searchContactsByFirstName());
                    break;
                case 2:
                    // Search for Contact by Last Name
                    displaySearchContactResultsMenu(searchContactsByLastName());
                    break;
                case 3:
                    // Search for Contact by Full Name
                    displaySearchContactResultsMenu(searchContactsByFullName());
                    break;
                case 4:
                    // Search for Contact by Phone Number
                    displaySearchContactResultsMenu(searchContactsByPhoneNumber());
                    break;
                default:
                    System.out.println("Your selection didn't match any of the menu items.\n");
                    displaySearchContactMenu();
            }
        }

        private void validateSearchContactResultsMenuItem(ArrayList<Contact> searchResults, int menuItem) {
            if (searchResults.size() >= menuItem && menuItem >= 0) {
                searchResults.get(menuItem).listContactDetails();
            } else {
                System.out.println("Your selection didn't match any of the menu items.\n");
                displaySearchContactResultsMenu(searchResults);
            }
        }
    //

    // USER PROMPTS
        private String askForUserFirstName() {
            System.out.println("Please enter your First Name:\n");

            return getNewScanner().next();
        }

        private String askForUserLastName() {
            System.out.println("Please enter your Last Name:\n");

            return getNewScanner().next();
        }

        private int askUserForContact() {
            System.out.println("Select a Contact from your Phone Book:\n");

            displayPhoneBook();

            // in.nextInt()-1 to remove formatting
            return (getNewScanner().nextInt()-1);
        }

        private String askUser(String customMessage) {
            System.out.println(customMessage);

            return getNewScanner().next();
        }

    private int askUserForContact(String customMessage) {
        System.out.println(customMessage);

        displayPhoneBook();

        // in.nextInt()-1 to remove formatting
        return (getNewScanner().nextInt()-1);
    }
    //

    // MENUS
        private void displayMainMenu() {
            Scanner menuInput = getNewScanner();

            if (!this.hasSeenWelcomeMessage) {
                System.out.println(welcomeMessage());

                setHasSeenWelcomeMessage(true);
            }

            System.out.println("Please select from one of the following menu items:\n\n" +
                    "1. Display Phone Book\n" +
                    "2. View Contact Details\n" +
                    "3. Add New Contact\n" +
                    "4. Edit A Contact\n" +
                    "5. Delete A Contact\n" +
                    "6. Search for a Contact\n" +
                    "7. Power Off your Mobile Phone" +
                    "\nPlease provide your selection...\n");

            if (menuInput.hasNextInt()) {
                validateMainMenuItem(menuInput.nextInt());
            } else {
                // Catches user inputs that are NOT ints
                System.out.println("Your selection didn't match any of the menu items.\n");
                displayMainMenu();
            }
        }

        private void displaySearchContactMenu() {
            Scanner menuInput = getNewScanner();

            System.out.println("Select how you'd like to search for a contact:\n" +
                    "1. First Name\n" +
                    "2. Last Name\n" +
                    "3. Full Name\n" +
                    "4. Phone Number\n" +
                    "\nPlease provide your selection...\n");

            if (menuInput.hasNextInt()) {
                validateSearchContactMenuItem(menuInput.nextInt());
            } else {
                // Catches user inputs that are NOT ints
                System.out.println("Your selection didn't match any of the menu items.\n");
                displaySearchContactMenu();
            }
        }

        private void displaySearchContactResultsMenu(ArrayList<Contact> searchResults) {
            if (searchResults.size() > 0) {
                Scanner menuInput = getNewScanner();

                System.out.println(searchResults.size() + " potential match(es) found!\n" +
                        "\nPlease select a Contact from the following:\n");

                for (int i=0; i < searchResults.size(); i++) {
                    // i+1 for formatting
                    System.out.println(i+1 + ". " + searchResults.get(i).contactsFullName());
                }

                if (menuInput.hasNextInt()) {
                    // menuInput.nextInt()-1 removes number formatting (starting at 1 instead of 0)
                    validateSearchContactResultsMenuItem(searchResults, menuInput.nextInt()-1);
                } else {
                    // Catches user inputs that are NOT ints
                    System.out.println("Your selection didn't match any of the menu items.\n");
                    displaySearchContactResultsMenu(searchResults);
                }
            } else {
                System.out.println("There were no matches.\n");
            }
        }
    //

    // CONTACTS
        private void displayPhoneBook() {
            System.out.println("You currently have " +
                    getPhoneBook().size() + " Contacts listed in your Phone Book.\n");

            for (int i = 0; i < getPhoneBook().size(); i++) {
                // i+1 for formatting
                System.out.println(i+1 + ". " + getPhoneBook().get(i).contactsFullName());
            }
        }

        private ArrayList<Contact> searchContactsByFirstName() {
            String searchTerm = askUser("What's the Contact's First Name?\n");

            ArrayList<Contact> potentialMatches = new ArrayList<Contact>();

            for (int i=0; i < getPhoneBook().size(); i++) {
                Contact contact = getPhoneBook().get(i);

                if (contact.getFirstName().toLowerCase().contains(searchTerm.toLowerCase())) {
                    potentialMatches.add(contact);
                }
            }

            return potentialMatches;
        }

        private ArrayList<Contact> searchContactsByLastName() {
            String searchTerm = askUser("What's the Contact's Last Name?\n");

            ArrayList<Contact> potentialMatches = new ArrayList<Contact>();

            for (int i=0; i < getPhoneBook().size(); i++) {
                Contact contact = getPhoneBook().get(i);

                if (contact.getLastName().toLowerCase().contains(searchTerm.toLowerCase())) {
                    potentialMatches.add(contact);
                }
            }

            return potentialMatches;
        }

        private ArrayList<Contact> searchContactsByFullName() {
            String searchTerm = askUser("What's the Contact's Full Name?\n");

            ArrayList<Contact> potentialMatches = new ArrayList<Contact>();

            for (int i=0; i < getPhoneBook().size(); i++) {
                Contact contact = getPhoneBook().get(i);

                if (contact.contactsFullName().toLowerCase().contains(searchTerm.toLowerCase())) {
                    potentialMatches.add(contact);
                }
            }

            return potentialMatches;
        }

        private ArrayList<Contact> searchContactsByPhoneNumber() {
            String searchTerm = askUser("What's the Contact's Phone Number?\n");

            ArrayList<Contact> potentialMatches = new ArrayList<Contact>();

            for (int i=0; i < getPhoneBook().size(); i++) {
                Contact contact = getPhoneBook().get(i);

                for (int x=0; x < contact.getPhoneNumbers().size(); x++) {
                    PhoneNumber phoneNumber = contact.getPhoneNumbers().get(i);

                    if (phoneNumber.getNumber().contains(searchTerm)) {
                        potentialMatches.add(contact);
                    }
                }
            }

            return potentialMatches;
        }
    //

    // MISCELLANEOUS METHODS
        private Scanner getNewScanner() {
            return new Scanner(System.in);
        }

        private String welcomeMessage() {
            return "Welcome to your new Mobile Phone " + getUserFullName() + "!\n";
        }
    //
}
