package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

/*
Sprawdź, czy do kolekcji nie da się dodać kilka razy takiego samego znaczka.
 */
public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Bolek", "3x2", "Yes"));
        stamps.add(new Stamp("Lolek", "2x3", "No"));
        stamps.add(new Stamp("Tytus", "2,5x3", "Yes"));
        stamps.add(new Stamp("Romek", "3x2,5", "No"));

        stamps.add(new Stamp("Bolek", "3x2", "Yes"));
        stamps.add(new Stamp("Romek", "3x2,5", "No"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
