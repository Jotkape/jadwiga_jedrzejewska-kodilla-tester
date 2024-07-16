package com.kodilla.exception.homework;

import java.util.LinkedList;
import java.util.List;

public class Warehouse {
    private List<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order found = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException());
        return found;
    }
}
