package com.kodilla.optional.homework;

public class Student {
    String name;
    Teacher teacher; //będzie przechowywało obiekt nauczyciela prowadzącego danego ucznia.

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
