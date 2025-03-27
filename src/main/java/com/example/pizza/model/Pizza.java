package com.example.pizza.model;

public class Pizza {
    int id;
    String name;
    String description;
    double price;
    String topping;
    String pizzaImg;

    public Pizza(int id, String name, String description, double price, String topping, String pizzaImg) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.topping = topping;
        this.id = id;
        this.pizzaImg = pizzaImg;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getTopping() {
        return topping;
    }

    public int getId() {
        return id;
    }

    public String getPizzaImg() {
        return pizzaImg;
    }
}
