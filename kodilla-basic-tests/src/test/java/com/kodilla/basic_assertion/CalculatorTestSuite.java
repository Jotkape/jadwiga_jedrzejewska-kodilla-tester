package com.kodilla.basic_assertion;
//Dobrą praktyką jest nazywanie klas testowych,
// składając nazwę klasy, którą chcemy testować, i wyrażenie TestSuite

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        double a = 5;
        double powerResult = calculator.power(a);
        assertEquals(25, powerResult, 0.000025);
    }

    @Test
    public void testPowerZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double powerResult = calculator.power(a);
        assertEquals(0, powerResult, 0.000025);
    }

    @Test
    public void testPowerLessZero() {
        Calculator calculator = new Calculator();
        double a = -2;
        double powerResult = calculator.power(a);
        assertEquals(2, powerResult, 0.000025);
    }


}
