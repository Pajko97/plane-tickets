package com.example.airline_ticketing_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
public class AirlineTicketingSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(AirlineTicketingSystemApplication.class, args);
    }

}
