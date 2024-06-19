package com.kodilla.inheritance;

public class Convertible extends Car { //podklasa klasy bazowej Car
    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }

    @Override //nadpisanie istniejącej metody w innej klasie
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }

    public Convertible(int wheels, int seats) {
        super(wheels, seats); //sposób na wywołanie zmiennych prywatnych w innej klasie
    }
}
