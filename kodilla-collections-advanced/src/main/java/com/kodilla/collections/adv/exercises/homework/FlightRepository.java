package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Kraków", "Paryż"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Gdańsk", "Nowy Jork"));
        flights.add(new Flight("Warszawa", "Moskwa"));
        flights.add(new Flight("Berlin", "Warszawa"));
        return flights;
    }
}