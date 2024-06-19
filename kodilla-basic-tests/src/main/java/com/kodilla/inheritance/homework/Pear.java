package com.kodilla.inheritance.homework;

public class Pear extends OperatingSystem {
    @Override
    public void turnOn() {
    }
    @Override
    public void turnOff() {
    }

    public Pear(int yearOn,int yearOff) {
        super(yearOn,yearOff);
        System.out.println("System Pear were turned on " + yearOn);
        System.out.println("System Pear were turned off " + yearOff);
    }
}
