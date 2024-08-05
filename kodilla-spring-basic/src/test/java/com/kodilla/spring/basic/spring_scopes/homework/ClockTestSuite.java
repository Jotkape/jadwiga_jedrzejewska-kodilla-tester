package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ClockTestSuite {

    @Test
    void testDifferentTimesInDifferentBeans() {
        // Given
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Clock.class);

        // When
        Clock firstClock = context.getBean(Clock.class);
        Clock secondClock = context.getBean(Clock.class);

        // Then
        assertNotEquals(firstClock.getTime(), secondClock.getTime());

        context.close();
    }

}