package com.ck.tasks5.procalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProCalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two positive integer values and then an operator from the following: +, -, /, or *. ");

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            char operator = scanner.next().charAt(0);//takes the next input from the scanner, grabs the 1st char of it
            //and stores it as the operator
            if (num1 <= 0 || num2 <= 0) {
                System.out.println("Error: Both number should be positive integers.");
                return;
            }

            int result;
            boolean valid = true;

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 != 0) { //is this condition always true? - checks it out!!
                        result = num1 / num2;
                    } else {
                        System.out.println("Error. Division by 0 is not allowed.");
                        valid = false;
                        result = 0;
                    }
                }
                default -> {
                    System.out.println("Error. Invalid operator. Please use +, -, * or /.");
                    valid = false;
                    result = 0;
                }
            }
            ;

//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    break;
//                case '/':
//                    result = num1 / num2;
//                    break;
//            }


            if (valid) {
                System.out.println("Your sum is " + num1 + " " + operator + " " + num2 + " and the answer is " + result);
            }

        } catch (InputMismatchException e) {
        System.out.println("Error: Please enter positive integers followed by an operator.");
        } catch (Exception e) {
            System.out.println("An error occurred : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
