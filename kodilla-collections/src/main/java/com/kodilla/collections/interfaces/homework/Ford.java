package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;
    private int increase;
    private int decrease;

    public Ford(int speed, int increase, int decrease) {
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;
    }

    @Override
    public int getActualSpeed() {
        return speed;
    }

    @Override
    public int getIncreaseSpeed() {
        speed = speed + increase;
        return speed;
    }

    @Override
    public int getDecreaseSpeed() {
        speed = speed - decrease;
        return speed;
    }
}
