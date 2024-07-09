package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        FlightFinder finder = new FlightFinder();
        List<Flight> flightsFromWarsaw = finder.findFlightsFrom("Warszawa");

        assertEquals(3, flightsFromWarsaw.size());
        assertTrue(flightsFromWarsaw.contains(new Flight("Warszawa", "Berlin")));
        assertTrue(flightsFromWarsaw.contains(new Flight("Warszawa", "Londyn")));
        assertTrue(flightsFromWarsaw.contains(new Flight("Warszawa", "Moskwa")));
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder finder = new FlightFinder();
        List<Flight> flightsToWarsaw = finder.findFlightsTo("Warszawa");

        assertEquals(1, flightsToWarsaw.size());
        assertTrue(flightsToWarsaw.contains(new Flight("Berlin", "Warszawa")));
    }

    @Test
    public void testFindFlightsFromNotFound() {
        FlightFinder finder = new FlightFinder();
        List<Flight> flightsFromNowhere = finder.findFlightsFrom("Nowhere");

        assertTrue(flightsFromNowhere.isEmpty());
    }

    @Test
    public void testFindFlightsToNotFound() {
        FlightFinder finder = new FlightFinder();
        List<Flight> flightsToNowhere = finder.findFlightsTo("Nowhere");

        assertTrue(flightsToNowhere.isEmpty());
    }
}