package com.ck.tasks6.account;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount() {    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        if  (amount > 0) {
            this.balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
        }
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }


}//end of class
