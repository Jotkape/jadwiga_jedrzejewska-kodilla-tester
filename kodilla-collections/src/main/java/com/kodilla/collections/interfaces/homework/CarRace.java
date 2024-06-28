package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(107, 10, 20);
        doRace(ford);

        Opel opel = new Opel(78, 30, 20);
        doRace(opel);

        Honda honda = new Honda(98, 50, 10);
        doRace(honda);
    }

    private static void doRace(Car car) {
        car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getDecreaseSpeed();
        car.getDecreaseSpeed();
        car.getActualSpeed();
    }
}
