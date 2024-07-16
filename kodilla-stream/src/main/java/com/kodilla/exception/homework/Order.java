package com.kodilla.exception.homework;

public class Order {
    String number;
    double cost;

    public Order(String number, double cost) {
        this.number = number;
        this.cost = cost;
    }

    public String getNumber() {
        return number;
    }

    public double getCost() {
        return cost;
    }
}
