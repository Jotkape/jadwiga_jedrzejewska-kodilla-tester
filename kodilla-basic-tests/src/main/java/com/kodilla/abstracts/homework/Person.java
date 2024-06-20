package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;
import com.kodilla.abstracts.Dog;
import com.kodilla.abstracts.Duck;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities() {
        System.out.println(firstName + "'s responsibilities: " + job.getResponsibilities());
    }

    public static void main(String[] args) {
        Job teacher = new Tester(50000);
        Person person1 = new Person("Jurek", 30, teacher);
        person1.displayResponsibilities();

        Job engineer = new Developer(70000);
        Person person2 = new Person("Burek", 25, engineer);
        person2.displayResponsibilities();

        Job doctor = new ProductOwner(120000);
        Person person3 = new Person("Kurek", 40, doctor);
        person3.displayResponsibilities();
    }
}
