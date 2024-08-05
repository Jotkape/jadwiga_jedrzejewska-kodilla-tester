package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigTestSuite {

    @Test
    void shouldReturnCorrectCarBasedOnSeason() {
        // Given
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

        // When
        Car car = (Car) context.getBean("car");

        // Then
        String carType = car.getCarType();
        boolean headlightsOn = car.hasHeadlightsTurnedOn();

        System.out.println("Car type: " + carType);
        System.out.println("Headlights on: " + headlightsOn);

        assertTrue(carType.equals("Cabrio") || carType.equals("SUV") || carType.equals("Sedan"));
        if (headlightsOn) {
            LocalTime currentTime = LocalTime.now();
            assertTrue(currentTime.isAfter(LocalTime.of(20, 0)) || currentTime.isBefore(LocalTime.of(6, 0)));
        }

        context.close();
    }

}