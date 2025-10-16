package com.ck.tasks4.agevalidation;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeValidationApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        while (true) { //loop until we 'break' out
            System.out.print("Please enter your name: ");
            name = scanner.nextLine().trim(); // returns a line of text that is read from the scanner object & removes empty spaces
            if (!name.isEmpty()) break; //if name not-empty, break/exit the loop
            System.out.println("Name cannot be empty. Please try again.");
        }


    LocalDate dateOfBirth = null; //variable dateOfBirth has no value atm
    boolean validDate = false;

    while(!validDate) // loop runs while !validDate is true

    {
        System.out.print("Please enter your date of birth ( YYYY-MM-DD): ");
        String dobInput = scanner.nextLine().trim();

        try {
            dateOfBirth = LocalDate.parse(dobInput); // now dateOfBirth is given a value
            LocalDate today = LocalDate.now();

            if (dateOfBirth.isAfter(today)) { // isAfter() compares the two dates-> true if 1st date comes after the 2nd one in time; -> false otherwise
                System.out.println("Date of birth cannot be in the future. Please try again.");
            } else {
                validDate = true; // !validDate = false => while loop stops
            }
        } catch (Exception e) { //catches exception declared in variable 'e' to avoid i.e. the DateTimeParseException Java might throw
            System.out.println("Invalid date format. Please enter your date of birth in YYYY-MM-DD format.");
        }
    }

        LocalDate today = LocalDate.now();
        int age = Period.between(dateOfBirth, today).getYears();

        if (age >= 18) {
            System.out.println("Congratulations, " + name + "! You are " + age + " years old. You are an adult.");
        } else {
            System.out.println("Congratulations, " + name + "! You are " + age + " years old. You are a child.");
        }

        scanner.close();
    }
}
