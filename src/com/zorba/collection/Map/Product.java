package com.zorba.collection.Map;

public class Product {

    private double amount;

    private int rating;

    private String name;

    public Product(double amount, int rating, String name) {
        this.amount = amount;
        this.rating = rating;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "amount=" + amount +
                ", rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
