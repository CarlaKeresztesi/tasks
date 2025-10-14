package com.sparta.calculator;

public class CalculatorApp {
    public static void main(String[] args) {

       if (args.length < 2) { //we need 2 args - args is an array of strings - it will hold any value we pass when
           System.out.println("Please provide two integers as arguments."); //running the program.
           return;
       }

       double a = Double.parseDouble(args[0]);// converted args from String to numbers
       double b = Double.parseDouble(args[1]);

       if (Double.compare(b, 0) == 0) {
           System.out.println("Error: cannot divide by 0.");
           return;
       }

        Double result = a / b;

       if (Double.isNaN(result) || Double.isInfinite(result)) {
           System.out.println("Error: invalid result.");
       } else {
           System.out.printf("%.0f / %.0f = %.2f%n", a, b, result);
       }
    }
}

// used the Run configuration dropdown to edit Program arguments to 15 and 10.
