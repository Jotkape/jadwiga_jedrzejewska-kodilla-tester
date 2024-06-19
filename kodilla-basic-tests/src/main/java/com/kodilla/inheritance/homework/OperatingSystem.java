package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOn;
    private int yearOff;

    public void turnOn() {
        System.out.println("System were turned on " + yearOn);
    }

    public void turnOff() {
        System.out.println("System were turned off " + yearOff);
    }

    public OperatingSystem(int yearOn,int yearOff) {
        this.yearOn = yearOn;
        this.yearOff = yearOff;
    }

    public int getYearOn() {
        return yearOn;
    }

    public int getYearOff() {
        return yearOff;
    }
}
