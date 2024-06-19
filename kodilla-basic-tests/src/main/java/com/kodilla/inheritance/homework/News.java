package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.Car;
import com.kodilla.inheritance.Convertible;

public class News {
    public static void main(String[] args){
        Doors doors = new Doors(1940,1960 );
        doors.turnOn();
        doors.turnOff();

        Pear pear = new Pear(1945,1970);
        pear.turnOn();
        pear.turnOff();

        OperatingSystem operatingSystem = new OperatingSystem(1900, 2024);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

    }
}
