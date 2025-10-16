package com.ck.tasks4.series;

import java.util.Scanner;

public class SeriesApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positiveIntSum = 0;
        int negativeIntSum = 0;

        for (int i = 1; i <= 5; i++) { // prompting for integer x 5 and reading the scanner
            System.out.print("Please enter an integer " + i + ": ");
            int value = scanner.nextInt();

            if (value > 0) {
                positiveIntSum += value;
            } if (value < 0) {
                negativeIntSum += value;
            }
        }

        System.out.printf("Sum of positive integers: %d%n", positiveIntSum);
        System.out.printf("Sum of negative integers: %d%n", negativeIntSum);

        scanner.close();
    }

}



