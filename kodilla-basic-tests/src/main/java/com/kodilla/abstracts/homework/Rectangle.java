package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public double Perimeter() {
        return 2 * (length + width);
    }
}
