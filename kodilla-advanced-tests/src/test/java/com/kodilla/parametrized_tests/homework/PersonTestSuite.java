package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideStringsForTestingBMI")
    public void calculatePersonBMI(double heightInMeters, double weightInKilogram, String bmi) {
        Person person = new Person(heightInMeters, weightInKilogram);
        assertEquals(bmi, person.getBMI());
    }

}