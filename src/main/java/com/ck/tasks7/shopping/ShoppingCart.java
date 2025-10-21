package com.ck.tasks7.shopping;

import java.util.*;

public class ShoppingCart {

    private List<CartItem> items = new ArrayList<>();
    private static final double DISCOUNT_RATE = 0.02;
    private static final double DISCOUNT_THRESHOLD = 100;

    public ShoppingCart() {
        this.items = new ArrayList<>(); //creating new, empty List for the cart to use
    }                                       // making sure items is initialized and ready to hold CartItem objects.

    public void addItem(Product p, int quantity) {
        if (p.getStockQuantity() >= quantity) {
            CartItem existingItem = null;
            for (CartItem item : items) {
                if (item.getProduct().equals(p)) {
                    existingItem = item;
                    break;
                }
            }
            if (existingItem != null) {
                existingItem.setQuantity(existingItem.getQuantity() + quantity);
            } else {
                items.add(new CartItem(p, quantity));
            }

            p.reduceStock(quantity);

            System.out.printf("Stock for %s after adding: %d units%n", p.getName(), p.getStockQuantity());
        } else {
            System.out.println("Not enough stock available for " + p.getName());
        }
    }

    public void removeItem(Product p) { // will remove the cart item whose product equals p
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next(); // advances iterator to next elements and returns it, storing it in item.
            if (item.getProduct().equals(p)) { // the check - if the Product inside the current cart item is equal to the p we want removed.
                p.increaseStock(item.getQuantity());
                iterator.remove();           //removes current item from the list safely via iterator.

                System.out.printf("Stock for %s after removal: %d units%n", p.getName(), p.getStockQuantity());

                break;   // exits loop right after removing the first matching item
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
        }
         //Bonus challenge:
        if (total > DISCOUNT_THRESHOLD) {
            total *= 0.98; // or total -= (2 / 100) * total;
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping cart: ");
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + " x " + item.getQuantity() + " = £" + item.getItemTotal());
        }
        System.out.println("Total price: £" + calculateTotal());
    }


    //Bonus challenge: - add cart sorting functionality
    public void sortCartByName() {
        items.sort(Comparator.comparing(item -> item.getProduct().getName()));
    }
    public void sortCartByPrice() {
        items.sort(Comparator.comparing(item -> item.getProduct().getPrice()));
    }


}//end of class
