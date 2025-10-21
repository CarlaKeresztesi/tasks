package com.ck.tasks7.shopping;

public class ShoppingApp {

    public static void main(String[] args) {

        Product laptop = new Product("laptop", 850.00, 50);
        Product mouse = new Product("mouse", 50.00, 123);
        Product keyboard = new Product("keyboard", 250.00, 18);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(laptop, 1);
        cart.addItem(mouse, 2);
        cart.removeItem(keyboard);

        System.out.println("--- Cart before removing an item ---");
        cart.displayCart();

        cart.removeItem(mouse);

        System.out.println("\n--- Cart after removing an item ---");
        cart.displayCart();

        System.out.println("\nThank you for shopping with us!");

    }//end of main

}//end of class
