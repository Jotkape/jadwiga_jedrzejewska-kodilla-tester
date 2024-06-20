package com.kodilla.abstracts.homework;

public class Developer extends Job {

    public Developer(double salary) {
        super(salary, "Developing");
    }

    @Override
    public void performDuties() {
        System.out.println("Developing");
    }
}
