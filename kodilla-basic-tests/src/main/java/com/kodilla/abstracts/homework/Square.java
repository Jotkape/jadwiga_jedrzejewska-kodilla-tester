package com.kodilla.abstracts.homework;

public class Square extends Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double Area() {
        return side * side;
    }

    @Override
    public double Perimeter() {
        return 4 * side;
    }
}
