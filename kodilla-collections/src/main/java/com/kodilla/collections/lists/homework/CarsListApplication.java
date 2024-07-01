package com.kodilla.collections.lists.homework;

/*
6. Ponownie wyświetl zawartość kolekcji, a także informację o jej rozmiarze.*/

import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;
import java.util.ArrayList;
import java.util.List;
import static com.kodilla.collections.arrays.homework.CarUtils.getCarName;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Honda honda = new Honda(98, 37, 36);
        cars.add(honda);
        cars.add(new Ford(79,48,7));
        cars.add(new Opel(94,48,53));

        for (Car car : cars) {
            System.out.println("-----------------------------");
            System.out.println("Car kind: " + getCarName(car));
            System.out.println("Car speed: " + car.getActualSpeed());
        }

        cars.remove(2);
        cars.remove(honda);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println("-----------------------------");
            System.out.println("Car kind: " + getCarName(car));
            System.out.println("Car speed: " + car.getActualSpeed());
        }
    }
}
