package com.ck.tasks3.simplecalculator;

public class SimpleCalculatorApp {
    static void main(String[] args) {

        System.out.println(divide(Double.parseDouble(args[0]), Double.parseDouble(args[1])));

    }

    protected static double divide(double num1, double num2) {
        return num1 / num2;
    }

}

// used the Run configuration dropdown to edit Program arguments to the desired num1 and num2.

