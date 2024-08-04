package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class SpringConfigurationTestSuite {
    @Test
    void testSendPackageSuccessfully() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);

        String result = shippingCenter.sendPackage("Main Street 1, New York", 15.0);
        assertEquals("Package delivered to: Main Street 1, New York", result);

        context.close();
    }

    @Test
    void testSendPackageFailure() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);

        String result = shippingCenter.sendPackage("Main Street 1, New York", 35.0);
        assertEquals("Package not delivered to: Main Street 1, New York", result);

        context.close();
    }

}