package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTestSuit {

    @Test
    void testPrincipalConstructorAndGetters() {
        // Given
        Principal principal = new Principal("John", "Doe");

        // When & Then
        assertEquals("John", principal.getFirstname());
        assertEquals("Doe", principal.getLastname());
    }

    @Test
    void testPrincipalEquality() {
        // Given
        Principal principal1 = new Principal("John", "Doe");
        Principal principal2 = new Principal("John", "Doe");
        Principal principal3 = new Principal("Jane", "Smith");

        // When & Then
        assertEquals(principal1, principal2); // Obiekty z tymi samymi danymi powinny być równe
        assertNotEquals(principal1, principal3); // Obiekty z różnymi danymi nie powinny być równe
    }

    @Test
    void testPrincipalHashCode() {
        // Given
        Principal principal1 = new Principal("John", "Doe");
        Principal principal2 = new Principal("John", "Doe");

        // When & Then
        assertEquals(principal1.hashCode(), principal2.hashCode()); // Te same dane -> ten sam hashCode
    }

    @Test
    void testSchoolConstructorWithList() {
        // Given
        List<Integer> students = Arrays.asList(30, 25, 28);
        School school = new School(students);

        // When
        int sum = school.getSum();

        // Then
        assertEquals(83, sum); // Sprawdzenie, czy suma uczniów w klasach jest poprawna
    }

    @Test
    void testSchoolConstructorWithVarargs() {
        // Given
        School school = new School(30, 25, 28);

        // When
        int sum = school.getSum();

        // Then
        assertEquals(83, sum); // Sprawdzenie, czy suma uczniów w klasach jest poprawna
    }

    @Test
    void testSchoolToString() {
        // Given
        School school = new School(30, 25, 28);

        // When
        String result = school.toString();

        // Then
        assertEquals("School{school=[30, 25, 28]}", result); // Sprawdzenie formatu toString()
    }



}