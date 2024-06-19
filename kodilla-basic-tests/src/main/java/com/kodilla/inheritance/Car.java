package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }

    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }
    public int getWheels() { //getter1
        return wheels;
    }

    public int getSeats() { //getter2
        return seats;
    }
    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }
}
