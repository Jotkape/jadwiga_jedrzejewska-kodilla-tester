package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {

    @Test
    void testGradesConstructorWithList() {
        // Given
        List<Double> gradesList = Arrays.asList(4.0, 3.5, 5.0);
        Grades grades = new Grades(gradesList);

        // When
        double average = grades.getAverage();

        // Then
        assertEquals(4.17, average, 0.01); // Sprawdzenie średniej z ocen (z tolerancją)
    }

    @Test
    void testGradesConstructorWithVarargs() {
        // Given
        Grades grades = new Grades(4.0, 3.5, 5.0);

        // When
        double average = grades.getAverage();

        // Then
        assertEquals(4.17, average, 0.01); // Sprawdzenie średniej z ocen (z tolerancją)
    }

    @Test
    void testGradesToString() {
        // Given
        Grades grades = new Grades(4.0, 3.5, 5.0);

        // When
        String result = grades.toString();

        // Then
        assertEquals("Grades: [4.0, 3.5, 5.0]", result);
    }

    @Test
    void testStudentConstructorAndGetters() {
        // Given
        Student student = new Student("John", "Doe");

        // When & Then
        assertEquals("John", student.getFirstname());
        assertEquals("Doe", student.getLastname());
    }

    @Test
    void testStudentEquality() {
        // Given
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("John", "Doe");
        Student student3 = new Student("Jane", "Smith");

        // When & Then
        assertEquals(student1, student2); // Dwa takie same obiekty powinny być równe
        assertNotEquals(student1, student3); // Różne obiekty nie powinny być równe
    }

    @Test
    void testStudentHashCode() {
        // Given
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("John", "Doe");

        // When & Then
        assertEquals(student1.hashCode(), student2.hashCode()); // Równe obiekty powinny mieć ten sam hashCode
    }

}