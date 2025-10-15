package com.ck.telephonebill;

import java.util.Scanner;

public class TelephoneBillApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of minutes: ");
        int minutes = scanner.nextInt();


        if (minutes < 0) {
            System.out.println("Please enter a positive integer of minutes: ");
            return;
        }

        double chargePerMinute = 0.15;

        double callCharge = chargePerMinute * minutes;

        double vat = callCharge * 0.2;

        double bill = callCharge + vat;

        System.out.println("Enter number of minutes: " + minutes);
        System.out.printf("Basic call charge: £%.2f%n", callCharge);
        System.out.printf("VAT due: £%.2f%n", vat);
        System.out.printf("Total bill: £%.2f%n", bill);

        scanner.close();
    }
}
