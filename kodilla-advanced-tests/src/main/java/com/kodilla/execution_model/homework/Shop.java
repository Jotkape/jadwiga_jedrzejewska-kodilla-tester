package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersWithinDateRange(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersWithinValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= minValue && order.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getOrderCount() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }

}
