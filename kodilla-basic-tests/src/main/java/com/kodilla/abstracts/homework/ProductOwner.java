package com.kodilla.abstracts.homework;

public class ProductOwner extends Job {

    public ProductOwner(double salary) {
        super(salary, "Product ownering");
    }

    @Override
    public void performDuties() {
        System.out.println("Product ownering");
    }
}
