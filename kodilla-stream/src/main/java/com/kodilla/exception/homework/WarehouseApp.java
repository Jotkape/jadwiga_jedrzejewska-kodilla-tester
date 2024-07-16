package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("32", 123124));
        warehouse.addOrder(new Order("234", 23432));
        warehouse.addOrder(new Order("213", 234));

        try {
            System.out.println("found: " + warehouse.getOrder("766"));
        } catch (OrderDoesntExistException e) {
            System.out.println("not found");
        }

    }
}
