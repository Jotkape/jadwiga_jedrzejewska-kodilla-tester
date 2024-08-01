package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;

public class Calculator {
    private final Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        display.display(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        display.display(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        display.display(result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        double result = a / b;
        display.display(result);
        return result;
    }
}
