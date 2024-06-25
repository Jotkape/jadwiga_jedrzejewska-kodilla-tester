package com.kodilla.basic_assertion;

public class Application {

    static void verifyCalculator(boolean correct, String method, String forWhat) {
        if (correct) {
            System.out.println("Metoda " + method + " działa poprawnie " + forWhat);
        } else {
            System.out.println("Metoda " + method + " nie działa poprawnie " + forWhat);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        verifyCalculator(correct,"sum", "dla liczb " + a + " i " + b);
        int subResult = calculator.subtract(a, b);
        correct = ResultChecker.assertEquals(-3, subResult);
        verifyCalculator(correct,"substract", "dla liczb " + a + " i " + b);
        int powerResult = calculator.power(a);
        correct = ResultChecker.assertEquals(25, powerResult);
        verifyCalculator(correct, "power", "dla liczby " + a);

    }
}
