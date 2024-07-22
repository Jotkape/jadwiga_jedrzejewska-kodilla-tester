package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideStringsForTestingBMI() {
        return Stream.of(
                Arguments.of(1.50,50,"Normal (healthy weight)"),
                Arguments.of(1.50,60,"Overweight"),
                Arguments.of(1.50,40,"Underweight"),
                Arguments.of(1.50,35,"Severely underweight"),
                Arguments.of(1.50,20,"Very severely underweight"),
                Arguments.of(1.50,70,"Obese Class I (Moderately obese)"), //ctd+d dubluje linie
                Arguments.of(1.50,80,"Obese Class II (Severely obese)"),
                Arguments.of(1.50,90,"Obese Class III (Very severely obese)"),
                Arguments.of(1.50,110,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.50,120,"Obese Class V (Super Obese)")
        );
    }
}
