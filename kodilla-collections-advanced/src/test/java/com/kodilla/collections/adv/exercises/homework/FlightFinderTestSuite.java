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

        //flight

        @Test
        void testFlightConstructorAndGetters() {
            // Given
            Flight flight = new Flight("Warszawa", "Berlin");

            // When & Then
            assertEquals("Warszawa", flight.getDeparture());
            assertEquals("Berlin", flight.getArrival());
        }

        @Test
        void testSetDeparture() {
            // Given
            Flight flight = new Flight("Warszawa", "Berlin");

            // When
            flight.setDeparture("Kraków");

            // Then
            assertEquals("Kraków", flight.getDeparture());
        }

        @Test
        void testSetArrival() {
            // Given
            Flight flight = new Flight("Warszawa", "Berlin");

            // When
            flight.setArrival("Nowy Jork");

            // Then
            assertEquals("Nowy Jork", flight.getArrival());
        }

        @Test
        void testToString() {
            // Given
            Flight flight = new Flight("Warszawa", "Berlin");

            // When
            String result = flight.toString();

            // Then
            assertEquals("Flight{departure='Warszawa', arrival='Berlin'}", result);
        }

        @Test
        void testEqualsAndHashCode() {
            // Given
            Flight flight1 = new Flight("Warszawa", "Berlin");
            Flight flight2 = new Flight("Warszawa", "Berlin");
            Flight flight3 = new Flight("Kraków", "Paryż");

            // When & Then
            assertEquals(flight1, flight2); // same departure and arrival
            assertNotEquals(flight1, flight3); // different departure and arrival
            assertEquals(flight1.hashCode(), flight2.hashCode()); // hashCodes should be equal for equal objects
            assertNotEquals(flight1.hashCode(), flight3.hashCode()); // hashCodes should differ for different objects
        }
}