package com.example.pizza.model;

import java.util.Date;

public class Order {
    Date date;
    String pizzas;
    double total;

    public Order(Date date, String pizzas, double total) {
        this.date = date;
        this.pizzas = pizzas;
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPizzas() {
        return pizzas;
    }

    public void setPizzas(String pizzas) {
        this.pizzas = pizzas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}