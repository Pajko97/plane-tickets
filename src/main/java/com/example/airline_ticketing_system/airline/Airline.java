package com.example.airline_ticketing_system.airline;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Entity
public class Airline {
    @Id
    @SequenceGenerator(
            name="airline_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "airline_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String country;
    private String name;
    private String short_code;
    public Airline() {

    }
    public Airline(Long id, String country, String name, String short_code) {
        this.country = country;
        this.name = name;
        this.short_code = short_code;
        this.id = id;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_code() {
        return short_code;
    }

    public void setShort_code(String short_code) {
        this.short_code = short_code;
    }




}
