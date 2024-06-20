package com.kodilla.abstracts.homework;

public class Tester extends Job {

    public Tester(double salary) {
        super(salary, "Testing");
    }

    @Override
    public void performDuties() {
        System.out.println("Testing");
    }
}
