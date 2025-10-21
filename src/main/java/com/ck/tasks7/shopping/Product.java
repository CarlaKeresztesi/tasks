package com.ck.tasks7.shopping;

public class Product {

    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    //Bonus challenge:
    public void reduceStock(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Stock quantity cannot be negative.");
        if (quantity > stockQuantity) throw new IllegalStateException("Not enough stock.");
        this.stockQuantity -= quantity;
    }

    public void increaseStock(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Stock quantity increase cannot be negative.");
        this.stockQuantity += quantity;
    }


}// end of class
