package com.example.airline_ticketing_system.airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AirlineService {
    private AirlineRepository airlineRepository;
    @Autowired
    public AirlineService(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    public List<Airline> getAirlines() {
        return airlineRepository.findAll();
    };

    public Airline getAirlineById(Long id) {
        return airlineRepository.getReferenceById(id)
    }


}
