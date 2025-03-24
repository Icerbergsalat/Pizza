package com.example.pizza.model;

public class User {
    String name;
    String email;
    String address;
    int bonusPoints;

    public User(String name, String email, String address, int bonusPoints) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.bonusPoints = bonusPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }
}
