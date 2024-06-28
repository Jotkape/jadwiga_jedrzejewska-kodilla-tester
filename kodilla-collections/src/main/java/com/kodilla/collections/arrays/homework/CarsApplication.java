package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        /*
        tablica o losowym rozmiarze od 1 do 15 samochodów.
        Do każdego elementu tablicy wpisz wylosowany przy pomocy metody drawCar samochód,
        a następnie przy pomocy pętli wyświetl informacje o wszystkich samochodach znajdujących się w tablicy.
         */
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() { //tworzyła losowy samochód z losowo zwiększoną prędkością.
        int drawnCarKind = RANDOM.nextInt(3);
        int a = getRandomSpeed();
        int b = getRandomSpeed();
        int c = getRandomSpeed();
        if (drawnCarKind == 0)
            return new Honda(a, b, c);
        else if (drawnCarKind == 1)
            return new Opel(a, b, c);
        else {
            return new Ford(a, b, c);
        }
    }

    private static int getRandomSpeed() {
        return Math.abs(RANDOM.nextInt(100)) + 1;
    }

}
