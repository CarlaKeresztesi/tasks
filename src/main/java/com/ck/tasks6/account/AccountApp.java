package com.ck.tasks6.account;

public class AccountApp {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("1", "Emma Gray", 5500.00, 2.5);
        BankAccount account2 = new BankAccount("2", "Anne Friday", 600_000.0, 2.0);
        BankAccount account3 = new BankAccount("3", "John Dolittle", 56.0, 1.5);

        account1.deposit(3500.0);
        account1.withdraw(100.00);
        account1.withdraw(10.00);

        account2.withdraw(500.00);
        account2.deposit(3000);

        account3.deposit(65.0);
        account3.withdraw(5.0);

        System.out.println("\nApplying interest to all accounts...");
        account1.applyInterest();
        account2.applyInterest();
        account3.applyInterest();

        System.out.println("\nFinal account details:"); //starts a new line in each output - just like pressing Enter
        account1.displayInfo();
        account2.displayInfo();
        account3.displayInfo();

        //using an ARRAY to represent the BankAccount objects:

//        BankAccount[] accounts = {
//                new BankAccount("1001", "Alice Johnson", 1000.00, 2.5),
//                new BankAccount("1002", "Bob Smith", 2000.00, 3.0),
//                new BankAccount("1003", "Charlie Davis", 1500.00, 1.5)
//        };
//
//        accounts[0].deposit(250.00);
//        accounts[1].withdraw(500.00);
//        accounts[2].deposit(100.00);
//
//        // looping over accounts calling the applyInterest():
//        System.out.println("\nApplying interest to all accounts...");
//        for (BankAccount account : accounts) {
//            account.applyInterest();
//        }
//
//
//        System.out.println("\nFinal Account Details:");
//        for (BankAccount account : accounts) {
//            account.displayInfo();
//        }



        //using a LIST of accounts - more dynamic, can add/remove:
//
//        List<BankAccount> accounts = new ArrayList<>();
//        accounts.add(new BankAccount("1001", "Alice Johnson", 1000.00, 2.5));
//        accounts.add(new BankAccount("1002", "Bob Smith", 2000.00, 3.0));
//        accounts.add(new BankAccount("1003", "Charlie Davis", 1500.00, 1.5));
//
//        // Perform some transactions
//        accounts.get(0).deposit(250.00);
//        accounts.get(1).withdraw(500.00);
//        accounts.get(2).deposit(100.00);
//
         // loop for applyingInterest()
//        System.out.println("\nApplying interest to all accounts...");
//        for (BankAccount account : accounts) {
//            account.applyInterest();
//        }
//
//        System.out.println("\nFinal Account Details:");
//        for (BankAccount account : accounts) {
//            account.displayInfo();
//        }


    }//end of main


}//end of class
