package com.example.pizza.model;

public class Pizza {
    String name;
    String description;
    double price;
    String topping;

    public Pizza(String name, String description, double price, String topping) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
