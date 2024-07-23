package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop;
    private Order order1;
    private Order order2;
    private Order order3;
    private Order order4;

    @BeforeEach
    public void initializeShop() {
        shop = new Shop();
        order1 = new Order(100.0, LocalDate.of(2023, 1, 1), "user1");
        order2 = new Order(200.0, LocalDate.of(2023, 2, 1), "user2");
        order3 = new Order(300.0, LocalDate.of(2023, 3, 1), "user3");
        order4 = new Order(400.0, LocalDate.of(2023, 4, 1), "user4");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void shouldAddOrdersToShop() {
        // When
        int numberOfOrders = shop.getOrderCount();

        // Then
        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldGetOrdersWithinDateRange() {
        // When
        List<Order> result = shop.getOrdersWithinDateRange(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 3, 1));

        // Then
        assertEquals(3, result.size());
        assertTrue(result.contains(order1));
        assertTrue(result.contains(order2));
        assertTrue(result.contains(order3));
    }

    @Test
    public void shouldGetOrdersWithinValueRange() {
        // When
        List<Order> result = shop.getOrdersWithinValueRange(150.0, 350.0);

        // Then
        assertEquals(2, result.size());
        assertTrue(result.contains(order2));
        assertTrue(result.contains(order3));
    }

    @Test
    public void shouldReturnOrderCount() {
        // When
        int result = shop.getOrderCount();

        // Then
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnTotalOrderValue() {
        // When
        double result = shop.getTotalOrderValue();

        // Then
        assertEquals(1000.0, result, 0.01);
    }

}