package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.Car;

public class Doors extends OperatingSystem {
    @Override
    public void turnOn() {
    }
    @Override
    public void turnOff() {
    }

    public Doors(int yearOn,int yearOff) {
        super(yearOn,yearOff);
        System.out.println("System Doors were turned on " + yearOn);
        System.out.println("System Doors were turned off " + yearOff);

    }
}
