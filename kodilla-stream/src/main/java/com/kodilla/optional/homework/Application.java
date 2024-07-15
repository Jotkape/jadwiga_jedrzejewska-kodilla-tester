package com.kodilla.optional.homework;
/*utwórz listę obiektów klasy Student i wypełnij ją przykładowymi danymi.
Niektórzy uczniowie niech mają przypisanego nauczyciela, a niektórzy nie (wówczas pole teacher = null)

Następnie przy pomocy pętli for-each wyświetl pary uczeń-nauczyciel (np. w formie "uczeń: Jan Kowalski,
nauczyciel:
Tomasz Nowak"). Wykorzystaj klasę Optional do tego, aby obsłużyć sytuacje, w których teacher == null.
Wówczas w miejscu danych nauczyciela wyświetl tekst "<undefined>".

W folderze test utwórz pakiet com.kodilla.optional.homework z klasą ApplicationTest .
Następnie napisz odpowiednie testy, aby pokryć nimi wszystkie przypadki zaimplementowane w zadaniu.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Walter White", new Teacher("Andy")));
        students.add(new Student("Jessie Pinkman", null));
        students.add(new Student("Tuco Salamanca", new Teacher("Edy")));
        students.add(new Student("Gus Firing", new Teacher("Bob")));
        students.add(new Student("Gale Boetticher", null));
        students.add(new Student("Mike Ehrmantraut", new Teacher("Marc")));

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
}
