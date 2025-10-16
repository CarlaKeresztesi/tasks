package com.ck.tasks4.password;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PasswordCheckerApp {
    public static void main(String[] args) {

        final String PWD = "Rocket";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String userInput = scanner.nextLine();

        if (userInput.equals(PWD)) {
            System.out.println("You are logged in. Enjoy your session!");
        } else {
            System.out.println("Incorrect password. Access denied!");
        }
//a version where we keep prompting until the user enters the correct password:
//        final String PWD = "Rocket";

//        Scanner scanner = new Scanner(System.in);

//        String userInput = "";
//
//        while (true) {
//            System.out.print("Please enter your password: ");
//            userInput = scanner.nextLine();
//
//            if (userInput.equalsIgnoreCase(PWD)) { // built-in Java method used to compare two strings without caring about upper or lower case letters-> returns true if both strng are same and false otherwise
//                System.out.println("Welcome! Password accepted.");
//                break;
//            } else {
//                System.out.println("Incorrect password. You are logged out. Try again!");
//            }
//        }

        scanner.close();

    }
}
