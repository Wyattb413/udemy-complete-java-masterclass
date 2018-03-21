package com.wyattb413;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter no. of elements you want in array: ");

        Integer numberOfNumbers = scanner.nextInt();

        Integer[] intArray = getNumbers(numberOfNumbers);

        Integer[] sortedArray = sortNumbers(intArray);

        printArray(sortedArray);
    }

    public static Integer[] getNumbers(int numberOfNumbers) {
        Integer[] numbersArray = new Integer[numberOfNumbers];

        System.out.print("Enter " + numberOfNumbers + " numbers:\n");

        for (Integer i = 0; i < numberOfNumbers; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        return numbersArray;
    }

    public static Integer[] sortNumbers(Integer[] intArray) {
        Integer[] sortedArray = intArray.clone();

        Arrays.sort(sortedArray, Collections.reverseOrder());

        return sortedArray;
    }

    public static void printArray(Integer[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
