package com.tus.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tus.flight.model.Flight;
import com.tus.flight.repo.FlightRepository;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository repo;

    // GET all flights
    @GetMapping
    public List<Flight> getFlights() {
        return repo.findAll();
    }

    // GET flight by ID
    @GetMapping("/{id}")
    public Flight getFlight(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    // CREATE new flight
    @PostMapping
    public Flight addFlight(@RequestBody Flight flight) {
        return repo.save(flight);
    }

    // DELETE flight
    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
