package com.byteShortInt;

public class Main {

    public static void main(String[] args) {

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        // (byte) is casting the expression to it's right to a byte
        byte myTotalByteValue = (byte) (myMinByteValue/2);

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = -32767;
        // (short) is casting the expression to it's right to a short
        short myTotalShortValue = (short) (myMinShortValue/2);

        // int has a width of 32
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;
        // no need to cast expression to int, because Java does this by default
        int myTotalIntValue = (myMinIntValue/2);

        // long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        // (long) is casting the expression to it's right to a long
        long myTotalLongValue = (long) (myMinLongValue/2);


        // Exercises

        // Creating a valid byte number
        byte myValidByteNumber = 10;

        // Creating a valid short number
        short myValidShortNumber =  20;

        // Creating a valid int number
        int myValidIntNumber = 50;

        // Creating a long number, and making it equal to
        // (50,000 + 10) * (myValidByteNumber + myValidShortNumber + myValidIntNumber)

        // the expression part of this statement does NOT need to be casted as long data types
        // also accepts int
        long myValidLongTotal = 50_000L + 10L * (myValidByteNumber + myValidShortNumber + myValidIntNumber);
        System.out.println(myValidLongTotal);

        // However, because short does NOT support int value, you must cast the entire expression to be able to assign
        // it to a short variable
        short myValidShortTotal = (short) (5_000 + 10 * (myValidByteNumber + myValidShortNumber + myValidIntNumber));
        System.out.println(myValidShortTotal);
    }
}
