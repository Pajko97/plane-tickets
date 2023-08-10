package com.example.airline_ticketing_system.airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/airlines")

public class AirlineController {
    @Autowired
    private final AirlineService airlineService;

    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }
    @GetMapping
    public List<Integer> getAirlines() {
        return List.of(1,2,3);
    }
}


