package com.example.airline_ticketing_system.airline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(AirlineRepository repository) {
        return args -> {
            Airline was = new Airline(
                    1L,
                    "California",
                    "Washington Airlines",
                    "WAO"
            );

            Airline wasa = new Airline(
                    1L,
                    "California",
                    "Maryland Airlines",
                    "WAO"
            );

            repository.saveAll(
                    List.of(was, wasa)
            );

        };
    }
}
