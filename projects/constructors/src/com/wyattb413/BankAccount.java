package com.wyattb413;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("1234567890",0.0,
                "Default Name","Default Email","Default Phone Number");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email,
                       String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;

        this.getBalance();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        double currentBalance = this.getBalance();

        this.setBalance(currentBalance + depositAmount);

        System.out.println("Deposit Successful! Current Balance: $" + this.getBalance());
    }

    public void withdraw(double withdrawAmount) {
        double currentBalance = this.getBalance();

        if (currentBalance - withdrawAmount < 0) {
            System.out.println(
                    "Error: You tried to withdraw more than your current balance. Current Balance: " +
                            this.getBalance() + " Attempted Withdraw Amount: " + withdrawAmount
            );

            return;
        }

        this.setBalance(currentBalance - withdrawAmount);

        System.out.println("Withdraw Successful! Current Balance: $" + this.getBalance());
    }
}
