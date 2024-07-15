package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuit {

    @Test
    public void testStudentWithTeacher() {
        Teacher teacher1 = new Teacher("Tomasz Nowak");
        Student student1 = new Student("Jan Kowalski", teacher1);

        assertEquals("Jan Kowalski", student1.getName());
        assertEquals("Tomasz Nowak", student1.getTeacher().getName());
    }

    @Test
    public void testStudentWithoutTeacher() {
        Student student2 = new Student("Piotr Wiśniewski", null);

        assertEquals("Piotr Wiśniewski", student2.getName());
        assertEquals(null, student2.getTeacher());
    }

    @Test
    public void testApplicationOutput() {
        Teacher teacher1 = new Teacher("Tomasz Nowak");
        Teacher teacher2 = new Teacher("Anna Kowalska");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", teacher1));
        students.add(new Student("Maria Nowak", teacher2));
        students.add(new Student("Piotr Wiśniewski", null));
        students.add(new Student("Katarzyna Kaczmarek", null));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }

        String expectedOutput = "uczeń: Jan Kowalski, nauczyciel: Tomasz Nowak\r\n" +
                "uczeń: Maria Nowak, nauczyciel: Anna Kowalska\r\n" +
                "uczeń: Piotr Wiśniewski, nauczyciel: <undefined>\r\n" +
                "uczeń: Katarzyna Kaczmarek, nauczyciel: <undefined>";

        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }

}