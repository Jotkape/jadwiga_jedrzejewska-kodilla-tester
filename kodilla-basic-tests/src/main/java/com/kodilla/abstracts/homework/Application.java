package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape rightTriangle = new Triangle(3, 4);
        System.out.println("Right Triangle Area: " + rightTriangle.Area());
        System.out.println("Right Triangle Perimeter: " + rightTriangle.Perimeter());

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.Area());
        System.out.println("Square Perimeter: " + square.Perimeter());

        Shape rectangle = new Rectangle(4, 7);
        System.out.println("Rectangle Area: " + rectangle.Area());
        System.out.println("Rectangle Perimeter: " + rectangle.Perimeter());
    }

}
