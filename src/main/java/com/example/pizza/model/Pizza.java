package com.example.pizza.model;

public class Pizza {
    int id;
    String name;
    String description;
    double price;
    int fkTopping;
    String image;

    public Pizza(int id, String name, String description, double price, int fkTopping, String image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.fkTopping = fkTopping;
        this.id = id;
        this.image = image;
    }

    public Pizza() {}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getTopping() {
        return fkTopping;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }
}
