package com.ck.tasks7.shopping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>(); //creating new, empty List for the cart to use
    }                                       // making sure items is initialized and ready to hold CartItem objects.

    public void addItem(Product p, int quantity) {
         items.add(new CartItem(p, quantity));
    }

    public void removeItem(Product p) { // will remove the cart item whose product equals p
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next(); // advances iterator to next elements and returns it, storing it in item.
            if (item.getProduct().equals(p)) { // the check - if the Product inside the current cart item is equal to the p we want removed.
                iterator.remove();           //removes current item from the list safely via iterator.
                break;                       // exits loop right after removing the first matching item
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
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

}//end of class
