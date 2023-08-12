package com.example.airline_ticketing_system.airline;

import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Table(name = "airlines")
public interface AirlineRepository extends JpaRepository<Airline, Long> {
    
}
