package com.ck.tasks4.thunderbirds;

import java.util.Scanner;

public class ThunderbirdApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 4: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Thunderbird 1 pilot is Scott Tracy");
                break;
            case 2:
                System.out.println("Thunderbird 2 pilot is Virgil Tracy");
                break;
            case 3:
                System.out.println("Thunderbird 3 pilot is Alan Tracy");
                break;
            case 4:
                System.out.println("Thunderbird 4 pilot is Gordon Tracy");
                break;
            default:
                System.out.println("Have you never watched Thunderbirds!");
        }

        scanner.close();

    }
}
