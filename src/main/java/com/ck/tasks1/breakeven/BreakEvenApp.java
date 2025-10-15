package com.ck.breakeven;

public class BreakEvenApp {
    public static void main(String[] args) {
        double costPerItem = 20.0;
        double salePrice = 40.0;
        double fixedCosts = 50000.0;

        double profitPerItem = salePrice - costPerItem;
        salePrice = costPerItem + profitPerItem;
        double breakeven = fixedCosts / profitPerItem;

        System.out.println("Sale price for each item: " + salePrice);
        System.out.println("Fixed costs: " + fixedCosts);
        System.out.println("Profit per item: " + profitPerItem);
        System.out.println("Breakeven: " + (int) breakeven); //we have to type cast to convert a double into an int -->
        //the decimal part will be truncated (since we don't want to display the decimals for Breakeven).

    }
}
