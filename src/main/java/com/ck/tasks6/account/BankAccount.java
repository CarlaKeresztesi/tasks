package com.ck.tasks6.account;

import java.text.NumberFormat;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;

    public BankAccount() {
        this.accountNumber = "000_000";
        this.accountHolder = "Unknown";
        this.balance = 0.0;
        this.interestRate = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance,  double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        if  (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + " into account " + this.accountNumber);
        } //else {
          //this.balance -= amount;
        //System.out.println("Withdrew " + amount + " from account " + this.accountNumber);
     // }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + this.accountNumber);
        } else if  (amount < 0) {
            System.out.println("Withdrawal operation failed. Amount must be positive.");
        } else {
            System.out.println("Withdrawal operation failed. Insufficient balance.");
        }
    }

    void applyInterest() {
        double interest = balance * (interestRate /100);
        balance += interest;
        System.out.println("Applied interest of " + interestRate + "% (£" + String.format("%.2f", interest) + ") to account " + accountNumber);
    }

    void displayInfo() {
        System.out.println("==================================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: £ " + String.format("%.2f", balance)); // or use the following for printing balance:
     // System.out.println("Balance: £ " + NumberFormat.getCurrencyInstance(Locale.UK).format(balance));
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("==================================");
    }



}//end of class
