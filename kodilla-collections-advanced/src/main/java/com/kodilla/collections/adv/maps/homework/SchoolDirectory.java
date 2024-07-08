package com.kodilla.collections.adv.maps.homework;
/*
Wewnątrz metody main stwórz mapę przyporządkowującą szkoły do dyrektorów.
Dodaj do mapy kilka wpisów – przykładowych dyrektorów i szkół.
Wykorzystując pętlę for-each, wyświetl informacje o dyrektorach placówek,
nazwie szkoły, którą kierują, oraz o łącznej liczbie uczniów w każdej szkole.
 */

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> school = new HashMap<>();
        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pinkman");
        Principal bart = new Principal("Bart", "Simpson");

        School johnSchool = new School(5,6,8,9);
        School jessieSchool = new School(25,26,34);
        School bartSchool = new School(4,9,16,17);

        school.put(johnSchool, john);
        school.put(jessieSchool, jessie);
        school.put(bartSchool, bart);

        for (Map.Entry<School, Principal> schoolPrincipalEntry : school.entrySet()) {
            System.out.println(schoolPrincipalEntry.getValue().getFirstname() + ", total: " + schoolPrincipalEntry.getKey().getSum());}
    }
}
