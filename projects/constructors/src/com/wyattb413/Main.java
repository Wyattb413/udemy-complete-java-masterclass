package com.wyattb413;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("1234567890",100,
                "Wyatt Barnes","myEmail@me.com","(123) 456-7890");

        System.out.println(bankAccount1.getBalance());

        bankAccount1.deposit(100.42);

        bankAccount1.withdraw(6_000);

        bankAccount1.withdraw(100);

        VIPCustomer vipCustomer1 = new VIPCustomer();
    }
}
