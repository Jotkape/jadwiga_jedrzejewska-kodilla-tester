package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarConfig {
    @Bean
    public Car car() {
        String season = getSeason();

        switch (season) {
            case "Summer":
                return new Cabrio();
            case "Winter":
                return new SUV();
            default:
                return new Sedan();
        }
    }

    private String getSeason() {
        // Możesz tutaj zaimplementować logikę rozpoznawania pory roku.
        // Dla uproszczenia używamy losowego wyboru pory roku:
        String[] seasons = {"Spring", "Summer", "Autumn", "Winter"};
        return seasons[new Random().nextInt(seasons.length)];
    }
}
