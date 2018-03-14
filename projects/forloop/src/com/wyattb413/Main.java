package com.wyattb413;

public class Main {

    public static void main(String[] args) {
        int numberOfPrimes = 0;

        for (int i=2; 1 <= 20; i++) {
            if (numberOfPrimes == 3) {
                System.out.println("You found " + numberOfPrimes + " Prime Numbers!");

                break;
            }

            if (isPrime(i)) {
                System.out.println(i + " is a Prime Number!");

                numberOfPrimes++;
            } else {
                System.out.println(i + " is NOT a Prime Number!");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
