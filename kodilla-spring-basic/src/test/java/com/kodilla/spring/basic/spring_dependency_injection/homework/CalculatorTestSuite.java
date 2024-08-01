package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSuite {
    @Test
    void testAdd() {
        Display display = Mockito.mock(Display.class);
        Calculator calculator = new Calculator(display);

        double result = calculator.add(5, 3);
        assertEquals(8, result);
        Mockito.verify(display).display(8);
    }

    @Test
    void testSubtract() {
        Display display = Mockito.mock(Display.class);
        Calculator calculator = new Calculator(display);

        double result = calculator.subtract(5, 3);
        assertEquals(2, result);
        Mockito.verify(display).display(2);
    }

    @Test
    void testMultiply() {
        Display display = Mockito.mock(Display.class);
        Calculator calculator = new Calculator(display);

        double result = calculator.multiply(5, 3);
        assertEquals(15, result);
        Mockito.verify(display).display(15);
    }

    @Test
    void testDivide() {
        Display display = Mockito.mock(Display.class);
        Calculator calculator = new Calculator(display);

        double result = calculator.divide(9, 3);
        assertEquals(3, result);
        Mockito.verify(display).display(3);
    }

    @Test
    void testDivideByZero() {
        Display display = Mockito.mock(Display.class);
        Calculator calculator = new Calculator(display);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(9, 0);
        });

        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

}