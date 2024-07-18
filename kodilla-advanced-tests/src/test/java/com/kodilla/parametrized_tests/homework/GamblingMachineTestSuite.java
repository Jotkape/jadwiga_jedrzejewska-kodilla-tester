package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/ValidNumbers.csv")
    public void shouldReturnTrueForValidNumbers(String numbers) throws InvalidNumbersException {
        Set<Integer> xx = Arrays.stream(numbers.split(","))
                .map(it -> Integer.valueOf(it))
                .collect(Collectors.toSet());

        int result = gamblingMachine.howManyWins(xx);
        assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/InvalidNumbers.csv")
    public void shouldReturnFalseForInvalidNumbers(String numbers) throws InvalidNumbersException {
        Set<Integer> xx = Arrays.stream(numbers.split(","))
                .map(it -> Integer.valueOf(it))
                .collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(xx));
    }

}