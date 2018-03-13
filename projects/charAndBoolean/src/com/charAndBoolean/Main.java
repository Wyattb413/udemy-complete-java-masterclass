package com.charAndBoolean;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar= 'A';
        System.out.println("myChar " + myChar);

        // char supports unicode characters using the \u prefix
        char myUnicodeChar= '\u00A9';
        System.out.println("myUnicodeChar " + myUnicodeChar);

        boolean myBoolean = false;
    }
}
