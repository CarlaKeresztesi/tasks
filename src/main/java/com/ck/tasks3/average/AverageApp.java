package com.ck.average;

import java.util.Scanner;

public class AverageApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = getPositiveInteger(scanner, "Please enter int value a: ");
        int b = getPositiveInteger(scanner, "Please enter int value b: ");
        int c = getPositiveInteger(scanner, "Please enter int value c: ");
        int d = getPositiveInteger(scanner, "Please enter int value d: ");

        float average = (a + b + c + d) / 4;

        System.out.printf("Average is %.2f%n", average);

        scanner.close();

    }

    private static int getPositiveInteger (Scanner scanner, String input){ //method takes 2 inputs and returns an int
                                        //scanner is used to READ input from the keyboard
                                        //input is the PROMPT DISPLAYED for the user to enter a number
        int value; //this variable will store the user's input

        while (true) { //infinite loop - will run until 'BREAK' statement - user will keep being asked for input until they enter something valid.
            System.out.print(input); // DISPLAYS the prompt for the user
            value = scanner.nextInt(); // READS from the keyboard and stores the int in the variable 'value'
            if (value >= 0) { //check for positive or 0
                break; //if positive or 0 (condition true), BREAKS out of the while loop - stops asking for input
            } else { //if number < 0 -> it executes else block:
                System.out.println("Invalid input. Please enter a value greater than or equal to 0: ");
            }
        }
        return value; //SENDS the valid NUMBER back to the code that called this method -> int a = getPos.....
    }
}
